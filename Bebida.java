package infnet.javaTrab;

public class Bebida extends Produto{
		
	private boolean gelada;
	private float tamanho;
	private String marca;

	
	public Bebida(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
	}


	public Bebida(String nome, float valor, int qtd, boolean gelada, float tamanho, String marca) {
		super(nome, valor, qtd);
		this.gelada = gelada;
		this.tamanho = tamanho;
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Bebida [gelada=" + this.getGelada() + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}
	
	public String getGelada() {
		if(gelada = true) {
			return "Sim";
		}else {
			return "Não";
		}
	}


	@Override
	public String consultarProduto() {
		
		return "Produto: " + this.getNome() + "%nValor: " + this.getValor() + "%nCodigo: " + this.getCodigo()+"%nMarca: " + this.marca + "%nTamanho: " + this.tamanho;
	}


}
