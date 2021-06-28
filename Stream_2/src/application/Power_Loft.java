package application;

import entities.Employe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Power_Loft{

	

	  public static void main(String[] args) {
	    Pattern pattern = Pattern.compile("(?<=OEE:)((\\b[0-9]+)?\\.)?[0-9]+\\b(?=;)", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("OEE:1000.00;PERF:55253.555;");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println();
	    } else {
	      System.out.println("Match not found");
	    }
	  }
	}

