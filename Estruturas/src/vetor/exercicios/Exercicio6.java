package vetor.exercicios;

import vetor.Contato;
import vetor.teste.Lista;

public class Exercicio6 {

	public static void main(String[] args) {
		Lista lista = new Lista(4);
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
		
		Contato c4 = new Contato("Contato 4", "1234-4454", "contato4@email.com");
		
		lista.adiciona(c1);
		lista.adiciona(c2);
		lista.adiciona(c3);
		lista.adiciona(c4);
		
		
		System.out.println(lista);
		
		
		
		System.out.println(lista.remove(c4)+"\n"+lista);
	}

}
