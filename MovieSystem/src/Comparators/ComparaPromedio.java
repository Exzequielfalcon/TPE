package Comparators;

import peliculas.Pelicula;

public class ComparaPromedio extends Compara {
	public int compare(Pelicula p1, Pelicula p2) {
		return Double.compare(p1.getClasificacion(), p2.getClasificacion());	
		//int resultado = 0;
		//if (p1.getClasificacion() < p2.getClasificacion()) {
		//	resultado = -1;
		//} else if (p1.getClasificacion() > p2.getClasificacion()) {
		//	resultado = 1;
		//}
		//return Math.round(resultado);
	}
}
