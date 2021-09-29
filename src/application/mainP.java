package application;
import java.util.Scanner;
import structure.Fila;
import structure.Pilha;
public class mainP {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int p = 10,valor=0,indice;
		int pp = 10;
		Fila f = new Fila();
		Pilha pilha = new Pilha();
		do {	
			if (p == 1) {
				do {	
					if (pp == 1) {
						System.out.print("Digite um valor para inserir na fila: " );
						valor = tec.nextInt();
						f.adiciona(valor);
					}
					if (pp == 2) {
						System.out.print("Retirado o elemento "+ f.retirar()+"\n" );
					}
					
					if (pp == 3) {
						f.verificaCabeca();
					}
					f.mostrar();
					System.out.print("\n1 - Adicionar na fila \n"
							+ "2 - Retirar da fila \n"
							+ "3 - Ver o elemento do fim da fila \n"
							+ "0 - Voltar \n"
							+ "Digite a operação: ");
					System.out.print("" );
					pp = tec.nextInt();

				}while (pp != 0);
				
			}
			if (p == 2) {
				do {	
					if (pp == 1) {
						System.out.print("Digite um valor para inserir na Pilha: " );
						valor = tec.nextInt();
						pilha.adiciona(valor);
					}
					if (pp == 2) {
						System.out.print("Retirado o elemento "+ pilha.retira()+"\n" );
					}
					
					
					pilha.mostrar();
					System.out.print("\n1 - Adicionar na Pilha \n"
							+ "2 - Retirar da Pilha \n"
							+ "0 - Voltar \n"
							+ "Digite a operação: ");
					System.out.print("" );
					pp = tec.nextInt();

				}while (pp != 0);
				
			}
			
			if (p == 3) {
				
			}
		
			
			
			System.out.print("\n1 - Fila\n"
					+ "2 - Pilha \n"
					+ "3 - Lista \n"
					
					+ "Digite a operação: ");
			p = tec.nextInt(); 
			System.out.println("");

		}while (p != 0);
		
	}
}