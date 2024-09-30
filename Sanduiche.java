package lanchonete;

public class Sanduiche extends Produto {
	private int gramas;
	
	Sanduiche(String descricao, float preco, int gramas){
		super(descricao, preco);
		this.gramas = gramas;
		}
	
	public int getGramas() {
		return gramas;
	}
	

}
