package structure;



public class Lista {
	
	No inicio;
	No ultimo;
	int tamanho =0;
	
	
	public void adicionaInicio(int num) {
		No no = new No ();
		no.num = num;
		no.anterior = null;
		no.proximo = inicio;
		if (inicio != null) {
			inicio.anterior = no;
			
		}
		inicio = no;
		if (tamanho == 0) {
			ultimo = inicio;
		}
		tamanho++;
		
	}
	
	public int retirarInicio() {
		if (inicio == null) {
			return -1;
		}
		int num = inicio.num;
		inicio = inicio.proximo;
		if (inicio != null) {
			inicio.anterior = null;
		}else {
			ultimo = null;
		}
		tamanho--;
		return num;
	}
	
	public void adicionaUltimo(int num) {
		No no = new No();
		no.num = num;
		no.proximo = null;
		no.anterior = ultimo;
		
		if(ultimo != null) {
			ultimo.proximo = no;
		}
		ultimo = no;
		
		if (tamanho == 0) {
			inicio = ultimo;
		}
		tamanho++;
		
	}
	
	public int retirarUltimo() {
		if (ultimo == null) {
			return -1;
			
		}
		int num = ultimo.num;
		ultimo = ultimo.anterior;
		if (ultimo != null) {
			ultimo.proximo = null;
		} else {
			inicio = null;
		}
		
		tamanho--;
		return num;
	}
	
	public void adicionaIndice(int indice, int num) {
		if (indice <= 0) {
			adicionaInicio(num);
		} else if(indice >= tamanho) {
			adicionaUltimo(num);
		} else {
			No local = inicio;
			for(int i = 0; i<indice-1;i++) {
				local = local.proximo;
			}
			No no = new No();
			no.num = num;
			no.anterior = local;
			no.proximo = local.proximo;
			local.proximo = no;
			no.proximo.anterior = no;
			tamanho++;
		}
		
	}
	
	public int retirarIndice(int indice) {
		if (indice < 0 || indice >=tamanho || inicio == null) {
			return -1;
		} else if (indice == 0) {
			return retirarInicio();
		}else if (indice == tamanho-1) {
			return retirarUltimo();
		}
		No local = inicio;
		for(int i = 0; i<indice; i++) {
			local = local.proximo;
		}
		local.anterior.proximo = local.proximo;
		local.proximo.anterior = local.anterior;
		tamanho--;
		return local.num;
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
