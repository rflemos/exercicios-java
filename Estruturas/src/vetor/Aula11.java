package vetor;

import java.util.ArrayList;

public class Aula11 {

	public static void main(String[] args) {
		
		ArrayList<String> letters = new ArrayList<>();  
		letters.add("C");  
		letters.add("B");  
		letters.add("C");  
		letters.add("D");  
		letters.add("E");  
		System.out.println(letters);            // [A, B, C, D, E]  
		System.out.println(letters .remove("C"));   // prints true  
		System.out.println(letters);    
	}

}
