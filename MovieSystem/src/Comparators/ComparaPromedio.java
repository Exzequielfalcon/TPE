package Comparators;

import peliculas.Pelicula;

public class ComparaPromedio extends Compara {
	public int compare(Pelicula p1, Pelicula p2) {
		return Double.compare(p1.getClasificacion(), p2.getClasificacion());	
	}
}
