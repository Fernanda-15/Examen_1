package examen;

import java.util.List;

public abstract class HospitalMexico extends OMS{
	
	public HospitalMexico(List<Paciente> pacientes){
		super(pacientes);
	}
	

	@Override
	protected abstract boolean isGamHospital();
	
	@Override
	public abstract Hospital getNombreHospital();
}
