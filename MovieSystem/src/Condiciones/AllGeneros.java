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
	
	public boolean getPelis(List<String> generosuser, List<String> generospelis){
		for(String i:generosuser) {
			if(!(generospelis.contains(i))) {
				return false;
			}
		}
		return true;
	}
}