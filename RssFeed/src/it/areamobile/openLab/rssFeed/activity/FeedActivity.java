package it.areamobile.openLab.rssFeed.activity;

import it.areamobile.openLab.rssFeed.BaseActivity;
import it.areamobile.openLab.rssFeed.R;

import java.lang.reflect.Method;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;


public class FeedActivity extends BaseActivity {

	private ProgressDialog dialog;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_feed);
		Log.i("FeedActivity", "after setContentView");

		if (BaseActivity.hasActionBar()){
			try {
				Class<?> c = getClass();
				Method m= c.getMethod("getActionBar");
				Class<?> actionClass = Class.forName("android.app.ActionBar");
				Object actionBar = m.invoke(this);
				actionClass.cast(actionBar);
			}catch (NoSuchMethodException nsme) {
				return;
			}catch (Exception e) { 			
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("Feed Activity", "onDestroy");
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i("Feed Activity", "onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i("Feed Activity", "onStop");
	}

	public void startProgressDialog(){
		dialog = ProgressDialog.show(this, "Please, wait...", "Something is downloading");	
	}

	public void stopProgressDialog(){
		if (dialog != null)
			dialog.dismiss();
	}

	
}


