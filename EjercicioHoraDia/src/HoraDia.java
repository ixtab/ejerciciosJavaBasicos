import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class HoraDia {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		int hora;
		String minutos;
		int minutosEntero;
		Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Pon la Hora:");
		hora = scn.nextInt();
		
		System.out.println("Pon los Minutos:");
		minutos = br.readLine();
		minutosEntero = Integer.parseInt(minutos);

		if (hora == 0 && Integer.parseInt(minutos) == 0){
			System.out.println("Son las 12 de la noche");
		}
		else if (hora == 12 && minutosEntero == 0){
			System.out.println("Son las 12 del mediodia");
		}
		else if (hora == 23 && minutosEntero ==58){
			System.out.println("¡¡¡¡¡¡¡TU MINUTS TU MIDNAIT!!!!!!");
		}
		else if (hora >= 2 && hora < 7){
			System.out.println("Es de Madrugada");
		}
		else if (hora >= 7 && hora < 12){
			System.out.println("Es por la mañana");
		}
		else if (hora >= 12 && hora < 21){
			System.out.println("Es por la tarde");
		}
		else {
			System.out.println("Es por la noche");
		}
		
		switch (hora) {
			case 1:
				System.out.println("Es la 1 y algo");
				break;
			case 2:
				System.out.println("Son las 2 y algo");
				break;
			default:
				System.out.println("No son ni la 1 ni las 2");
				break;
		}
		
	}

}
