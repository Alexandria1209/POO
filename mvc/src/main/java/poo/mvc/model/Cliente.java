package poo.mvc.model;

public class Cliente {
    private String nome;
	private String email;
	
	public Cliente() {
		
	}
	
	public Cliente(String n, String e) {
		this.nome = n;
		this.email = e;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Cliente: "+nome +" - "+email;
	}
}
