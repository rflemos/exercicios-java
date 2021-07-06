package applications;

import java.util.Locale;
import java.util.Scanner;

public class Uri_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
		if(i % 2 == 0 ) {
		int result = (int) Math.pow(i, 2);
		System.out.println(i+"^2 = " + result);
		}
			
		}	
	}
}
		
		
		
		
		
		
		
		
	
		
		
		
		
			
		

	


