package it.areamobile.openLab.rssFeed.RssListener;

import it.areamobile.openLab.rssFeed.R;
import it.areamobile.openLab.rssFeed.activity.FeedActivity;
import it.areamobile.openLab.rssFeed.fragment.FragmentFeed;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class listener implements OnClickListener{
	public Context c;
	private FragmentFeed frag;
	

	public listener(Context c){
		this.c=c;
	}

	
	public void onClick(View v) {
		Intent open_activity= new Intent(c, FeedActivity.class);
		
		switch (v.getId()) {
		case R.id.bt_film_start:
			((Activity)c).startActivity(open_activity);
			break;
			
		default:
			break;
		
		}
	}
}
