package br.inf.ufg.palindromo;

public class Palindromo {
	  public boolean ehPalindromo(String frase) {
	    String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
	    for(int i = 0; i < fraseFiltrada.length()/2; i++) {
	      if(fraseFiltrada.charAt(i) != fraseFiltrada.charAt((fraseFiltrada.length()-1) - i)) {
	        return false;
	      }
	    }
	    return true;
	  }
	}