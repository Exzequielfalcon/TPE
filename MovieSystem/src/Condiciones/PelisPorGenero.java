package Condiciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import peliculas.Pelicula;
import users.User;

public class PelisPorGenero implements Condicion{
	
	
	
	public boolean recomendar(User u, Pelicula p){
		ArrayList<String> generospeli = new ArrayList<String>(p.getGeneros());
		ArrayList<String> generosUser = new ArrayList<String>(u.getGeneros());
		for(String i:generosUser) {
			if((generospeli.contains(i))) {
				return true;
			}
		}
		return false;
	}
}
