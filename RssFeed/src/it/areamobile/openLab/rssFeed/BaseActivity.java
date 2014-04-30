package it.areamobile.openLab.rssFeed;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;



public class BaseActivity extends FragmentActivity {

	private static boolean isAboveGinger = true;

	static {
		try {
			Activity.class.getMethod("getActionBar");
		} catch (NoSuchMethodException nsme) {
			isAboveGinger = false;
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	public static boolean hasActionBar() {
		return isAboveGinger;
	}

}
