package it.areamobile.openLab.rssFeed.fragment;


import it.areamobile.openLab.rssFeed.R;
import it.areamobile.openLab.rssFeed.RssListener.listener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FragmentFilm extends Fragment {
	private View v = null;
	private Button bottone_exit=null;
	private Button bottone_start= null;
	private FragmentFeed frag=null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//super.onCreateView(inflater, container, savedInstanceState);
		v= inflater.inflate(R.layout.film, container);
		bottone_exit=(Button)v.findViewById(R.id.bt_film_exit);
		bottone_start=(Button)v.findViewById(R.id.bt_film_start);
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		frag=(FragmentFeed)getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment_feed);
		bottone_start.setOnClickListener(new listener(getActivity()));

		bottone_exit.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				(getActivity()).finish();

			}
		}
				);
	}


}
