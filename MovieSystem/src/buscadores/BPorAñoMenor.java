package buscadores;

import peliculas.Pelicula;

public class BPorAñoMenor implements Buscador{
	
	private int año;
	
	public BPorAñoMenor(int año) {
		this.año=año;
	}
	
	public boolean check(Pelicula p) {
		return p.getAño()<=año;
	}
}
