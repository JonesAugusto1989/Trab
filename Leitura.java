package infnet.javaTrab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitura {

	public static void main(String[] args) {

		String path = "\\C:\\Users\\Jones\\Downloads\\Infnet\\Solicitante.csv";

		List<Solicitante> solicitantes = new ArrayList<>();


		try(BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine();
			line = br.readLine();
			
			while(line != null) {


				String[] linha = line.split(",");

				String nome = linha[0];
				String cpf = linha[1];;
				String email = linha[2];;
				String pedidoText = linha[3];
				Solicitante s = new Solicitante(nome,cpf,email);
				

				String[] linhaPedido = pedidoText.split("Pedido");
				
				String pedidoDescricao = linhaPedido[0];
				linhaPedido = pedidoText.split("-");
				
				
				String nomeProd = linhaPedido[1].trim();
				float prodPreco = Float.parseFloat(linhaPedido[2]);				
				int prodQtd = Integer.parseInt(linhaPedido[3]);			
				boolean pedidoWeb = Boolean.parseBoolean(linhaPedido[4]); 
				

				ArrayList<Produto> prod = new ArrayList<>();
				Produto produto;
				ArrayList pedidos = new ArrayList<>();
				Pedido pedido = new Pedido();//Estou criando um pedido vazio
				
				
				if(nomeProd.equalsIgnoreCase("comida")) {
					boolean foodVegano = Boolean.parseBoolean(linhaPedido[10]);
					float foodPeso = Float.parseFloat(linhaPedido[9]);			
					String foodIngredientes = linhaPedido[11];
			
					produto = new Comida(nomeProd,prodPreco,prodQtd,foodPeso,foodVegano,foodIngredientes);
					
					prod.add(produto);
					pedido.setProdutos(prod);
				}

				if(nomeProd.equalsIgnoreCase("bebida")) {
					boolean drinkGelada = Boolean.parseBoolean(linhaPedido[10]);
					float  drinkTamanho = Float.parseFloat(linhaPedido[9]);
					String drinkMarca = linhaPedido[11];
					produto = new Bebida(nomeProd,prodPreco,prodQtd,drinkGelada,drinkTamanho,drinkMarca);
					prod.add(produto);
					pedido.setProdutos(prod);
					System.out.println(pedido);
				}

				if(nomeProd.equalsIgnoreCase("sobremesa")) {
					float foodPeso = Float.parseFloat(linhaPedido[10]);
					boolean foodVegano = Boolean.parseBoolean(linhaPedido[9]);
					String foodIngredientes = linhaPedido[11];
					produto = new Sobremesa(nomeProd,prodPreco,prodQtd,foodPeso,foodVegano,foodIngredientes);
					prod.add(produto);
					pedido.setProdutos(prod);
					s.setPedidos(pedidos);
				}

				solicitantes.add(s);
				System.out.println(s);
				line = br.readLine();
			}

		}catch(IOException e) {
			e.getMessage();
		}

		/*for(Solicitante s: solicitantes) {
			System.out.println(s);
		}
*/
		//System.out.println(solicitantes);

	}

}
