package view;

import controller.DivisionController;

public class Principal {

	public static void main(String[] args) {
		int a = 20;
		int b = 3;

		DivisionController divisionController = new DivisionController();
		int resto = divisionController.divider(a, b);
		System.out.println(resto);
	}

}
