package application;

import entities.Employe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Power_Loft2{

	

	  public static void main(String[] args) {
		  byte val1 = (byte) 113;
	      System.out.println("Byte = "+ val1);
	      int res = val1 & 0xFF;
	      System.out.println("Hexadecimal = "+Integer.toHexString(res));
	  }
	}

