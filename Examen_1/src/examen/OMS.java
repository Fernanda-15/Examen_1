package examen;

import java.util.List;

public abstract class OMS {
	public PruebaPCR pcr;
	public PruebaRapida rapida;
	public PruebaCovid19 pruebas;
	//LISTA PACIENTES
	List<Paciente> pacientes;
	
	//CREAR LISTA DE RESULTADOS
	 List<PruebaCovid19> resultadoList;
	 
	//ASIGNAR VALORES DE PACIENTES 
	OMS(List<Paciente> pacientes){
		this.pacientes=pacientes;
	}
	
	protected abstract boolean isGamHospital();
	
	public abstract Hospital getNombreHospital();
	
	private void diagnosticar() {
		String hospital = getNombreHospital().toString();
		if(hospital == "MEXICO") { //Si es del GAM prueba PCR
			 for(int i = 0; i < pacientes.size(); i++) {
		            pcr = new PruebaPCR(pacientes.get(i));
		            
		     }
		}else{ //PRUEBA RAPIDA
			for(int i = 0; i < pacientes.size(); i++) {
	            rapida = new PruebaRapida(pacientes.get(i));
			}
		}
	}
	 
	public final void imprimirReporte() {
		//NOMBRE DEL HOSPITAL
		String hospital = getNombreHospital().toString();
		System.out.print(hospital);
		
		//IMPRIMIR LOS RESULTADOS DE LA LISTA
		 for(int i = 0; i < resultadoList.size(); i++) {
	            System.out.println("Nombre del paciente: " + resultadoList.get(i).getNombrePaciente());
	            
	            if(resultadoList.get(i).isPositiveCase()) {
		            System.out.println("Resultado de la prueba: Positivo" );
	            }else {
		            System.out.println("Resultado de la prueba: Negativo" );
	            }
	            
	        }
	}
	
}
