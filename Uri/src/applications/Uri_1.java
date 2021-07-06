package applications;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		final double PI=3.14159;
		double area= (Math.pow(raio, 2)*PI);
		
		System.out.printf("A=%.4f%n",area);
			
		

	}

}
