package ejerciciocolegio;

public class EjercicioColegio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AlumnoBeca a = new AlumnoBeca();
		
		a.setImporteBeca(2120);
		a.setNombre("Ramon");
		a.setApellidos("López");
		a.llamar();
		System.out.println(a.tieneBeca());

	}

}
