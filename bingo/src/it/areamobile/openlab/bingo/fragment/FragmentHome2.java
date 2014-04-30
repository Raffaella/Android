package it.areamobile.openlab.bingo.fragment;

import it.areamobile.openlab.bingo.R;
import it.areamobile.openlab.bingo.calcolatriceListener.Listener;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentHome2 extends Fragment {
	private int risultato;
	private View v=null;
	private Button back =null;
	private TextView tx_risultato=null;
	private Button bottone_back;
	
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//super.onCreateView(inflater, container, savedInstanceState);
		v=inflater.inflate(R.layout.home_activity2, container);
		back= (Button)v.findViewById(R.id.bt_back);
		tx_risultato=(TextView)v.findViewById(R.id.tv_risultato);
		bottone_back=(Button)v.findViewById(R.id.bt_back);
		return v;
	}


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Intent ris;
		risultato=0;
		if ((ris= getActivity().getIntent())!=null){
			risultato=ris.getIntExtra("risultato", 0);
		}
		//tx_risultato.setText(R.string.risultato+risultato);
		setText(risultato);
		if(bottone_back!=null){
			bottone_back.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					
					getActivity().finish();
					
				}
			});
		}
		
	}
	
	public void setText(int risultato){
		tx_risultato.setText(" "+risultato);
	}
	
	
	
	
	

}
