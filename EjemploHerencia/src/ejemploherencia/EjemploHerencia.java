package ejemploherencia;

public class EjemploHerencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Circulo c = new Circulo();
		Rectangulo r = new Rectangulo();
		Triangulo t = new Triangulo();
				
		c.dibujar();
		r.dibujar(15, 12);
		t.dibujar();
	}

}
