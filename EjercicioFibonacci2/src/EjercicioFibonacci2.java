import java.util.Scanner;
 
public class EjercicioFibonacci2 {
 
	public static void main(String[] args) {
 
        long n1 = 0;
        long n2 = 1;
     	Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();  
 
        System.out.print(n1 + ", ");
        System.out.print(n2 + ", ");
 
        for(int i = 0; i<limite-1; i++){
            n2 = n1 + n2;
            n1 = n2 - n1;
            System.out.print(n2 + ", ");
        }
    }
}