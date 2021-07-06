package applications;

import java.util.Locale;
import java.util.Scanner;

public class Uri_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int value =1;
		while(e != 0) {
			
		int[][] matriz = new  int [e][e];
		
		for(int i=0, a=0 ,inc=0;i<matriz.length;i++,a++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(i>0 && i<matriz.length-1 && j>i-a && i<matriz.length-a && value<i+1 ||
				   i>0 && i<matriz.length-1 && j>i-a && i>matriz.length-a && value<=matriz.length-1-a)
				value++;
				
				
				
				matriz[i][j] = value;
				System.out.print(matriz[i][j] + " ");
				
				
				
				
				
				
				}
		value=1;
			System.out.println();
				}
		e= sc.nextInt();
			
			}
		}
	}
		
	
		
		
		
	
		
		
		
		
			
		

	


