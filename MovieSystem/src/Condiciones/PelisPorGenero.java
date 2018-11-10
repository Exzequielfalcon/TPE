package Condiciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import peliculas.Pelicula;
import users.User;

public class PelisPorGenero implements Condicion{
	
	
	
	public boolean getPelis(List<String> generosuser, List<String> generospelis){
		for(String i:generosuser) {
			if((generospelis.contains(i))) {
				return true;
			}
		}
		return false;
	}
}
