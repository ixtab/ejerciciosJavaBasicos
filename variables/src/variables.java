import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class variables {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/* Tipos de datos:
			Enteros: byte, short, int, long
			Reales: float, double
			Lógicos: boolean
			caracterer: char
			Text: String
		*/
		int a = 3;
		float b = 3.12f;
		double c = a+b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(s + c);
	}

}
