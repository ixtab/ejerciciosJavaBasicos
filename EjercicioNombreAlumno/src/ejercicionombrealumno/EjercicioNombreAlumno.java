package ejercicionombrealumno;

public class EjercicioNombreAlumno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Grupo g1a = new Grupo("1A");
		System.out.println(g1a.recuperarAlumno(1));
		
		Grupo g2b = new Grupo("2B");
		System.out.println(g2b.recuperarAlumno(0));
	}

}
