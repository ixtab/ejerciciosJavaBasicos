import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntradaSalida {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		// Dos tipos distintos de entrada. Con Scanner te diferencia según tipo de variable
		// con scanner.nextLine para Strings o .nextInt para enteros
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Pon algo: \n");
		String s = br.readLine();
		System.out.print("Has puesto " + s +"\n");

		double[] miArray = new double[4];
		miArray[1] = 1.5;
		miArray[3] = 2.4;
		for(int i = 0; i < miArray.length; i++){
			System.out.println("Escribe el campo " + (i + 1) + "\n");
			miArray[i] =  sc.nextDouble();

		}
		for(int i = 0; i < miArray.length; i++){
			System.out.println(miArray[i]);
		}
	}
}