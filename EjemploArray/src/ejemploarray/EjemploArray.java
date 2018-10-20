package ejemploarray;

public class EjemploArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		String[] arrayString = new String [3];
		int [][] matriz = new int [10][3];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 10;
		}
		
		for (int i = 0; i< array.length; i++){
			System.out.println(array[i]);
		}
		
		arrayString[0] = "un";
		arrayString[1] = "dos";
		arrayString[2] = "tres";
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println(arrayString[i]);
		}
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				matriz[i][j] = i+j;
			}
		}
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 3; j++){
				System.out.print((matriz[i][j] +1) + ", ");
			}
			System.out.println("\n");
		}
		
	}

}
