package buscadores;

import peliculas.Pelicula;

public class BPorAnioMayor implements Buscador{
	
	private int anio;
	
	public BPorAnioMayor(int anio) {
		this.anio=anio;
	}
	
	public boolean check(Pelicula p) {
		return p.getAnio()>=anio;
	}
}