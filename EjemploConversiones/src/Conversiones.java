
public class Conversiones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 5;
		int b= 7;
		int c = 0;

		double d = 0.5;
		double e = 2.75;
		
		// Conversión implícita:
		d = a;
		System.out.println(d);
		
		// Explícita a = d daría error:
		b = (int) e; // Casting. En este caso se pierden los decimales
		System.out.println(b);
		
		String s = "714";
		c = Integer.parseInt(s);
		System.out.println(c);
		d = Double.parseDouble(s);
		System.out.println(d);
	}
}
