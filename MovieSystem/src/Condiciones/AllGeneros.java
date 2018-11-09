package Condiciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import peliculas.Pelicula;
import users.User;

public class AllGeneros implements Condicion {
	
	public List<Pelicula> getPelis(User u, List<Pelicula> peliculas){
		ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
		HashSet<String> generosUser = new HashSet<String>(u.getGeneros());
		boolean c=true;
		for (Pelicula p:peliculas) {
			c=true;
			for (String i:generosUser) {
				ArrayList<String> generospeli = new ArrayList<String>(p.getGeneros());
				if(!(generospeli.contains(i))) {
					c=false;
					break;
				}
			}
			if (c==true) {
				pelis.add(p);
			}
		}
		return pelis;
	}
	
}