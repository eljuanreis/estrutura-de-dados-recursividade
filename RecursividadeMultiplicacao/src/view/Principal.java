package view;

import controller.MultiplicationController;

public class Principal {

	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		
		MultiplicationController multiplicationController = new MultiplicationController();
		
		int soma = multiplicationController.soma(a, b);
		System.out.println(soma);
	}

}
