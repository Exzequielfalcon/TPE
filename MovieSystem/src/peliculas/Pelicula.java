package peliculas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import users.User;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String>actores = new ArrayList<>();
	private ArrayList<String>directores = new ArrayList<>();
	private double duracion;
	private ArrayList<String>genero = new ArrayList<>();
	private int anioestreno;
	private HashMap<User, Integer> clasificacion = new HashMap<User,Integer>();
	
	public Pelicula(String titulo) {
		this.titulo = titulo;
	}
	
	public Pelicula(String titulo, String sinopsis, double duracion, int anioestreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.anioestreno = anioestreno;
	}
	
	public int getCantidadDeVotos() {
		return this.clasificacion.size();
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
		if(!(this.actores.contains(a))) {
			this.actores.add(a);
		}
	}
	
	public void addDirector (String d) {
		if(!(this.directores.contains(d))) {
			this.directores.add(d);
		}
	}
	
	 public int getAnio() {
		 return this.anioestreno;
	 }
	 
	 public String getTitulo() {
		 return this.titulo;
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
		 usuario.verPelicula(this);
		
	 }
	 
	 public List<String> getGeneros() {				
			return new ArrayList<String>(this.genero);
	}
	 
	public boolean contieneActor(String s) {
		return this.actores.contains(s);
	}
	
	public boolean contieneDirector(String s) {
		return this.directores.contains(s);
	}
	
	public boolean contieneGenero(String s) {
		return this.genero.contains(s);
	}
	
	public boolean equals (Object o) {
			if (o instanceof Pelicula) {
				Pelicula temp=(Pelicula) o;
				return this.titulo.equals(temp.getTitulo());
			}
			else return false;
		}

	public List<String> getActores(){
		return new ArrayList<String>(this.actores);
	}

	public List<String> getDirectores() {
		// TODO Auto-generated method stub
		return new ArrayList<String>(this.directores);
	}
}
