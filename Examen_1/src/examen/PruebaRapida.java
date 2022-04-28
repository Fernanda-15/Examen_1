package examen;

public final class PruebaRapida implements PruebaCovid19{

	public Paciente paciente;
	
	public PruebaRapida(Paciente p) {
		this.paciente=p;
	}
	
	@Override
	public boolean isPositiveCase() {
		int temp=this.paciente.getTemperatura();
		int edad=this.paciente.getEdad();
		if(temp >= 37 && edad >= 70) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String getNombrePaciente() {
		return "";
	}
	
}
