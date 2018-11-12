package buscadores;

import peliculas.Pelicula;

public class BPorAñoMayor implements Buscador{
	
	private int año;
	
	public BPorAñoMayor(int año) {
		this.año=año;
	}
	
	public boolean check(Pelicula p) {
		return p.getAño()>=año;
	}
}