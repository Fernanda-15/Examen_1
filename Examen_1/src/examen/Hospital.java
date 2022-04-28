package examen;

public enum Hospital {
	NICOYA("Hospital de Nicoya"), MEXICO("Hospital de Mexico");
	
	private String nombreHospital;
	
	private Hospital(String n) {
		this.nombreHospital=n;
	}
	
	public String tipoHospital(Hospital hospital) {
		Hospital nicoya = Hospital.NICOYA;
		Hospital mexico = Hospital.MEXICO;
		
		if(nicoya.equals(hospital)) {
			return (nicoya.name());
		}
		return (mexico.name());
	}
	
}
