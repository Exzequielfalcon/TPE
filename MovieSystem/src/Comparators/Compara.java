package Comparators;

import java.util.Comparator;

import peliculas.Pelicula;

public abstract class Compara implements Comparator<Pelicula>{
	public abstract int compare(Pelicula p1, Pelicula p2);
}
