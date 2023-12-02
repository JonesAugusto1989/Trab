package infnet.javaTrab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Pedido extends Solicitante{
	
	private static int num;
	private final int NUMPEDIDO;
	private String descricao;
	private LocalDateTime dataInicial; 
	private boolean web;
	private ArrayList<Produto> produtos;


	public Pedido(String nome, String cpf, String email, ArrayList<Pedido> pedidos,ArrayList<Produto> produtos,int numPedido,boolean web,String descricao) {
		super(nome, cpf, email, pedidos);
		this.produtos = produtos;
		this.NUMPEDIDO = num++;
		this.dataInicial = dataInicial.now();
		this.descricao = descricao;
		this.web = web;
	}

	public Pedido(String nome, String cpf, String email, ArrayList<Pedido> pedidos,int numPedido,boolean web,String descricao) {
		super(nome, cpf, email, pedidos);
		this.NUMPEDIDO = num++;
		this.dataInicial = dataInicial.now();
		this.descricao = descricao;
		this.web = web;
		
	}

	public Pedido(boolean web,String descricao,ArrayList<Produto> produtos) {
		super();
		this.NUMPEDIDO = num++;
		this.produtos = produtos;
		this.dataInicial = dataInicial.now();
		this.descricao = descricao;
		this.web = web;

	}
	public Pedido() {
		super();
		this.NUMPEDIDO = num++;
	}

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDateTime getDataInicial() {
		return dataInicial;
	}


	public void setDataInicial(LocalDateTime dataInicial) {
		this.dataInicial = dataInicial;
	}


	public boolean isWeb() {
		return web;
	}


	public void setWeb(boolean web) {
		this.web = web;
	}


	public ArrayList<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(ArrayList<Produto> produtos) {
		
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return "Pedido [numPedido=" + NUMPEDIDO + ", descricao=" + descricao + ", dataInicial=" + dataInicial + ", web="
				+ web + ", produtos=" + produtos + "]";
	}
	 
	

	public static int geradorDeNumero() {
/*
		HashMap<Integer, Boolean> gerarPedido = new HashMap<>();
		int numPedido=0;

		while (gerarPedido.containsKey(numPedido)) {
			numPedido++;
		}

		gerarPedido.put(numPedido, true);*/
		System.out.println("Gerador de pedido statico: "+num);
		return num++;
	}



}
