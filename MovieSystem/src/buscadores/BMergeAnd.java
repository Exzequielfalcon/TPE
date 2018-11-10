package buscadores;

import peliculas.Pelicula;

public class BMergeAnd implements Buscador {
	private Buscador c;
	private Buscador d;
	
	public BMergeAnd(Buscador c, Buscador d) {
		this.c = c;
		this.d = d;
	}
	
	public boolean check(Pelicula p) {
		return this.c.check(p) && this.d.check(p);
	}
}
