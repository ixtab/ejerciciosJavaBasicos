package ejemplointerfaces;

public class Sirena implements Volumen{

	public void sonar(int vol) {
		for (int i = 0; i < vol; i++){
		System.out.print("NINO ");
		}
		System.out.print("\n");
	}

}
