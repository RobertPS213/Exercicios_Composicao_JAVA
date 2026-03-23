package entities;

public class Autor {
	private String name;
	private String nacionalidade;
	
	public Autor() {
		
	}
	public Autor(String name, String nacionalidade) {
		this.name = name;
		this.nacionalidade = nacionalidade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
