import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EjemploExcepciones {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s =  br.readLine();
			int a = 5/0;
			System.out.println(s + a);
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException ex){
			System.out.println("No se puede hacer una división entre 0");
		}

	}

}
