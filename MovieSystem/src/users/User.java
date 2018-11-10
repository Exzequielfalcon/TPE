package users;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import peliculas.Pelicula;

public abstract class User {
	protected String nombre;
	protected HashSet<String> generosfav = new HashSet();  //Generos favoritos
	protected HashSet<Pelicula> pelisvistas =new HashSet(); //Peliculas Vistas
	
	public abstract HashSet getGeneros();
	public abstract void setMovieRate(Pelicula p, int clasificacion);
	public abstract void verPelicula(Pelicula p);
	public abstract Iterator getPelisVistas();
	public abstract boolean vioPelicula(Pelicula p);
}
