package lanchonete;

public class ComboFacade {
	private Sanduiche sanduiche;
	private Bebida bebida;
	private Sobremesa sobremesa;
	
	public void criarCombo(int tipo) {
		switch (tipo) {
		case 1:
			sanduiche = new Sanduiche("X-Tudo", 15, 200);
			bebida = new Bebida ("Suco Natural", 7, 100);
			sobremesa = new Sobremesa("Sundae", 5, "Médio");
			break;
			
		case 2:
			sanduiche = new Sanduiche("X-Egg", 10, 150);
			bebida = new Bebida ("Suco Natural", 7, 100);
			sobremesa = new Sobremesa("Sundae", 5, "Médio");
			break;
			
		case 3:
			sanduiche = new Sanduiche("X-Vegano", 10, 150);
			bebida = new Bebida ("Suco Natural", 7, 100);
			sobremesa = new Sobremesa("Sundae", 5, "Médio");
			break;
			
		default:
			System.out.println("Opção não encontrada\n");
			break;
			}
	}
	
	@Override
	public String toString () {
		return "\nCombo: " + "\nSanduíche: " + sanduiche.getDescricao() + "\nBebida: " + bebida.getDescricao() + "\nSobremesa: " + sobremesa.getDescricao();
	}

}
