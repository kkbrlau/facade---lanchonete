package lanchonete;

public class Sobremesa extends Produto {
	private String tamanho;
	
	Sobremesa(String descricao, float preco, String tamanho){
		super(descricao, preco);
		this.tamanho = tamanho;
		}
	
	public String getTamanho() {
		return tamanho;
	}

}
