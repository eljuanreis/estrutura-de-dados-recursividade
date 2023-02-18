package controller;

public class DivisionController {

	public DivisionController() {
		super();
	}
	
	public int divider(int dividendo, int divisor) {
		if (divisor > dividendo) {
			return dividendo;
		} else {
			dividendo = dividendo - divisor;

			return divider(dividendo, divisor); 
		}
	}

}
