import java.util.ArrayList;
import java.util.Hashtable;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String>actoresprotagónicos = new ArrayList<>();
	private ArrayList<String>directores = new ArrayList<>();
	private int duración;
	private ArrayList<String>categorias = new ArrayList<>();
	private int añoestreno;
	private Hashtable<User, Integer> clasificacion = new Hashtable();
	
	public Pelicula(String titulo, String sinopsis, int duración, int añoestreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duración = duración;
		this.añoestreno = añoestreno;
	}
	

	public double getClasificacion() {			// REHACER
		int cantidaddevotos = clasificacion.size();
		int auxsuma = 0;
		for (int i=0; i<clasificacion.size();i++) {
			auxsuma +=this.clasificacion.get(i);
		}
		return auxsuma/cantidaddevotos;
	}
	
	public void Añadircategoria(String c) {
		if(!(this.categorias.contains(c))) {
			this.categorias.add(c);
		}
	}
	
	public void Añadiractoresprotagonicos (String a) {
		if(!(this.actoresprotagónicos.contains(a))) {
			this.actoresprotagónicos.add(a);
		}
	}
	
	public void Añadirdirectores (String d) {
		if(!(this.directores.contains(d))) {
			this.directores.add(d);
		}
	}
	
	 public int getAño() {
		 return this.añoestreno;
	 }
	 
	 public String getTitulo() {
		 return this.titulo;
	 }
	 
	 boolean Pertenececategoria(String cat) {
		 return categorias.contains(cat);
	 }
	 
	 public int getCantdevotos() {				//VER
		 return this.clasificacion.size();
	 }
	 
	 public void setClasificacion(User usuario, int clasif){
		 this.clasificacion.put(usuario, clasif);
	 }
	 
	public boolean equals (Object o) {
			if (o instanceof Pelicula) {
				Pelicula temp=(Pelicula) o;
				if (this.titulo.equals(temp.getTitulo())) {
					return true;
				}
				else return false;
			}
			else return false;
		}
}
