package controller;

public class VetorAnalistController {
	int pares = 0;
	
	public VetorAnalistController() {
		super();
	}
	
	public int pares(int vetor[], int tamanho) {		
		if (tamanho == 0) {
			return pares;
		}
		
		tamanho = tamanho - 1;
		
		if (vetor[tamanho] % 2 == 0) {
			pares++;
		}
		
		return pares(vetor, tamanho);
	}

}
