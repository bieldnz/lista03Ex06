package controller;

public class ControllerSerie {
	
	public ControllerSerie() {
		super();
	}
	
	public double serie(int n) {
		if(n > 1) {
			double div = ((double)1/fat(n));
			double result = div + serie(n-1);
			return result;
		}else {
			return 1.0;
		}
	}
	
	public int fat(int n) {
		if(n>0) {
			int result = n * fat(n-1);
			return result;
		}else {
			return 1;
		}
	}
	
}
