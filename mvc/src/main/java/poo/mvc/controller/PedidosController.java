package poo.mvc.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo.mvc.model.*;

@RestController
@RequestMapping("/")

public class PedidosController {
    private Cliente clientes[] = new Cliente[100];
	private Produto produtos[] = new Produto[100];
	private Pedido pedidos[] = new Pedido[100];
	
	private int qtdClientes = 0;
	private int qtdProdutos = 0;
	private int qtdPedidos = 0;
	
	//UC01: Cadastrar Cliente
	public void novoCliente(String n, String e) {
		clientes[qtdClientes++]=new Cliente(n, e);
	}
	
	//UC02: Cadastrar Produto
	public void novoProduto(String n, String c) {
		Produto p = new Produto();
		p.setNome(n);
		p.setCodigo(c);
		produtos[qtdProdutos] = p;
		qtdProdutos = qtdProdutos + 1;
	}
	
	//UC03: Fazer Pedido
	public void novoPedido(int posCliente, int[] posProds) {
		Pedido pd = new Pedido();
		pd.setData(new Date());
		
		pd.setCliente(clientes[posCliente]);
		
		Produto prodsPedido[] = new Produto[posProds.length];
		for(int i=0;i<posProds.length;i++) {
			int posProdutoAtual = posProds[i];
			prodsPedido[i]=produtos[posProdutoAtual];
		}
		pd.setProdutos(prodsPedido);
		
		pedidos[qtdPedidos]=pd;
		qtdPedidos = qtdPedidos + 1;
	}
	
	public Cliente[] getClientes() {
		return clientes;
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	//UC04: Listar Pedidos
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}
	public int getQtdClientes() {
		return qtdClientes;
	}
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	public int getQtdProdutos() {
		return qtdProdutos;
	}
	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	public int getQtdPedidos() {
		return qtdPedidos;
	}
	public void setQtdPedidos(int qtdPedidos) {
		this.qtdPedidos = qtdPedidos;
	}
}
