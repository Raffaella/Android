package it.areamobile.openLab.rssFeed.wrapper;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="film")
public class Film {
	
	@Element(name="idfilm", required=false)
	private String id;
	@Element(name="titolo_it", required=false)
	private String titolo;
	@Element(name="stato", required=false)
	private String stato;
	@Element(name="genere", required=false)
	private String genere;
	@Element(name="regia", required=false)
	private String regia;
	@Element(name="trama", required=false)
	private String trama;
	@Element(name="img210", required=false)
	private String poster;
	@Element(name="img105", required=false)
	private String locandina;
	@ElementList (entry="url_trailer", inline=true, required=false)
	private List<String> trailers;
	@Element(name="titolo_originale", required=false)
	private String titoloOriginale;
	@Element(name="nazione", required=false)
	private String nazione;
	@Element(name="anno", required=false)
	private String anno;
	@Element(name="distribuzione", required=false)
	private String distribuzione;
	@Element(name="cast", required=false)
	private String cast;
	@Element(name="data_uscita", required=false)
	private String dataUscita;
	@Element(name="voti_media", required=false)
	private String votiMedia;
	@Element(name="voti_numero", required=false)
	private String votiNumero;
	@Element (name ="durata", required=false)
	private String durata;
	@Element (name ="url_sito_ufficiale", required=false)
	private String urlSitoUfficiale;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getRegia() {
		return regia;
	}

	public void setRegia(String regia) {
		this.regia = regia;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getLocandina() {
		return locandina;
	}

	public void setLocandina(String locandina) {
		this.locandina = locandina;
	}

	public List<String> getTrailers() {
		return trailers;
	}

	public void setTrailers(List<String>trailers) {
		this.trailers = trailers;
	}

	public String getTitoloOriginale() {
		return titoloOriginale;
	}

	public void setTitoloOriginale(String titoloOriginale) {
		this.titoloOriginale = titoloOriginale;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getDistribuzione() {
		return distribuzione;
	}

	public void setDistribuzione(String distribuzione) {
		this.distribuzione = distribuzione;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getDataUscita() {
		return dataUscita;
	}

	public void setDataUscita(String dataUscita) {
		this.dataUscita = dataUscita;
	}

	public String getVotiMedia() {
		return votiMedia;
	}

	public void setVotiMedia(String votiMedia) {
		this.votiMedia = votiMedia;
	}

	public String getVotiNumero() {
		return votiNumero;
	}

	public void setVotiNumero(String votiNumero) {
		this.votiNumero = votiNumero;
	}

	public String getDurata() {
		return durata;
	}

	public void setDurata(String durata) {
		this.durata = durata;
	}

	public String getUrlSitoUfficiale() {
		return urlSitoUfficiale;
	}

	public void setUrlSitoUfficiale(String urlSitoUfficiale) {
		this.urlSitoUfficiale = urlSitoUfficiale;
	}
	
	public String toString()
	{
		return 
				"Titolo: "  + titolo + "\n" + 
				"stato: " + stato + "\n" + 
				"genere: " + genere + "\n" +
				"regia: " + regia + "\n" + 
				"trama: " + trama + "\n" +
				"locandina: " + locandina + "\n" + 
				"genere: " + genere + "\n" + 
				"etc...";
				
	}
	

}
