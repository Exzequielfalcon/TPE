import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String>actoresprotag�nicos = new ArrayList<>();
	private ArrayList<String>directores = new ArrayList<>();
	private int duraci�n;
	private ArrayList<String>categorias = new ArrayList<>();
	private int a�oestreno;
	private ArrayList<Integer> clasificacion = new ArrayList<>();
	
	public Pelicula(String titulo, String sinopsis, int duraci�n, int a�oestreno) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duraci�n = duraci�n;
		this.a�oestreno = a�oestreno;

	}
	

	public double getClasificacion() {
		int cantidaddevotos = clasificacion.size();
		int auxsuma = 0;
		for (int i=0; i<clasificacion.size();i++) {
			auxsuma +=this.clasificacion.get(i);
		}
		return auxsuma/cantidaddevotos;
	}
	
	public void A�adircategoria(String c) {
		if(!(this.categorias.contains(c))) {
			this.categorias.add(c);
		}
	}
	
	public void A�adiractoresprotagonicos (String a) {
		if(!(this.actoresprotag�nicos.contains(a))) {
			this.actoresprotag�nicos.add(a);
		}
	}
	
	public void A�adirdirectores (String d) {
		if(!(this.directores.contains(d))) {
			this.directores.add(d);
		}
	}
	
	 public int getA�o() {
		 return this.a�oestreno;
	 }
	 
	 public String getTitulo() {
		 return this.titulo;
	 }
	 
	 boolean Pertenececategoria(String cat) {
		 return categorias.contains(cat);
	 }
	 
	 public int getCantdevotos() {
		 return this.clasificacion.size();
	 }
	 
	 public void setClasificacion(int clasif){
		 this.clasificacion.add(clasif);
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
