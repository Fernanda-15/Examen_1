package examen;

public final class PruebaPCR implements PruebaCovid19{

	public Paciente paciente;
		
	public PruebaPCR(Paciente p) {
		this.paciente=p;
		
	}
		
	@Override
	public boolean isPositiveCase() {
		int temp=this.paciente.getTemperatura();
		boolean vomito=this.paciente.getVomito();
		if(temp >= 39 && vomito) {
			return true;
		}
		return false;
		
	}
		
	@Override
	public String getNombrePaciente() {
		return "";
	
	}		
	
}
