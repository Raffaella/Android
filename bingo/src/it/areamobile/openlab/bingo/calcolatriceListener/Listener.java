package it.areamobile.openlab.bingo.calcolatriceListener;

import it.areamobile.openlab.bingo.R;
import it.areamobile.openlab.bingo.activity.CalcolatriceActivity2;
import it.areamobile.openlab.bingo.fragment.FragmentHome2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;


public class Listener implements OnClickListener {
	 public Context c;
	 private EditText primo;
	 private EditText secondo;
	 private int risultato;
	 private FragmentHome2 frag;
	 int n_primo;
	 int n_secondo;
	 
	 
	
	 
	public Listener(Context c,EditText primo,EditText secondo, FragmentHome2 frag){
			this.c=c;
			this.primo=primo;
			this.secondo=secondo;
			this.frag=frag;
		}

	public void onClick(View v) {
		Intent open_activity= new Intent(c,CalcolatriceActivity2.class);
		
		if((primo.getText().toString().compareTo("")==0) || (secondo.getText().toString().compareTo("")==0)){	
			Toast.makeText(c," campo vuoto",Toast.LENGTH_SHORT ).show();
		}else{
			n_primo= Integer.parseInt(primo.getText().toString());
			n_secondo=Integer.parseInt(secondo.getText().toString());
			
					 switch (v.getId()) {
						case R.id.bt_somma:
							risultato =n_primo + n_secondo;
							primo.setText(null);
							secondo.setText(null);
							if(frag==null){
								open_activity.putExtra("risultato", risultato);
								((Activity)c).startActivity(open_activity);
							}else
							frag.setText(risultato);
							break;
							
						case R.id.bt_sottrazione:
							risultato= n_primo - n_secondo;
							primo.setText(null);
							secondo.setText(null);
							if(frag==null){
								open_activity.putExtra("risultato", risultato);
								((Activity)c).startActivity(open_activity);
							}else
							frag.setText(risultato);
							break;
							
						case R.id.bt_divisione:
							risultato= n_primo / n_secondo;
							primo.setText(null);
							secondo.setText(null);
							if(frag==null){
								open_activity.putExtra("risultato", risultato);
								((Activity)c).startActivity(open_activity);
							}else
							frag.setText(risultato);
							break;
							
						case R.id.bt_moltiplicazione:
							primo.setText(null);
							secondo.setText(null);
							risultato = n_primo * n_secondo;
							if(frag==null){
								open_activity.putExtra("risultato", risultato);
								((Activity)c).startActivity(open_activity);
							}else
							frag.setText(risultato);
							break;
						default:
							break;
						}
						
		}
		
		
	}
	
	
	

}
