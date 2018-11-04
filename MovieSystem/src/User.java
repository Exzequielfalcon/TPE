import java.util.ArrayList;
import java.util.List;

public abstract class User {
	protected String nombre;
	protected ArrayList<String> generosfav = new ArrayList();  //Generos favoritos
	protected ArrayList<Pelicula> pelisvistas =new ArrayList(); //Peliculas Vistas
	
	public abstract List getGeneros();
	public abstract void ClasificarPeli(Pelicula p, int clasificacion);
	public abstract void VerPelicula(Pelicula p);
	public abstract List getPelisVistas();
}
