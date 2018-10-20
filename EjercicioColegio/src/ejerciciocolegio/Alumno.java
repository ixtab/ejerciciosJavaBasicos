package ejerciciocolegio;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String dni;
	private String telefono;
	
	public Alumno(String nombre, String apellidos, String dni, String telefono){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	public Alumno(){
		nombre = "";
		apellidos = "";
		dni = "";
		telefono = "";
	}
	
	// Setters y getters 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public void llamar(){
		System.out.println(nombre);;
	}
	
	public void llamarCabreado(){
		System.out.println(nombre + " " + apellidos + "!!!");
		
	}
		
}
