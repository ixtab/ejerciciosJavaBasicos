package ejemplointerfaces;

public class EjemploInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sirena s = new Sirena();
		Guitarra g = new Guitarra();
		Bajo b = new Bajo();
		s.sonar(10);
		g.sonar(5);
		b.sonar(23);
		g.ensayar();
	}

}
