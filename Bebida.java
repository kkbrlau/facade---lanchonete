package lanchonete;

public class Bebida extends Produto {
	private int ml;
	
	Bebida (String descricao, float preco, int ml){
		super(descricao, preco);
		this.ml = ml;
	}
	
	public int getMl() {
		return ml;
	}

}
