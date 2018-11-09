package Condiciones;
import java.util.Iterator;
import java.util.List;

import peliculas.Pelicula;
import users.User;

public interface Condicion {
	public abstract List<Pelicula> getPelis(User u, List<Pelicula> pelis);
}
