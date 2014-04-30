package it.areamobile.openLab.rssFeed.wrapper;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;


@Root(name="list")
public class FilmContainer {
	
	@ElementList(inline=true)
	private List<Film> films;

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

}
