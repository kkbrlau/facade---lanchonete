package lanchonete;

public class Produto {
	private String descricao;
	private float preco;
	
	Produto (String descricao, float preco){
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public float getPreco () {
		return preco;
	}

}
