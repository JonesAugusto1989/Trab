package infnet.javaTrab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TesteSolicitaPedidos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome;
		String cpf;
		String email;
		String op = null;

		ArrayList<Pedido> pedidoslista = new ArrayList<>();
		ArrayList<Solicitante> ListaDeSolicitantes = new ArrayList<>();

		// System.out.println("Insira o nome:");
		// nome = scan.nextLine();
		// System.out.println("Insira o cpf:");
		// cpf = scan.nextLine();
		// System.out.println("Insira o email:");
		// email = scan.nextLine();
		// Solicitante solicitante = new
		// Solicitante("Jones","111111","jones@email.com");

		Solicitante solicitante = new Solicitante("Jones", "111111", "jones@email.com");
		ListaDeSolicitantes.add(solicitante);

		
		System.out.println("Digite o nome do cliente para adiciona o pedido: ");
		String nomeSolicita = scan.nextLine();
		
		adicionaPedidoAoCliente(scan,op,nomeSolicita,pedidoslista,ListaDeSolicitantes);
		System.out.println("===============================");
		nomeSolicita = scan.nextLine();
		System.out.println("Digite o nome do cliente para adiciona o pedido: ");
		nomeSolicita = scan.nextLine();
		adicionaPedidoAoCliente(scan,op,nomeSolicita,pedidoslista,ListaDeSolicitantes);
		System.out.println(solicitante);
		
	}

	public static ArrayList<Pedido> ad(Scanner scan,String op,ArrayList<Pedido> pedidoslista) {

		boolean sair = false;
		do {
			System.out.println("Deseja adicionar um pedido? s/n");
			op=scan.next();
			if(op.equalsIgnoreCase("n")||op.equalsIgnoreCase("nao")||op.equalsIgnoreCase("não")||op.equalsIgnoreCase("4")||op.equalsIgnoreCase("sair")) {
				
				sair = true;
			}
			if(op.equalsIgnoreCase("sim")||op.equalsIgnoreCase("s")) {
				pedidoslista.add(adicionaPedidos(scan,pedidoslista));
				sair = true;
				return pedidoslista;
			}		
			
		}while(!sair);
		return pedidoslista;
	}

	public static Pedido adicionaPedidos(Scanner scan,ArrayList<Pedido> pedidoslista) {
		
		boolean flagWeb = false;
		boolean web = false;
		
		System.out.println("Digite a descrição do pedido");
		String descricaoPedido = scan.nextLine();
		descricaoPedido = scan.nextLine();
		System.out.println("O pedido foi feito pela web? 1-Sim ou 2-Não");
		String webString = scan.nextLine();
		
		while(!flagWeb) {
			switch(webString) {
			case"1":
				web = true;
				flagWeb = true;
				break;
			case "2":
				web = false;
				flagWeb = true;
				break;
			default:
				System.out.println("Opção invalida digite novamente.\n1-Sim ou 2-Não");
				webString = scan.nextLine();
			}
		}
		
		flagWeb = false;
		System.out.println("Insira o numero do pedido: "+
				"\n1-Comida"+
				"\n2-Bebida" +
				"\n3-Sobremesa"+
				"\n4-Sair");
		String op = scan.next();
		
		Pedido pedidos = new Pedido(web,descricaoPedido,criarProduto(scan,op));
		return pedidos;
	}

	public static ArrayList<Produto> criarProduto(Scanner scan,String op) {

		ArrayList<Produto> Produtos = new ArrayList<>();

		do  {

			switch (op.toLowerCase()) {

			case "0":
			case "nao":
			case "não":
			case "n":
			case "Sair":
			case "4":
				break;

			case "1":
				System.out.println("Comida");
				// Comida comida = new Comida("comida1",10,1,2.5f,false,"arroz,feijao");
				Produto produto1 = new Comida("comida 1", 10, 1, 2.5f, false, "arroz,feijao");
				Produtos.add(produto1);	
				break;
			case "2":
				System.out.println("Bebida");
				Produto produto2 = new Bebida("Bebida 2", 3, 2, true, 10f, "coca cola");
				Produtos.add(produto2);			
				break;
			case "3":
				System.out.println("Sobremesa");
				Produto produto3 = new Sobremesa("Sobremesa 3", 3f, 2, 10f,true ,"Brigadeiro");
				Produtos.add(produto3);		
				break;
			default:
				System.out.println("Opção invalida");

			}

			System.out.println("Deseja fazer outro pedido?"+"Digite uma das opções"+
					"\n1-Comida"+
					"\n2-Bebida" +
					"\n3-Sobremesa"+
					"\n4-Sair"
					);
			op = scan.next();
		}while(!op.equalsIgnoreCase("4"));
		return Produtos;
	}

	public static void adicionaPedidoAoCliente(Scanner scan,String op,String nomeSolicita,ArrayList<Pedido> pedidoslista,ArrayList<Solicitante> ListaDeSolicitantes) {
		for(int i =0;i<ListaDeSolicitantes.size();i++) {
			if(ListaDeSolicitantes.get(i).getNome().equals(nomeSolicita)) {
				ListaDeSolicitantes.get(i).setPedidos(ad(scan,op,pedidoslista));
				break;
			}
		}
	}
}
