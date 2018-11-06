import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema c = new Sistema();
		Usuario h = new Usuario("kilo", 9, "asd");
		Grupo d = new Grupo("Loschevis", new Usuario("kilo", 9, "asd"));
		d.addUser(new Usuario("juan", 8, "Tu hermana"));
		d.addUser(new Usuario("uan", 8, "Tu hermana"));
		Iterator<String> it = d.getGeneros();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
