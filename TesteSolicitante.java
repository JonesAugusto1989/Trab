package infnet.javaTrab;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteSolicitante {

	public static void main(String[] args) {
		
		ArrayList<Solicitante> ListaDeSolicitantes = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String op=null;
		
		imprimeOpcoes(scan,op,ListaDeSolicitantes);
	}
	
	public static void cadastroDeSolicitacao(Scanner scan,ArrayList<Solicitante> ListaDeSolicitantes) {
		
		String nome;
		String cpf;
		String email;
		
		System.out.println("Digite o nome: ");
		nome = scan.nextLine();
		System.out.println("Digite o cpf: ");
		cpf = scan.nextLine();
		System.out.println("Digite o email: ");
		email = scan.nextLine();
		Solicitante s = new Solicitante(nome,cpf,email);
		ListaDeSolicitantes.add(s);
		System.out.println("Cadastro concluido");
		 
	}
	
	public static void imprimeOpcoes(Scanner scan,String op,ArrayList<Solicitante> ListaDeSolicitantes) {
		System.out.printf("Digite a opção desejada: "+"%n1-Cadastro de Solicitante"+
	"%n2-Cadastro de Pedidos"+
				"%n3-Cadastro de Produtos"+
	"%n0-Sair");
		op = scan.next();
		while(!op.equalsIgnoreCase("0")) {
			switch(op){
				
			case "1":
				cadastroDeSolicitacao(scan,ListaDeSolicitantes);
				break;
			case "2":
				break;
			case "3":
				imprimeListaCadastroDeProdutos( scan, op);
				break;
			
			
			}
		}
	}

	
	public static void imprimeListaCadastroDeProdutos(Scanner scan,String op) {
		
		op = "";
		
		while(!op.equalsIgnoreCase("0")) {
			System.out.printf("Escolha a opção que deseja cadastrar:"
					+"%n1-Comida"
					+"%n2-Bebida"
					+"%n3-Sobremesa"
					+"%n0-Retornar");
			op = scan.next();
					switch(op) {
					
					case "1":
						cadastroComida(scan);
					break;
					case "2":
						break;
					case "3":
						break;
					
					}
		}	
	}
	
	public static void cadastroComida(Scanner scan) {
		String nomeComida;
		float valorComida;
		int codigoComida;
		float pesoComida;
		boolean vegano = false;
		String vegan;
		char veg;
		String ingredientes;
		boolean opcaoValida = false;
		
		System.out.println("Digite o nome da comida");
		nomeComida = scan.nextLine();
		System.out.println("Digite o valor da comida");
		valorComida = scan.nextFloat();
		System.out.println("Digite o codigo da comida");
		codigoComida = scan.nextInt();
		System.out.println("Digite o peso da comida");
		pesoComida = scan.nextFloat();
		System.out.println("Digite se a comida é vegana(S/N)");
		vegan = scan.next();
		
		while(opcaoValida) {
			if(!vegan.equalsIgnoreCase("s")||vegan.equalsIgnoreCase("sim")) {
				vegano = true;
				opcaoValida = true;
			
			}else if(vegan.equalsIgnoreCase("n")||vegan.equalsIgnoreCase("não")) {
				vegano = false;
				opcaoValida = true;
			}else {
				System.out.println("Opção invalida digite novamente.");
				System.out.println("Digite se a comida é vegana(S/N)");
				vegan = scan.next();
			}	
		}
		
		//!vegan.equalsIgnoreCase("s")||vegan.equalsIgnoreCase("sim")||vegan.equalsIgnoreCase("n")||vegan.equalsIgnoreCase("não"))
		
		System.out.println("Digite os ingredientes da comida");
		ingredientes = scan.nextLine();	
		Comida comida = new Comida(nomeComida,valorComida,codigoComida,pesoComida,vegano,ingredientes);
		
	}
	
	
	public static boolean SimOuNao(String opcao) {
		if(!opcao.equalsIgnoreCase("s")||opcao.equalsIgnoreCase("sim")) {
			return  true;
			
		
		}else if(opcao.equalsIgnoreCase("n")||opcao.equalsIgnoreCase("não")) {
			return false;
			
		}
		return false;
		
	}
	
	
	
	
}
