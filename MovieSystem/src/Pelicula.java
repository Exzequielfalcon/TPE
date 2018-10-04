import java.util.ArrayList;

public class Pelicula {
	String titulo;
	String sinopsis;
	ArrayList<String>actoresprotag�nicos = new ArrayList<>();
	ArrayList<String>directores = new ArrayList<>();
	int duraci�n;
	ArrayList<String>categorias = new ArrayList<>();
	int a�oestreno;
	int clasificacion;
	int cantidaddevotos;
	
	public Pelicula(String titulo, String sinopsis, int duraci�n, int a�oestreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duraci�n = duraci�n;
		this.a�oestreno = a�oestreno;
		this.clasificacion = 0;
		this.cantidaddevotos = 0;
	}
	
	
	public double Getclasificacion() {
		return clasificacion/cantidaddevotos;
	}
	
	public void A�adircategoria(String c) {
		this.categorias.add(c);
	}
	
	public void A�adiractoresprotagonicos (String a) {
		this.actoresprotag�nicos.add(a);
	}
	
	public void A�adirdirectores (String d) {
		this.directores.add(d);
	}
	
	 public int Geta�o() {
		 return this.a�oestreno;
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
