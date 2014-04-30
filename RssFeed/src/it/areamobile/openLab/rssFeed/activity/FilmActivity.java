package it.areamobile.openLab.rssFeed.activity;


import it.areamobile.openLab.rssFeed.BaseActivity;
import it.areamobile.openLab.rssFeed.R;

import java.lang.reflect.Method;

import android.os.Bundle;
import android.util.Log;



public class FilmActivity extends BaseActivity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.i("FilmActivity", "after setContentView");

		//Gestione dell'action bar mediante riflessione
		//necessario per garantire la portabilitˆ del codice
		//con device "legacy"

		if (BaseActivity.hasActionBar())
		{
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


}
