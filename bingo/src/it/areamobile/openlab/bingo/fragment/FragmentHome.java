package it.areamobile.openlab.bingo.fragment;

import it.areamobile.openlab.bingo.R;
import it.areamobile.openlab.bingo.calcolatriceListener.Listener;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentHome extends Fragment{
	private View v = null;
	private EditText numero_primo=null;
	private EditText numero_secondo=null;
	private Button bottone_somma=null;
	private Button bottone_sottrazione= null;
	private Button bottone_divisione=null;
	private Button bottone_moltiplicazione=null;
	private Button bottone_exit=null;
	private Button bottone_canc=null;
	private FragmentHome2 frag=null;
	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//super.onCreateView(inflater, container, savedInstanceState);
		v= inflater.inflate(R.layout.home, container);
		bottone_somma=(Button)v.findViewById(R.id.bt_somma);
		bottone_sottrazione=(Button)v.findViewById(R.id.bt_sottrazione);
		bottone_divisione=(Button)v.findViewById(R.id.bt_divisione);
		bottone_moltiplicazione=(Button)v.findViewById(R.id.bt_moltiplicazione);
		bottone_exit=(Button)v.findViewById(R.id.bt_exit);
		if(frag!=null){
			bottone_canc = (Button) v.findViewById(R.id.bt_canc);	
		}
		
		numero_primo=(EditText)v.findViewById(R.id.et_primo);
		numero_secondo=(EditText)v.findViewById(R.id.et_secondo);
		return v;
	}


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		frag=(FragmentHome2) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment_home_activity2);
		
			bottone_somma.setOnClickListener(new Listener(getActivity(),numero_primo,numero_secondo,frag));
			bottone_sottrazione.setOnClickListener(new Listener(getActivity(),numero_primo,numero_secondo,frag));
			bottone_divisione.setOnClickListener(new Listener(getActivity(),numero_primo,numero_secondo,frag));
			bottone_moltiplicazione.setOnClickListener(new Listener(getActivity(),numero_primo,numero_secondo,frag));
			
			if(frag!=null){
				bottone_canc.setOnClickListener(new OnClickListener(){

					public void onClick(View v) {
						numero_primo.setText(null);
						numero_secondo.setText(null);
					}
				}
				);
			}
			
			
			bottone_exit.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					(getActivity()).finish();
					
				}
			}
			);
	}
}
