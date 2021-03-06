
import java.util.ArrayList;
import java.util.Iterator;

import Comparators.ComparaPromedio;
import Comparators.ComparaVistos;
import Condiciones.AllGeneros;
import Condiciones.PelisPorGenero;
import peliculas.Pelicula;
import sistema.Sistema;
import users.Grupo;
import users.User;
import users.Usuario;
import buscadores.BMergeAnd;
import buscadores.BMergeOr;
import buscadores.BPorActor;
import buscadores.BPorAnioMayor;
import buscadores.BPorAnioMayor;
import buscadores.BPorAnioMenor;
import buscadores.BPorDirector;
import buscadores.BPorGenero;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USUARIOS
		
		Usuario Lisa = new Usuario("Lisa", 8);
		Lisa.addGeneroFavorito("Romantico");
		Lisa.addGeneroFavorito("Musical");
		Lisa.addGeneroFavorito("Infantil");
		Lisa.addGeneroFavorito("Aventura");
	
		Usuario Bart = new Usuario("Bart", 10);
		Bart.addGeneroFavorito("Musical");
		Bart.addGeneroFavorito("Aventura");
		Bart.addGeneroFavorito("Infantil");
		Bart.addGeneroFavorito("Accion");
		
		Usuario Maggie = new Usuario("Maggie", 1);
		Maggie.addGeneroFavorito("Musical");
		Maggie.addGeneroFavorito("Aventura");
		Maggie.addGeneroFavorito("Infantil");
		
		Usuario Marge = new Usuario("Marge", 30);
		Marge.addGeneroFavorito("Musical");
		Marge.addGeneroFavorito("Aventura");
		Marge.addGeneroFavorito("Infantil");
		Marge.addGeneroFavorito("Romantico");
		
		Usuario Homero = new Usuario("Homero", 31);
		Homero.addGeneroFavorito("Musical");
		Homero.addGeneroFavorito("Accion");
		Homero.addGeneroFavorito("Infantil");
		
		//GRUPO DE USUARIOS
		Grupo HombresSimpson = new Grupo("Hombres Simpson", Bart);
		HombresSimpson.addUser(Homero);
		
		Grupo HermanosSimpson = new Grupo("Hermanos Simpson", Lisa);
		HermanosSimpson.addUser(Bart);
		HermanosSimpson.addUser(Maggie);
		
		Grupo Familia = new Grupo("Familia Simpson", HermanosSimpson);
		Familia.addUser(Homero);
		Familia.addUser(Marge);
		
		
		//PELICULAS
		Pelicula p1 = new Pelicula("Up : una aventura en la altura","Carl Fredricksen es un vendedor de globos de 78 a�os de edad dispuesto a cumplir su sue�o: atar miles de globos a su casa y volar a Sudam�rica. Sin embargo, descubre demasiado tarde a un joven e inesperado poliz�n. "
				+ "Lo que en principio sera recelo, acabar� por tornarse simpatia hacia el muchacho mientras juntos pasan fascinantes aventuras en ex�ticos lugares.",1.4,2009);
		p1.addDirector("Pete Docter");
		p1.addDirector("Bob Peterson");
		p1.addActor("Pete Docter");
		p1.addActor("Ed Asner");
		p1.addActor("Bob Peterson");
		p1.addActor("Jordan Nagai");
		p1.addGenero("Infantil");
		p1.addGenero("Accion");
		p1.addGenero("Drama");


		Pelicula p2 = new Pelicula("Los Simpson"," la pel�cula La combinaci�n de Homero (Dan Castellaneta), su nuevo puerco mascota, "
				+ "y un silo lleno de excremento podr�an provocar un desastre que amenace no s�lo a Springfield, sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,"
				+ " dividiendo a la familia. Con el destino de la Tierra en equilibrio, Homero se prepara para intentar redimirse con la intenci�n de salvar al mundo y ganarse el perd�n de Marge (Julie Kavner).",
				2.0, 2007);
		
		p2.addDirector("David Silverman");
		p2.addActor("Dan Castellaneta");
		p2.addActor("Harry Shearer");
		p2.addActor("Julie Kavner");
		p2.addGenero("Romantico");
		p2.addGenero("Musical");
		p2.addGenero("Infantil");
		p2.addGenero("Aventura");
		p2.addGenero("Comedia");
		
		Pelicula p3 = new Pelicula("Los Increibles","Un s�per h�roe retirado lucha contra el aburrimiento en un suburbio y junto con su familia tiene la oportunidad de salvar al mundo.\r\n"
				,2.0, 2004);
		
		p3.addDirector("Brad Bird");
		p3.addActor("Brad Bird");
		p3.addActor("Craig T. Nelson");
		p3.addActor("Holly Hunter");
		p3.addGenero("Musical");
		p3.addGenero("Infantil");
		p3.addGenero("Aventura");
		p3.addGenero("Accion");
		
		Pelicula p4 = new Pelicula("Los Increibles 2"," Helen entra en acci�n y debe luchar contra un cibercriminal que planea hipnotizar el mundo a trav�s de las pantallas de las computadoras. Eso deja al Sr. Incre�ble con uno de sus mayores desaf�os: quedarse en casa y cuidar de tres ni�os traviesos.\r\n"
				,2.0, 2018);
		
		p4.addDirector("Brad Bird");
		p4.addActor("Brad Bird");
		p4.addActor("Craig T. Nelson");
		p4.addActor("Holly Hunter");
		p4.addGenero("Musical");
		p4.addGenero("Infantil");
		p4.addGenero("Aventura");
		p4.addGenero("Accion");
		
		
		Pelicula p5 = new Pelicula("Toy Story","Lo mejor de la animaci�n computarizada produce esta historia sobre juguetes que cobran vida cuando su due�o se ausenta.",
				2.0, 1995);
		
		p5.addDirector("John Lasseter");
		p5.addActor("Tim Allen");
		p5.addActor("Tom Hanks");
		p5.addActor("Don Rickles");
		p5.addActor("Wallace Shawn");
		p5.addGenero("Infantil");
		p5.addGenero("Aventura");
		p5.addGenero("Accion");
		
		Pelicula p6 = new Pelicula("Monsters Inc.","Monsters, Incorporated es la f�brica de sustos m�s grande en el mundo de los"
				+ " monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores. Sullivan es un monstruo "
				+ "grande e intimidante de piel azul, grandes manchas color p�rpura y cuernos. Su asistente, mejor amigo y "
				+ "compa�ero de cuarto es Mike Wazowski (Billy Crystal), un peque�o y alegre monstruo verde con un solo ojo."
				+ " Boo (Mary Gibbs), una ni�a peque�a visita lugares en donde nunca antes hab�a estado un ser humano.\r\n"
				,2.0, 2001);
		
		p6.addDirector("Pete Docter");
		p6.addActor("John Goodman");
		p6.addActor("Billy Crystal");
		p6.addActor("John Ratzenberger");
		p6.addGenero("Infantil");
		p6.addGenero("Musical");
		p6.addGenero("Aventura");
		p6.addGenero("Accion");
		
		//CALIFICAR
		
		Lisa.setMovieRate(p3,5);
		Bart.setMovieRate(p3, 2);
		Homero.setMovieRate(p3, 4);
		Marge.setMovieRate(p3, 2);
		Marge.setMovieRate(p4, 5);
		Maggie.setMovieRate(p5, 1);
		
		//CINE
		
		Sistema cine = new Sistema(new ComparaPromedio(),new AllGeneros());
		cine.addUser(HombresSimpson);
		cine.addPelicula(p1);
		cine.addPelicula(p2);
		cine.addPelicula(p3);
		cine.addPelicula(p4);
		cine.addPelicula(p5);
		cine.addPelicula(p6);
		cine.addUser(Homero);
		cine.addUser(Marge);
		cine.addUser(Familia);
		cine.addUser(Bart);
		cine.addUser(HermanosSimpson);
		cine.addUser(HombresSimpson);
		cine.addUser(Maggie);
		cine.addUser(Lisa);
		HermanosSimpson.setMovieRate(p1, 4);
		//MAIN
		
		Iterator<Pelicula> margePV = Marge.getPelisVistas();
		System.out.println("Peliculas vistas MARGE\n");
		
		while(margePV.hasNext()) {
			System.out.println(margePV.next().getTitulo());
		}
		
		System.out.println("-----------------------\n");
	
		Iterator<Pelicula> bartPV = Bart.getPelisVistas();
		System.out.println("Peliculas vistas BART\n");
		
		while(bartPV.hasNext()) {
			System.out.println(bartPV.next().getTitulo());
		}
		
		System.out.println("-----------------------\n");
	
		//RECOMENDACIONES
		
		for (User u:cine.getUsuarios()) {
			System.out.println("TODOS");
			ArrayList<Pelicula> recoAll = new ArrayList<Pelicula>(cine.recoPelicula(u, 2, 
					new ComparaVistos(), new AllGeneros()));
			ShowReco(recoAll, u.getNombre());
		}
		
		for (User usu:cine.getUsuarios()) {
			System.out.println("ALGUNOS");
			ArrayList<Pelicula> recoAll = new ArrayList<Pelicula>(cine.recoPelicula(usu,
					5, new ComparaPromedio(), new PelisPorGenero()));
			ShowReco(recoAll, usu.getNombre());
		}
		
		//CALIFICAR
		
		//BUSQUEDA
		
		ArrayList<Pelicula> buscador  = new ArrayList<Pelicula>(cine.buscarPelicula(new BMergeAnd(new BPorActor("Pete Docter"), new BPorDirector("Pete Docter"))));
		ShowBusqueda(buscador,"Pete Docter");
		
		ArrayList<Pelicula> buscador2  = new ArrayList<Pelicula>(cine.buscarPelicula(new BPorActor("Tom Hanks")));
		ShowBusqueda(buscador2,"Tom Hanks");
		
		ArrayList<Pelicula> buscador3  = new ArrayList<Pelicula>(cine.buscarPelicula(new BPorAnioMayor(2000)));
		ShowBusqueda(buscador3,"A partir del 2000");
		
		ArrayList<Pelicula> buscador4 = new ArrayList<Pelicula>(cine.buscarPelicula(new BMergeOr(new BMergeOr(new BPorGenero("Romantico"),new BPorGenero("Comedia")),new BPorGenero("Drama"))));
		ShowBusqueda(buscador4,"por Comedia, Romanticos y Drama");
		
	}
	
	public static void ShowBusqueda(ArrayList<Pelicula> pelis, String nombre) {
		System.out.println("Busqueda "+ nombre + "\n");
		for (Pelicula p:pelis) {
			System.out.println(p);
		}
		System.out.println("------------------------------\n");
	}
	
	public static void ShowReco(ArrayList<Pelicula> pelis, String nombre) {
		System.out.println("Recomendadas para "+ nombre + "\n");
		for (Pelicula p:pelis) {
			System.out.println(p);
		}
		System.out.println("------------------------------\n");
	}

}