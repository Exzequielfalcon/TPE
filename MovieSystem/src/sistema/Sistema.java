package sistema;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import Comparators.Compara;
import Comparators.ComparaPromedio;
import Condiciones.Condicion;
import buscadores.Buscador;
import peliculas.Pelicula;
import users.Grupo;
import users.User;
import users.Usuario;

public class Sistema {
	private HashSet<Pelicula> peliculas = new HashSet<>();
	private HashSet<User> usuarios = new HashSet<>();
	
	public Sistema() {
	}
	
	
	public void addUser(User u) {
		this.usuarios.add(u);
	}
	
	public void addPelicula(Pelicula p) {
		this.peliculas.add(p);
	}
	
	public void verPelicula(Usuario u,Pelicula p, int clasif) {
		u.verPelicula(p);
		u.setMovieRate(p, clasif);
	}
	
	public int CantidadVotos(Pelicula p) {
		return p.getCantdevotos();
	}
	
	public double PromedioClasf(Pelicula p) {
		return p.getClasificacion();
	}
	
	public List<Pelicula> recoPelicula(User u, int limite, Compara compare, Condicion c){
		HashSet<Pelicula> pelis = new HashSet<Pelicula>();
		ArrayList<String> generosUser = new ArrayList<String>(u.getGeneros());
		for (Pelicula p:peliculas) {
			if(!(u.vioPelicula(p))) {
				ArrayList<String> generospeli = new ArrayList<String>(p.getGeneros());
				if(c.getPelis(generosUser,generospeli)) {
					pelis.add(p);
				}
			}	
		}
		ArrayList<Pelicula> peliscut =new ArrayList<Pelicula>(pelis);
		Collections.sort(peliscut, compare);
		if (peliscut.size()>=limite) {
			peliscut.subList(0, limite);
		}
		return peliscut;
	}
	
	public List<Pelicula> buscarPelicula(Buscador b){
		ArrayList<Pelicula> peli = new ArrayList<Pelicula>();
		for(Pelicula p:peliculas) {
			if (b.check(p)) {
				peli.add(p);
			}
		}
		return peli;
	}
	
	public List<Pelicula> getPeliculas(){
		return new ArrayList<Pelicula>(this.peliculas);
	}

}
