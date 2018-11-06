import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Grupo extends User {
	private HashSet<User> usuarios = new HashSet<User>();
	
	public Grupo(String nombre,User miembro) {
		this.nombre= nombre;
		this.usuarios.add(miembro);
	}

	
	public void addUser(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void VerPelicula(Pelicula p) {
		pelisvistas.add(p);
		for (User i : usuarios) { 
			i.VerPelicula(p);
		}
	}
	
	public Iterator<String> getGeneros(){
		HashSet<String> aux = new HashSet<>();
		for (User i : usuarios) { 
			Iterator<String> generos = i.getGeneros();
			while(generos.hasNext()) {
				aux.add(generos.next());
			}
		}
		return aux.iterator();
	}
	
	public void ClasificarPeli(Pelicula p, int clasificacion) {
//		for (int i=0;i<usuarios.size();i++) {
//			p.setClasificacion(usuarios.get(i),clasificacion);
//		}
		p.setClasificacion(this, clasificacion);
	}
	
	/*
	public ArrayList<Pelicula> getPelisVistas(){
		ArrayList<Pelicula> aux = new ArrayList();
		aux.addAll(pelisvistas);
		for (int i=0;i<usuarios.size();i++) {
			for (int j=0;j<usuarios.get(i).getPelisVistas().size();j++) {
				if (!(aux.contains(usuarios.get(i).getPelisVistas().get(j)))) {
					aux.add(usuarios.get(i).getPelisVistas().get(j));
				}
			}
		}
		
		return aux;
	}
	*/
	
	public Iterator<Pelicula> getPelisVistas(){
		return this.pelisvistas.iterator();
	}
	
	
}
