import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int edad;
	private ArrayList<String> generosfav = new ArrayList();  //Generos favoritos
	private ArrayList<Pelicula> pelisvistas =new ArrayList(); //Peliculas Vistas
	
	public Usuario(String nombre, int edad, String generofavorito) {
		this.nombre = nombre;
		this.edad = edad;
		this.generosfav.add(generofavorito);
	}

	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void ClasificarPeli(Pelicula p, int clasificacion) {
		p.setClasificacion(clasificacion);
	}
	
	public void VerPelicula(Pelicula p) {
		pelisvistas.add(p);
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public ArrayList<Pelicula> getPelisVistas() {
		ArrayList<Pelicula> aux = new ArrayList();
		aux.addAll(pelisvistas);
		return aux;
	}
	
	public void AddGeneroFavorito (String genero) {
		if(!(generosfav.contains(genero))) {
			generosfav.add(genero);
		}
	}
	
}
