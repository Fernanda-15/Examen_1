package examen;

import java.util.List;

public abstract class HospitalNicoya extends OMS{

	public HospitalNicoya(List<Paciente> pacientes){
		super(pacientes);
	}
	

	@Override
	protected abstract boolean isGamHospital();
	
	@Override
	public abstract Hospital getNombreHospital();
}
