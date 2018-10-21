package ejemplolistas;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula();
		Pelicula p2 = new Pelicula();
		
		List<Pelicula> lista;
		lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		
		Pelicula peli1 = lista.get(0);
		peli1.setTitulo("La Guerra de las Galaxias");
		System.out.println(peli1.getTitulo());
		
		Pelicula peli2 = lista.get(0);
		peli2.setTitulo("Los Goonies");
		System.out.println(peli2.getTitulo());
		}
}
