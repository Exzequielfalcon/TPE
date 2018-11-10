package buscadores;

import peliculas.Pelicula;

public class BMergeOr implements Buscador {
	private Buscador c;
	private Buscador d;
	
	public BMergeOr(Buscador c, Buscador d) {
		this.c = c;
		this.d = d;
	}
	
	public boolean check(Pelicula p) {
		return this.c.check(p) || this.d.check(p);
	}
}
