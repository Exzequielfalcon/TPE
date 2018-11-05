import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
	private HashSet<Pelicula> peliculas = new HashSet<>();
	private ArrayList<User> usuarios = new ArrayList<>();
	
	
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
	
	public void VerPelicula(Usuario u,Pelicula p, int clasif) {
		u.VerPelicula(p);
		u.ClasificarPeli(p, clasif);
	}
	
//	public ArrayList<Pelicula> RecomendarPeli(Usuario u){
//		ArrayList<Pelicula> aux = new ArrayList<>();
//		return aux;
//	}
//	
//	public ArrayList<Pelicula> RecomendarPeliGrupo(Grupo g){			//MAL
//		ArrayList<Pelicula> aux = new ArrayList<>();
//		return aux;
//	}
//	
	public int CantidadVotos(Pelicula p) {
		return p.getCantdevotos();
	}
	
	public double PromedioClasf(Pelicula p) {
		return p.getClasificacion();
	}
	
	public ArrayList<Pelicula>BuscarPelicula(String c){
		ArrayList<Pelicula> aux = new ArrayList<>();
		return aux;
	}

}
