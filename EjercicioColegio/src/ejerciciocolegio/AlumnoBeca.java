package ejerciciocolegio;

public class AlumnoBeca extends Alumno{
	
	private int importeBeca = 0;

	public int getImporteBeca() {
		return importeBeca;
	}

	public void setImporteBeca(int importeBeca) {
		this.importeBeca = importeBeca;
	}

	public boolean tieneBeca(){
		if (importeBeca > 0){
			return true;
		} else {
			return false;
		}
	}
}
