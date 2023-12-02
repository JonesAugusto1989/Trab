package infnet.javaTrab;

public class Comida extends Produto{

	private float peso;
	private boolean vegano;
	private String ingredientes;
	
	public Comida(String nome, float valor, int qtd, float peso, boolean vegano, String ingredientes) {
		super(nome, valor, qtd);
		this.peso = peso;
		this.vegano = vegano;
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() +" Comida [peso=" + peso + ", vegano=" + getVegano()+"]";
	}
	
	public String getVegano() {
		if(vegano = true) {
			return "Sim";
		}else {
			return "Não";
		}
	}

	@Override
	public String consultarProduto() {
		// TODO Auto-generated method stub
		return "Produto: " + this.getNome() + "%nValor: " + this.getValor() + "%nCodigo: " + this.getCodigo()+
				"%nPeso: "+this.peso+"%nIngredientes: " + this.ingredientes;
	}
	
	
}
