package poo.mvc.model;

import java.util.Date;

public class Pedido {
    private Cliente cliente;
	private Produto produtos[] = new Produto[100];
	private Date data;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String toString() {
		String pedidoStr = "";
		pedidoStr += "      PEDIDO:    \n";
		pedidoStr += this.cliente + "\n";
		pedidoStr += this.data + "\n";
		for(Produto p: this.produtos) {
			pedidoStr += p + "\n";
		}
		pedidoStr += "      =======     \n";
		return pedidoStr;
		
	}
}
