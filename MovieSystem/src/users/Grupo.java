package users;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import peliculas.Pelicula;

public class Grupo extends User {
	private HashSet<User> usuarios = new HashSet<User>();
	
	public Grupo(String nombre,User miembro) {
		this.nombre= nombre;
		this.usuarios.add(miembro);
	}

	
	public void addUser(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void verPelicula(Pelicula p) {
		pelisvistas.add(p);
		for (User i : usuarios) { 
			i.verPelicula(p);
		}
	}
	
	public HashSet<String> getGeneros(){
		HashSet<String> aux = new HashSet<>();
		for (User i : usuarios) { 
			ArrayList<String> generos = new ArrayList<String>(i.getGeneros());
			for(String j: generos) {
				aux.add(j);
			}
		}
		return aux;
	}
	
	public void setMovieRate(Pelicula p, int clasificacion) {
		p.setClasificacion(this, clasificacion);
	}
	
	
	public Iterator<Pelicula> getPelisVistas(){
		HashSet<Pelicula> aux = new HashSet<>();
		for (User i : usuarios) { 
			Iterator<Pelicula> pelis = i.getPelisVistas();
			while(pelis.hasNext()) {
				aux.add(pelis.next());
			}
		}
		return aux.iterator();
	}
	
	public boolean vioPelicula(Pelicula p) {
		for (User u:usuarios) {
			if(!(u.vioPelicula(p))) {
				return false;
			}
		}
		return true;
	}
}
