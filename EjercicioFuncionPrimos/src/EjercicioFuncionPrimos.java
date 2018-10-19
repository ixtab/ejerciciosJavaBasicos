public class EjercicioFuncionPrimos {

	static boolean esPrimo(int a){
	
		boolean primo = true;
		int i = 2;
		
		while (i < a  && primo == true){
			if (a%i == 0){
				primo = false;
			};
			i++;
		}
		
		return primo;
	}
	
	public static void main(String[] args) {
		for (int a = 1; a<=2000; a++){
			if (esPrimo(a)){
				System.out.println(a);
			}
		}
	}

}
