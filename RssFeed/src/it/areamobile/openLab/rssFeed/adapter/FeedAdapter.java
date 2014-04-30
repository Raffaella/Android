package it.areamobile.openLab.rssFeed.adapter;

import it.areamobile.openLab.rssFeed.R;
import it.areamobile.openLab.rssFeed.wrapper.Film;



import java.util.List;

import com.androidquery.AQuery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FeedAdapter  extends ArrayAdapter<Film> {
	private List<Film> list_film;
	private Context mContext;
	private int textViewResourceId;

 
	
	public FeedAdapter(Context context,int textViewResourceId,List<Film> list_film) {
		super(context, textViewResourceId, list_film);
		mContext = context;
		this.textViewResourceId=textViewResourceId;
		this.list_film=list_film;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder= new ViewHolder();
			convertView=LayoutInflater.from(mContext).inflate(textViewResourceId, null);
			holder.titolo_it= (TextView)convertView.findViewById(R.id.tv_row_feed_title);
			holder.genere= (TextView)convertView.findViewById(R.id.tv_row_feed_genere);
			holder.stato=(TextView)convertView.findViewById(R.id.tv_row_feed_stato);
			holder.img210= (ImageView)convertView.findViewById(R.id.tv_row_feed_icon);
			holder.regia = (TextView) convertView.findViewById(R.id.tv_row_feed_regia);
			holder.anno = (TextView) convertView.findViewById(R.id.tv_row_feed_anno);
			holder.votiMedia = (TextView) convertView.findViewById(R.id.tv_row_feed_voti_media);
			convertView.setTag(holder);
		}else holder=(ViewHolder)convertView.getTag();
			holder.titolo_it.setText(list_film.get(position).getTitolo());
			holder.genere.setText(list_film.get(position).getGenere());
			holder.stato.setText(list_film.get(position).getStato());
			holder.regia.setText(list_film.get(position).getRegia());
			holder.anno.setText(list_film.get(position).getAnno());
			holder.votiMedia.setText(list_film.get(position).getVotiMedia());
			AQuery aquery = new AQuery(convertView);
			aquery.id(holder.img210).image(list_film.get(position).getPoster());		
		return convertView;
		}
	
	private class ViewHolder{
		private TextView titolo_it;
		private TextView stato;
		private TextView genere;
		private TextView regia;
		private TextView anno;
		private TextView votiMedia;
		private ImageView img210;
	}
	
	public List<Film >getItems() {
		return list_film;
	}
	
	}
	
	


