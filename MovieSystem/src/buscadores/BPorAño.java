package buscadores;

import peliculas.Pelicula;

public class BPorAño implements Buscador{
	
	private int año;
	
	public BPorAño(int año) {
		this.año=año;
	}
	
	public boolean check(Pelicula p) {
		return p.getAño()<=año;
	}
}
