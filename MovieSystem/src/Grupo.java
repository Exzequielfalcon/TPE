import java.util.ArrayList;
import java.util.List;

public class Grupo extends User {
	private ArrayList<Usuario> usuarios;
	
	public void Grupo(String nombre,Usuario miembro) {
		this.nombre= nombre;
		this.usuarios.add(miembro);
	}
	
	public void Grupo(String nombre, Grupo c) {
		this.nombre = nombre;
		this.usuarios.addAll(c.getUsuarios());
	}
	
	public void Añadirusuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public ArrayList<Usuario> getUsuarios() {
		ArrayList<Usuario> aux = new ArrayList();
		aux.addAll(usuarios);
		return aux;
	}
	
	public void VerPelicula(Pelicula p) {
		pelisvistas.add(p);
		for(int i=0;i<usuarios.size();i++) {
			usuarios.get(i).VerPelicula(p);
		}
	}
	
	public ArrayList<String> getGeneros(){
		ArrayList<String> aux = new ArrayList();
		for (int i=0;i<usuarios.size();i++) {
			for(int j=0;j<usuarios.get(i).getGeneros().size();j++) {
				if(!(aux.contains(usuarios.get(i).getGeneros().get(j)))) {
					aux.add(usuarios.get(i).getGeneros().get(j));
				}
			}
			
		}
		return aux;
	}
	
	public void ClasificarPeli(Pelicula p, int clasificacion) {
		for (int i=0;i<usuarios.size();i++) {
			p.setClasificacion(usuarios.get(i),clasificacion);
		}
		
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
	
	public ArrayList<Pelicula> getPelisVistas(){
		ArrayList<Pelicula> aux = new ArrayList();
		aux.addAll(pelisvistas);
		return aux;
	}
	
	
}
