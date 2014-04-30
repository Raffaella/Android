package it.areamobile.openLab.rssFeed.task;


import it.areamobile.openLab.rssFeed.fragment.FragmentFeed;
import it.areamobile.openLab.rssFeed.wrapper.Film;
import it.areamobile.openLab.rssFeed.wrapper.FilmContainer;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

public class FeedTask extends AsyncTask<Void, Void, FilmContainer>{
	private FragmentFeed fragment_feed;
	private ProgressDialog dialog;
	private final static String myURL = "http://www.primissima.it/xml/iphone2011/insala/";

	
	public FeedTask(FragmentFeed fragmentFeed) {
		this.fragment_feed = fragmentFeed;
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		dialog= ProgressDialog.show(fragment_feed.getActivity(), "download", "sto scaricando i film");
		
	}

	@Override
	protected FilmContainer doInBackground(Void... params) {
		Reader reader = getReader();
		FilmContainer container = null;
		Serializer serializer = new Persister();
		try {
			container = (FilmContainer)serializer.read(
					FilmContainer.class, reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return container;
	}

	@Override
	protected void onPostExecute(FilmContainer result) {
		super.onPostExecute(result);
		dialog.dismiss();
		fragment_feed.createAdapter(result.getFilms());
			}
	
	/*Restituisce uno input stream tramite cui effettuare il parsing XML*/
	private static Reader getReader() {
		Reader reader = null;
		URL url;
		try {
			url = new URL(myURL);
			reader = new InputStreamReader(url.openStream());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return reader;
	}

	
}
