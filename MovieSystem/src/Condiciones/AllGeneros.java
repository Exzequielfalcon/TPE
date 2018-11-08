package Condiciones;

import java.util.ArrayList;
import java.util.Iterator;

import peliculas.Pelicula;
import users.User;

public class AllGeneros implements Condicion {
	
	public Iterator<Pelicula> getPelis(User u, Iterator<Pelicula> peliculas){
		ArrayList<Pelicula> pelis = new ArrayList();
		Iterator<String> generosUser = u.getGeneros();
		while(generosUser.hasNext()) {
			while(peliculas.hasNext()) {
				Iterator<String> generosPeli = peliculas.next().getGeneros();
					while(generosPeli.hasNext()) {
						if(generosPeli.next()==generosUser.next()) {
							pelis.add(peliculas.next());
						}
					}
			}
		}
		return pelis.iterator();
	}
}
