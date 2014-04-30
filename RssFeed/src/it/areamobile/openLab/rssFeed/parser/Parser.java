package it.areamobile.openLab.rssFeed.parser;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import android.view.View;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.util.XmlDom;

import it.areamobile.openLab.rssFeed.adapter.FeedAdapter;
import it.areamobile.openLab.rssFeed.fragment.FragmentFeed;
//import it.areamobile.openLab.rssFeed.wrapper.Feed;


public class Parser {
	/*private String address;
	private FragmentFeed fragment_list;
	private AjaxCallback<XmlDom> call_back;
	//private FeedList feed_list;
	private LinkedList<Feed> list_feed;
	private FeedAdapter adapter;

	public Parser(String adress, FragmentFeed fragment_list,LinkedList<Feed> list_feed,FeedAdapter adapter){
		this.address= adress;
		this.list_feed= new LinkedList<Feed>();
		this.fragment_list= fragment_list;
		this.adapter=adapter;
	}

	public void onFeedExecute(){
		View v= fragment_list.getView();
		AQuery aquery = new AQuery(v);
	
	call_back= new AjaxCallback<XmlDom>(){

		@Override
		public void callback(String arg0, XmlDom arg1, AjaxStatus arg2) {
			super.callback(arg0, arg1, arg2);
			System.out.println("sono entrato");
			List<XmlDom> lista = arg1.tags("film");
			for(XmlDom list: lista){
				Feed feed= new Feed();
				feed.setIdfilm(Integer.parseInt(list.text("idfilm")));
				feed.setTitolo_it(list.text("titolo_id"));
				feed.setAnno(Integer.parseInt(list.text("anno")));
				feed.setCast(list.text("cast"));
				feed.setData_uscita(list.text("data_uscita"));
				feed.setDistribuzione(list.text("distribuzione"));
				feed.setGenere(list.text("genere"));
				feed.setNazione(list.text("nazione"));
				feed.setRegia(list.text("regia"));
				feed.setStato(list.text("stato"));
				feed.setTitolo_originale(list.text("titolo_originale"));
				feed.setTrama(list.text("trama"));
				feed.setVoti_media(Double.parseDouble(list.text("voti_media")));
			    feed.setVoti_numero(Integer.parseInt(list.text("voti_numero")));
				feed.setImg210(list.text("img210"));
				feed.setImg105(list.text("img105"));
				feed.setCast(list.text("cast"));
				List<String> list_trailer = new LinkedList<String>();
				Iterator<XmlDom> it = list.tags("url_trailer").iterator();
				while(it.hasNext()){
					list_trailer.add(it.next().text());
				}
				feed.setUrl_trailer(list_trailer);
				adapter.add(feed);
			}
			adapter.notifyDataSetChanged();
		}
		
		
	};
	
	aquery.ajax(address, XmlDom.class, call_back );
}*/
}

