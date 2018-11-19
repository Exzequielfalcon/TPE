package buscadores;

import peliculas.Pelicula;

public class BPorDirector implements Buscador {
private String director;
	
	public BPorDirector(String director) {
		this.director=director;
	}
	
	public boolean check(Pelicula p) {
		return p.contieneDirector(director);
	}
}
