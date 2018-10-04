import java.util.ArrayList;

public class Sistema {
	private ArrayList<Pelicula> peliculas = new ArrayList<>();
	private ArrayList<Usuario> usuarios = new ArrayList<>();
	private ArrayList<Grupo> grupos= new ArrayList<>();
	
	
	public void Agregarusuario(Usuario u) {
		this.usuarios.add(u);
	}
	public void Agregarpelicula(Pelicula p) {
		this.peliculas.add(p);
	}
	public void Agregargrupo(Grupo g) {
		this.grupos.add(g);
	}
	public void VerPelicula(Usuario u,Pelicula p, int clasif) {
		u.VerPelicula(p);
		u.ClasificarPeli(p, clasif);
		
		
	}

}
