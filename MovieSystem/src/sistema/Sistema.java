package sistema;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import Comparators.Compara;
import Comparators.ComparaPromedio;
import Condiciones.Condicion;
import peliculas.Pelicula;
import users.Grupo;
import users.User;
import users.Usuario;

public class Sistema {
	private HashSet<Pelicula> peliculas = new HashSet<>();
	private HashSet<User> usuarios = new HashSet<>();
	
	public Sistema() {
	}
	
	
	public void addUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void addPelicula(Pelicula p) {
		this.peliculas.add(p);
	}
	
	public void addGrupo(Grupo g) {
		this.usuarios.add(g);
	}
	
	public void addUser(Usuario u) {
		this.usuarios.add(u);
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
	
	public Iterator<Pelicula> recoPelicula(User u, int limite, Compara compare, Condicion c){
		Iterator<Pelicula> pelis = c.getPelis(u, this.getPeliculas());
		Collections.sort(pelis, compare);
		return pelis.iterator();
	}
	
	public Iterator<Pelicula> getPeliculas(){
		return this.peliculas.iterator();
	}

}
