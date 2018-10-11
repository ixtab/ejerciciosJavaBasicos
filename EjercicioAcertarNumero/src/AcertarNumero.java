// import java.util.Random; activar si utilizamos Random (siguiente comentario)
import java.util.Scanner;


public class AcertarNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numeroAzar = (int) (Math.random() * 100) + 1;
		/*
		Random r = new Random();
		System.out.println(r.nextInt(20)); // saca un número aleatorio del 1 al 20
		*/
		int contador = 0;
		String continuar;
		do{
			System.out.println("Introduce un número del 1 al 100: ");
			int numeroElegido = scn.nextInt();
			contador++;
			if (numeroElegido < numeroAzar){
				System.out.println("El numero que has puesto es más bajo");
				System.out.println("Intentos: " + contador +". Continuar s|n?");
				continuar = scn.next();
			}
			else if (numeroElegido > numeroAzar){
				System.out.println("El numero que has puesto es más alto");
				System.out.println("Intentos: " + contador +". Continuar s|n?");
				continuar = scn.next();
			}
			else {
				System.out.println("Has Acertado!!! en " + contador + " intentos." );
				continuar ="salir";
			}
		}
		while (continuar.equals("s") || continuar.equals("S"));
	}

}
