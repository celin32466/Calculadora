package Entities;

public class calculation {
	
	
	private double a , b;
	
	calculation(){
	}

	public calculation(double a, double b) {
		this.a = a;
		this.b = b;
		
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double soma() {
		return a+b;
	}
	public double subtração() {
		return a-b;
	}
	public double multiplicação() {
		return a*b;
	}
	public double divisão() {
		return a/b;
	}

}
