package ejemplointerfaces;

public class Guitarra extends InstrumentoMusical{

	public void sonar(int vol) {
		System.out.print("Guitarra");
		for (int i = 0; i < vol; i++) {
			System.out.print("rra");
		}
		System.out.print("\n");
	}

}
