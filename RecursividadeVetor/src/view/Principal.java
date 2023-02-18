package view;

import controller.VetorAnalistController;

public class Principal {

	public static void main(String args[]) {
		int[] vetor = {2,4,6,11};
		int tamanho = vetor.length;
		
		VetorAnalistController vetorAnalistController = new VetorAnalistController();
		
		int pares = vetorAnalistController.pares(vetor, tamanho);
		System.out.println(pares);
	}
}
