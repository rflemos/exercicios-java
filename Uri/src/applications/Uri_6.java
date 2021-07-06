package applications;

import java.util.Locale;
import java.util.Scanner;

public class Uri_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char [][] matriz = new  char[13][13];
		
		
		
		for(int i=0, a=0 ;i<matriz.length;i++,a++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(i<j+1 && j<matriz.length-a || i+1>j&&j+2>matriz.length-a) {
					
				if(j<matriz[i].length-1)	
				System.out.print("X ");
				else
					System.out.print("X");
				}
				
				else {
					if(j<matriz[i].length-1)	
						System.out.print("B ");
						else
							System.out.print("B");
						}
				}
			System.out.println();
				}
			
			}
		}
		
	
			
		
		
		
			
		
	

		
		
		
		
		
		
		
		
	
		
		
		
		
			
		

	


