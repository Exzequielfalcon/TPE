package Condiciones;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import peliculas.Pelicula;
import users.User;

public interface Condicion {
	public abstract boolean getPelis(List<String> generosuser, List<String> generospelis);
}
