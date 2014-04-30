package it.areamobile.openLab.rssFeed.fragment;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import it.areamobile.openLab.rssFeed.activity.FeedActivity;
import it.areamobile.openLab.rssFeed.adapter.FeedAdapter;

import it.areamobile.openLab.rssFeed.task.FeedTask;
import it.areamobile.openLab.rssFeed.wrapper.Film;
import it.areamobile.openLab.rssFeed.BaseActivity;
import it.areamobile.openLab.rssFeed.R;
import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class FragmentFeed extends ListFragment {
	private FeedTask task;
		private static final String TAG_INTENT = "key";
	private View v;
	private FeedAdapter mfAdapter;
	private List<Film> list_film;
	private FragmentFeed fragment_feed;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {	
		Log.i("FragmentFeed","onCreateView");
		super.onCreateView(inflater, container, savedInstanceState);
		 v = inflater.inflate(R.layout.feed, container);
		return v;
	}
	
	@SuppressWarnings("unchecked")
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		Log.i("FragmentFeed","onActivityCreated");
		list_film=null;
		registerForContextMenu(getListView());
		
		if(savedInstanceState!=null){
			this.list_film= (List<Film>)savedInstanceState.getSerializable(TAG_INTENT);
		//	this.createAdapter(list_film);
		}else{
			this.list_film= new LinkedList<Film>();
			task= new FeedTask(this);
			task.execute();
		}
		
	}
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i("FragmentFeed","onCreate");
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Film film = (Film)l.getAdapter().getItem(position);
		if(fragment_feed==null || !fragment_feed.isInLayout()){
			Intent intent = new Intent(getActivity(), FeedActivity.class);
			intent.putExtra(TAG_INTENT, (Serializable)film);
			getActivity().startActivity(intent);
		}
	}

	public void createAdapter(List<Film> list_film) {
		mfAdapter= new FeedAdapter(getActivity(), R.layout.row_feed, list_film);
		setListAdapter(mfAdapter);
		list_film = ((FeedAdapter) getListAdapter()).getItems();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putSerializable(TAG_INTENT, (Serializable) list_film);
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
		Log.i("FragmentFeed", "onDetach");
		setListAdapter(null);
		((FeedActivity) getActivity()).stopProgressDialog();
		//set to null every object field that 
		//may retain the current activity

	}
	
}
