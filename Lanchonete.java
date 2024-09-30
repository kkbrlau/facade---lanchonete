package lanchonete;
import java.util.Scanner;

public class Lanchonete {
	public static void main (String[] args) {
	int opcao;
	Scanner teclado = new Scanner(System.in);
		
	System.out.println ("Olá, seja bem vindo (a) a lanchonete mundinho feliz!");
	System.out.println ("\n\t\t\t\tMenu\n1 - Combo potente (x-tudo)\n2 - Combo fitness (x-egg)\n3 - Combo natureba(x-vegano)");
	System.out.println ("\nTodos os combos acompanham suco natural e sundae");
	System.out.println ("Selecione o seu combo: ");
	
	opcao = teclado.nextInt();
	ComboFacade combo = new ComboFacade();
	combo.criarCombo(opcao);
	System.out.println(combo);
}
}
