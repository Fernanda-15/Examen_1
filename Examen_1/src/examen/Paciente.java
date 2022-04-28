package examen;
public final class Paciente {

	private final String nombre;
	private final int edad;
	private final int temperatura;
	private final boolean vomito;
	
	public Paciente(String n, int e, int t, boolean v) {
		this.nombre=n;
		this.edad=e;
		this.temperatura=t;
		this.vomito=v;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public boolean getVomito() {
		return vomito;
	}
	
	
}
