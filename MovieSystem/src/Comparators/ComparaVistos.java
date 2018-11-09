package Comparators;

import peliculas.Pelicula;

public class ComparaVistos extends Compara {
	public int compare(Pelicula p1, Pelicula p2) {
			return Integer.compare(p1.getCantdevotos(), p2.getCantdevotos());
	}
}
