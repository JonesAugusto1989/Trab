package infnet.javaTrab;

public class Sobremesa extends Produto{

	private float quantidade;
	private boolean doce;
	private String informacao;
	
	public Sobremesa(String nome, float valor, int qtd, float quantidade, boolean doce, String informacao) {
		super(nome, valor, qtd);
		this.quantidade = quantidade;
		this.doce = doce;
		this.informacao = informacao;
	}
	
	public String getDoce() {
		if(doce = true) {
			return "Sim";
		}else {
			return "Não";
		}
	}


	@Override
	public String consultarProduto() {
		return "Produto: " + this.getNome() + "%nValor: " + this.getValor() + "%nCodigo: " + this.getCodigo()+
				"%nQuantidade: " + this.quantidade + "%nInformação: " + this.informacao;
	}

	@Override
	public String toString() {
		return "Sobremesa [quantidade=" + quantidade + ", doce=" + getDoce() + ", informacao=" + informacao + "]";
	}
	
	
	
}
