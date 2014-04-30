package it.areamobile.openLab.rssFeed.activity;

import java.lang.reflect.Method;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import it.areamobile.openLab.rssFeed.BaseActivity;
import it.areamobile.openLab.rssFeed.R;
//import it.areamobile.openLab.rssFeed.R;
import it.areamobile.openLab.rssFeed.activity.FeedActivity;;


public class DetailActivity extends BaseActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_detail);
		useActionBar();
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			final Intent intent = new Intent(this, FeedActivity.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
			startActivity(intent);
			return true;
		default: return super.onMenuItemSelected(featureId, item);
		}
	}
	
	private void useActionBar() {
		if (BaseActivity.hasActionBar()) {
			try 
			{
				Class<?> actionBarClass = Class.forName("android.app.ActionBar");
				Object o = Activity.class.getMethod("getActionBar").invoke(this);
				Object actionBarInstance = actionBarClass.cast(o);
				Method setDisplayHomeAsUpEnabled = actionBarInstance.getClass().getMethod("setDisplayHomeAsUpEnabled", boolean.class);
				setDisplayHomeAsUpEnabled.invoke(actionBarInstance, true);
				Method setTitle = actionBarInstance.getClass().getMethod("setTitle", CharSequence.class);
				setTitle.invoke(actionBarInstance, "");
			} catch (NoSuchMethodException nsme)
			{
				return;
			} catch (Exception otherExceptions)
			{
				otherExceptions.printStackTrace();

			}
		}
	}
	

}
