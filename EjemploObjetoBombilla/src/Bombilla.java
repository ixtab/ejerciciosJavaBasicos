
public class Bombilla {

	private boolean encendida = false;
	private boolean rota = false;
	
	public Bombilla(){ 			//Constructor
		encendida = false;
		rota = false;
	}
	public Bombilla(boolean encendida){ // Sobrecarga, son varias versiones del metodo dependiendo de los parametros que recibe;
		this.encendida = encendida;
	}
	
	public void encender(){
		if (rota == false && !encendida){
			encendida = true;
		} else if (rota){
			System.out.print("La bombilla está rota, no se puede encender. ");
		} else {
			System.out.print("La bombilla ya está encendida ");
		}

	}

	public void apagar (){
		if (encendida == true){
			encendida = false;
		} else {
			System.out.print("La bombilla no estaba encendida. ");
		}
	}
	
	public void romper(){
		rota = true;
		encendida = false;
	}
	
	public void consultarEstado(){
		if(encendida){
			System.out.println("La bombilla está encendida");
		} else if(rota){
			System.out.println("La bombilla está rota");
		} else {
			System.out.println("La bombilla está apagada");
		}
	}
	
	
}
