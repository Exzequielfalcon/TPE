package Condiciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import peliculas.Pelicula;
import users.User;

public class AllGeneros implements Condicion {
	
	public AllGeneros() {
				
	}
	
	public boolean recomendar(User u, Pelicula p){
		ArrayList<String> generosUser = new ArrayList<String>(u.getGeneros());
		for(String i:generosUser) {
			if(!(p.contieneGenero(i))) {
				return false;
			}
		}
		return true;
	}
}