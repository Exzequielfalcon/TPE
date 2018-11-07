package peliculas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import users.User;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String>actoresprotagonicos = new ArrayList<>();
	private ArrayList<String>directores = new ArrayList<>();
	private double duracion;
	private ArrayList<String>genero = new ArrayList<>();
	private int añoestreno;
	private HashMap<User, Integer> clasificacion = new HashMap<User,Integer>();
	
	public Pelicula(String titulo, String sinopsis, double duracion, int añoestreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.añoestreno = añoestreno;
	}
	

	public double getClasificacion() {
		int cantidaddevotos = clasificacion.size();
		double auxsuma=0;
		for(Entry<User, Integer> entry : this.clasificacion.entrySet()) {
		    double value = entry.getValue();
		    auxsuma+=value;
		}
		return auxsuma/cantidaddevotos;
	}
	
	public void addGenero(String c) {
		if(!(this.genero.contains(c))) {
			this.genero.add(c);
		}
	}
	
	public void addActor (String a) {
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
		 return genero.contains(cat);
	 }
	 
	 public int getCantdevotos() {				//VER
		 return this.clasificacion.size();
	 }
	 
	 public void setClasificacion(User usuario, int clasif){
		 if (clasif<1) {
			 clasif=1;
		 }
		 if (clasif>5) {
			 clasif=5;
		 }
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
