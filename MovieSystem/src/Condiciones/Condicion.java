package Condiciones;
import java.util.Iterator;

import peliculas.Pelicula;
import users.User;

public interface Condicion {
	public abstract Iterator<Pelicula> getPelis(User u, Iterator<Pelicula> pelis);
}
