import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String>actoresprotagonicos = new ArrayList<>();
	private ArrayList<String>directores = new ArrayList<>();
	private int duracion;
	private ArrayList<String>categorias = new ArrayList<>();
	private int añoestreno;
	private HashMap<User, Integer> clasificacion = new HashMap<User,Integer>();
	
	public Pelicula(String titulo, String sinopsis, int duracion, int añoestreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.añoestreno = añoestreno;
	}
	

	public double getClasificacion() {
		int cantidaddevotos = clasificacion.size();
		int auxsuma=0;
		for(Entry<User, Integer> entry : this.clasificacion.entrySet()) {
		    Integer value = entry.getValue();
		    auxsuma+=value;
		}
		return auxsuma/cantidaddevotos;
	}
	
	public void addCategoria(String c) {
		if(!(this.categorias.contains(c))) {
			this.categorias.add(c);
		}
	}
	
	public void addActores (String a) {
		if(!(this.actoresprotagonicos.contains(a))) {
			this.actoresprotagonicos.add(a);
		}
	}
	
	public void addDirector (String d) {
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
				return this.titulo.equals(temp.getTitulo());
			}
			else return false;
		}
}
