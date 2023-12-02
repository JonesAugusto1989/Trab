package infnet.javaTrab;

public abstract class Produto {
	
	private String nome;
	private float valor;
	private int codigo;
	
	public Produto(String nome, float valor, int codigo) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public Produto() {
		
	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public float getValor() {
		return this.valor;
	}
	public int getCodigo() {
		return this.codigo;
	}
	
	abstract String consultarProduto();

}
