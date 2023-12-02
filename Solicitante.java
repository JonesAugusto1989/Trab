package infnet.javaTrab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Solicitante{
	
	private String nome;
	private String cpf;
	private String email;
	private ArrayList<Pedido> pedidos;
	
	public Solicitante() {
		
	}
	
	
	public Solicitante(String nome, String cpf, String email) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;	
	}
	
	
	public Solicitante(String nome, String cpf, String email, ArrayList<Pedido> pedidos) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.pedidos = pedidos;
	}
	
	public Solicitante(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void pedido(Pedido pedido) {
		
	}
	
	public void cadastrarPedido(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	@Override
	public String toString() {
		return "Solicitante [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", pedidos=" + pedidos + "]";
	}


	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}


	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	public String getNome() {
		return nome;
	}

	
	

}
