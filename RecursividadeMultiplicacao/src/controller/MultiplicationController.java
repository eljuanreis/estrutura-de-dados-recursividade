package controller;

public class MultiplicationController {

	public MultiplicationController() {
		super();
	}
	
	public int soma(int a, int b) {
		if (b == 0) {
			return 0;
		}
		
		return a + soma(a, (b-1));
	}

}
