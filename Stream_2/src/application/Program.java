package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter full file path: ");
		 String path = sc.next();
		 List<Employe> list = new ArrayList<>();
		 
		 try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			 String line = br.readLine();
			 
			
			 while(line!=null) {
			String [] fields = line.split(","); 	 
			 list.add(new Employe(fields[0], fields[1], Double.parseDouble(fields[2])));
			 line = br.readLine();
			 } 
				
				
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	
		 
		 System.out.print("Enter Salary: ");
		 double salary = sc.nextInt();
		 
		 System.out.println("Email of people whose salary is more than: " + salary);
		 double sum = list.stream().filter(p->p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0,(x,y) -> x + y);
		
		 List<String> emails = list.stream().map(p->p.getEmail()).sorted((p1 , p2)->p1.toUpperCase().compareTo(p2.toUpperCase())).collect(Collectors.toList());
		 
		 
		 emails.forEach(System.out::println);
		 
		 
		 System.out.println("Sum of salary of people whose name starts with 'M': " + sum);		 
		 
		 
}
		 

	}


