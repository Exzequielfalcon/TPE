package buscadores;

import peliculas.Pelicula;

public class BPorAnioMenor implements Buscador{
	
	private int anio;
	
	public BPorAnioMenor(int anio) {
		this.anio=anio;
	}
	
	public boolean check(Pelicula p) {
		return p.getAnio()<=anio;
	}
}
