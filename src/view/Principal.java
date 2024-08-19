package view;

import controller.ControllerSerie;

public class Principal {
	
	public static void main(String[] args) {
		
		ControllerSerie controller = new ControllerSerie();
		
		double res = controller.serie(3);
		
		System.out.println(res);
	}
	
}
