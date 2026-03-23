package entities;

public class Passageiro {
	private String name;
	private String passaporte;
	
	public Passageiro() {
		
	}
	public Passageiro(String name, String passaporte) {
		this.name = name;
		this.passaporte = passaporte;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
}
