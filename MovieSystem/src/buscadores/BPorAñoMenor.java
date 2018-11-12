package buscadores;

import peliculas.Pelicula;

public class BPorA�oMenor implements Buscador{
	
	private int a�o;
	
	public BPorA�oMenor(int a�o) {
		this.a�o=a�o;
	}
	
	public boolean check(Pelicula p) {
		return p.getA�o()<=a�o;
	}
}
