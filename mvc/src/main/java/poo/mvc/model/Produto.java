package poo.mvc.model;

public class Produto {
    private String nome;
	private String codigo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String toString() {
		return "Produto["+codigo+"]: "+nome;
	}
}

