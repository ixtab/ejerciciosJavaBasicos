package ejemplointerfaces;

public class Bajo extends InstrumentoMusical{
	public void sonar(int vol){
		System.out.print("Bajo");
		for (int i = 0; i < vol; i++) {
			System.out.print("jo");
		}
		System.out.print("\n");
	}
}
