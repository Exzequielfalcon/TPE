import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Usuario extends User{
	private int edad;

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
		p.setClasificacion(this, clasificacion);
	}
	
	public void VerPelicula(Pelicula p) {
		pelisvistas.add(p);
	}

	public String getNombre() {
		return nombre;
	}
	
	public Iterator<Pelicula> getPelisVistas() {
		return this.pelisvistas.iterator();
	}
	
	public void addGeneroFavorito (String genero) {
		if(!(generosfav.contains(genero))) {
			generosfav.add(genero);
		}
	}
	
	public Iterator<String> getGeneros() {				
		return this.generosfav.iterator();
	}
	
	public boolean equals (Object o) {
		if (o instanceof Usuario) {
			Usuario temp=(Usuario) o;
			if (this.nombre.equals(temp.getNombre())) {
				return true;
			}
			else return false;
		}
		else return false;
	}

	
	
}
