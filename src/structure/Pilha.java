package structure;



public class Pilha {
	
	public No top;
	public int tamanho;
	
	public Pilha(){
		tamanho = 0;
	}
	
	public void adiciona (int num) {
		No no = new No();
		no.num = num;
		no.proximo = top;
		top = no;
		tamanho++;
	}
	
	public int retira() {
		if (top == null) {
			return -1;
		}
		int num = top.num;
		top = top.proximo;
		tamanho--;
		return num;
		
	}
	
	public void mostrar() {
		No local = top;
		System.out.println("");
		for (int i=0; i < tamanho; i++) {
			System.out.print(" "+local.num);
			local = local.proximo;
		}
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* public int vetor[];
	public int top;
	
	Pilha(int tamanho) {
		vetor = new int [tamanho];
		top = 0;
	}
	
	public boolean adicionar(int valor) {
		if (vetor.length == top) {
			return false;
		}
		vetor [top] = valor;
		top++;
		return true;
	}
	
	public int retirar() {
		if(top == 0) {
			return -1;
		}
		top--;
		return vetor[top];
	} */
}
