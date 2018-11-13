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
	private Compara compare;
	private Condicion condicion;
	
	public Sistema(Compara compare, Condicion c) {
		this.compare=compare;
		this.condicion=c;
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
	
	public List<User> getUsuarios(){
		return new ArrayList<User>(this.usuarios);
	}
	
	public List<Pelicula> recoPelicula(User u, int limite){
		return recoPelicula(u,limite,this.compare,this.condicion);
	}
	
	public List<Pelicula> recoPelicula(User u, int limite, Compara compare, Condicion c){
		ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
		for (Pelicula p:peliculas) {
			if(!(u.vioPelicula(p)) && (c.recomendar(u,p))) {
					pelis.add(p);
				}
		}
		Collections.sort(pelis, compare.reversed());
		if (pelis.size()>limite) {
			pelis.subList(0, limite);
		}
		return pelis;
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
