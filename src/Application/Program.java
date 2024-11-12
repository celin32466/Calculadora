package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.calculation;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("calculadora iniciada");
		System.out.print("escolha o primeiro numero: ");
		double a = sc.nextDouble();
		System.out.print("escolha o segundo numero: ");
		double b = sc.nextDouble();
		
		calculation cal = new calculation(a , b);
		
		System.out.println("digite (s) se voçê quer somar os numeros , (b) para subtrair , (m) para multiplicar , (d) para dividir");
		
		char ch = sc.next().charAt(0);
		
		if (ch == 's') {
			System.out.println("seu resultado: " + cal.soma());
		}
		else if(ch == 'b') {
			System.out.println("seu resultado: " + cal.subtração());
		}
		else if(ch == 'm') {
		System.out.println("seu resultado: " + cal.multiplicação());
		}
		else if(ch == 'd') {
			System.out.println("seu resultado: " + cal.divisão());
		}
		
		
		
		
		
		sc.close();

	}

}
