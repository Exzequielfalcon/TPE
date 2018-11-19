package buscadores;

import peliculas.Pelicula;

public class BPorActor implements Buscador{
	private String actor;
	
	public BPorActor(String actor) {
		this.actor=actor;
	}
	
	public boolean check(Pelicula p) {
		return p.contieneActor(actor);
	}
}	
