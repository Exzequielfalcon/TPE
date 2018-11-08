package Comparators;

import peliculas.Pelicula;

public class ComparaVistos extends Compara {
	public int compare(Pelicula p1, Pelicula p2) {
			int resultado = 0;
			if (p1.getCantdevotos() < p2.getCantdevotos()) {
				resultado = -1;
			} else if (p1.getCantdevotos() > p2.getCantdevotos()) {
				resultado = 1;
			}
			return Math.round(resultado);
	}
}
