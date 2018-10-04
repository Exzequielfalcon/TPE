import java.util.ArrayList;

public class Pelicula {
	String titulo;
	String sinopsis;
	ArrayList<String>actoresprotagónicos = new ArrayList<>();
	ArrayList<String>directores = new ArrayList<>();
	int duración;
	ArrayList<String>categorias = new ArrayList<>();
	int añoestreno;
	int clasificacion;
	int cantidaddevotos;
	
	public Pelicula(String titulo, String sinopsis, int duración, int añoestreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duración = duración;
		this.añoestreno = añoestreno;
		this.clasificacion = 0;
		this.cantidaddevotos = 0;
	}
	
	
	public double Getclasificacion() {
		return clasificacion/cantidaddevotos;
	}
	
	public void Añadircategoria(String c) {
		this.categorias.add(c);
	}
	
	public void Añadiractoresprotagonicos (String a) {
		this.actoresprotagónicos.add(a);
	}
	
	public void Añadirdirectores (String d) {
		this.directores.add(d);
	}
	
	 public int Getaño() {
		 return this.añoestreno;
	 }
	 
	 public String Gettitulo() {
		 return this.titulo;
	 }
	 
	 boolean Pertenececategoria(String cat) {
		 return categorias.contains(cat);
	 }
	 
	 public int Getcantdevotos() {
		 return this.cantidaddevotos;
	 }
	 
	 public void Setclasificacion(int clasif){
		 this.clasificacion += clasif;
		 this.cantidaddevotos += 1;
	 }
	 
	 

}
