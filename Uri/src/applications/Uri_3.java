package applications;

import java.util.Locale;
import java.util.Scanner;

public class Uri_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia=0;
		int hora = 0;
		int minuto=0;
		int segundo=0;
		int tempoTotal=0;
		
		String st = sc.next();
		//System.out.print("Dia ");
		int diaInicio= sc.nextInt();
		int horaInicio=sc.nextInt();
		st=sc.next();
		int minutoInicio=sc.nextInt();
		st=sc.next();
		int segundoInicio=sc.nextInt();
		sc.next();
		
		//System.out.print("Dia ");
		int diaFim= sc.nextInt();
		int horaFim=sc.nextInt();
		st=sc.next();
		int minutoFim=sc.nextInt();
		st=sc.next();
		int segundoFim=sc.nextInt();
		
		int totalInicio=(horaInicio*3600)+(minutoInicio*60) + (segundoInicio);
		int totalFim=(horaFim*3600)+(minutoFim*60) + (segundoFim);
		
		// dia
		if (totalInicio <= totalFim) {
			dia = diaFim - diaInicio;
		} else {
			dia = diaFim - diaInicio - 1;
		}
		
		
		if(totalInicio>totalFim ) {
			tempoTotal=86400-(totalInicio-totalFim);
		}
		
		else {
			tempoTotal=totalFim-totalInicio;
		}
		
		
	
		
		hora=tempoTotal/3600;
		minuto=(tempoTotal%3600)/60;
		segundo=(tempoTotal%3600)%60;
		
		
		
		
		
		
		
		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(minuto + " minuto(s)");
		System.out.println(segundo + " segundo(s)");
		
		
	
		
		
		
		
			
		

	}

}
