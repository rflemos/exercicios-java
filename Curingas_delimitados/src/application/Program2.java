package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		/*List<? super Number> myNums referencia a uma lista que aceita qualquer super tipo de number exemplo(object)
		  conseguimos adicionar qualquer valor que seja supertipo de number porem não conseguimos acessar (contravariancia)*/
		List<? super Number> myNums = myObjs;
	
		myNums.add(10);
		
		myNums.add(3.14);
		// Number x = myNums.get(0); // erro de compilacao

	}

}
