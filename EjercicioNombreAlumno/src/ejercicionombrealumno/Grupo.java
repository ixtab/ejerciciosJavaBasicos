package ejercicionombrealumno;

public class Grupo{
	
	private Alumno [] alumnos = null;
	
	public Grupo(String g){
		
		System.out.println("Código curso: " + g);
		alumnos = new Alumno[5];
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno();
		}
		
		if (g=="1A"){
			for (int i = 0; i < alumnos.length; i++) {
				alumnos[i].setNombre("Juan 2" + i);
			}
		}
		
		if (g=="2B"){
			for (int i = 0; i < alumnos.length; i++) {
				alumnos[i].setNombre("Pablo 1" + i);
			}
		}
		
	}
	public String recuperarAlumno(int a){
		String nombreAlumno = alumnos[a].getNombre();
		return nombreAlumno;
	}
	
}
