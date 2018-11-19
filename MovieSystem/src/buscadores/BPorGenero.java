package buscadores;

import peliculas.Pelicula;

public class BPorGenero implements Buscador{
	private String genero;
	
	public BPorGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean check(Pelicula p) {
		return p.contieneGenero(genero);
	}
}
