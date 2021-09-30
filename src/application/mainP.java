package application;
import java.util.Scanner;
import structure.Fila;
import structure.Lista;
import structure.Pilha;
public class mainP {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int p = 10,valor=0,indice;
		int pp = 10;
		Fila f = new Fila();
		Pilha pilha = new Pilha();
		Lista l = new Lista();
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
				do {	
					if (pp == 1) {
						System.out.print("Digite um valor para inserir no inicio da Lista: " );
						valor = tec.nextInt();
						l.adicionaInicio(valor);
					}
					if (pp == 2) {
						System.out.print("Retirado o elemento do inicio da lista: "+ l.retirarInicio()+"\n" );
					}
					if (pp == 3) {
						System.out.print("Digite um valor para inserir no fim da Lista: " );
						valor = tec.nextInt();
						l.adicionaUltimo(valor);
					}
					if (pp == 4) {
						System.out.print("Retirado o elemento do final da lista: "+ l.retirarUltimo()+"\n" );
					}
					if (pp == 5) {
						System.out.print("Digite um valor: " );
						valor = tec.nextInt();
						System.out.print("Indice de inserção:" );
						indice = tec.nextInt();
						
						l.adicionaIndice(indice,valor);
					}
					if (pp == 6) {
						System.out.print("Digite o indice para remover o valor da lista: " );
						indice = tec.nextInt();
						l.retirarIndice(indice);
					}
					
					
					l.mostrar();
					System.out.print("\n1 - Adicionar no inicio\n"
							+ "2 - Retirar do inicio \n"
							+ "3 - Adicionar no fim \n"
							+ "4 - Retirar do fim \n"
							+ "5 - Adicionar em um certo indice\n"
							+ "6 - Retirar de um certo indice \n"
							+ "0 - Voltar \n"
							+ "Digite a operação: ");
					System.out.print("" );
					pp = tec.nextInt();

				}while (pp != 0);
				
				
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