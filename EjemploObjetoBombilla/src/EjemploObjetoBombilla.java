public class EjemploObjetoBombilla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bombilla b = new Bombilla();
		
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
		
		b.rota = false; // Para probar la visibilidad
		b.encender(); //
		b.consultarEstado(); //
		
		Bombilla c = new Bombilla(true); // Pruebas de sobrecargas.
		System.out.print("Estado de c: ");
		c.consultarEstado();
		
		Bombilla d = new Bombilla("Hola");
		System.out.println(d.habla());
	}

}
