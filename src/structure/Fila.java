package structure;

public class Fila {
	
	public No inicio;
	public No cabeca;
	public int tamanho;
	
	
	public void verificaCabeca(){
		if(cabeca == null) {
			System.out.println("Fila vazia");
		}
		System.out.print("Elemento na ultima posição: "+this.cabeca.num+"\n" );
	}
	

	public void adiciona(int num) {
		No no = new No();
		no.num = num;
		no.proximo = inicio;
		inicio = no;
		if(tamanho == 0) {
			cabeca = no;
		}
		tamanho++;
	}
	
	public int retirar() {
		if(tamanho == 0) {
			return -1;
		}
		int num = cabeca.num;
		if(tamanho == 1) {
			inicio = null;
			cabeca = null;
		}else {
			No local = inicio;
			while (local.proximo != cabeca) {
				local = local.proximo;
			}
			cabeca = local;
			cabeca.proximo = null;
		}
		tamanho--;
		return num;
	}
	
	public void mostrar() {
		No local = inicio;
		System.out.println("");
		for (int i=0; i < tamanho; i++) {
			System.out.print(" "+local.num);
			local = local.proximo;
		}
		System.out.println("");
		
	}
	
	
}

