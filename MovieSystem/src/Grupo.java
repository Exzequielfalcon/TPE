import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<String> generosfav = new ArrayList();  //Generos favoritos
	private ArrayList<Pelicula> pelisvistas =new ArrayList(); //Peliculas Vistas
	
	public void Grupo(String nombre,Usuario miembro) {
		this.nombre= nombre;
		this.usuarios.add(miembro);
	}
	
	public void Grupo(String nombre, Grupo c) {
		this.nombre = nombre;
		this.usuarios.addAll(c.getUsuarios());
	}
	
	public ArrayList<Usuario> getUsuarios() {
		ArrayList<Usuario> aux = new ArrayList();
		aux.addAll(usuarios);
		return aux;
	}
	
	
	
}
