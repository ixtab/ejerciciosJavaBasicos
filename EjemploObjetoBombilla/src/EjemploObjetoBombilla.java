public class EjemploObjetoBombilla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bombilla b = new Bombilla();
		Bombilla c = new Bombilla(true);
		
		b.encender();
		b.consultarEstado();
		b.apagar();
		b.consultarEstado();
		b.apagar();
		b.consultarEstado();
		b.encender();
		b.consultarEstado();
		b.romper();
		b.consultarEstado();
		b.encender();
		b.consultarEstado();
		
		
		System.out.print("Estado de c: ");
		c.consultarEstado();
	}

}