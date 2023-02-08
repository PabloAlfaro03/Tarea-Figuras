package Figuras;

import java.util.Scanner;

public class Examen {
	
	// primera mayuscula
	public static String primeraMayuscula(String primeraLetra) {
		
		if(primeraLetra == null || primeraLetra.length() == 0)
		    return primeraLetra;	
		
		char[] caracteres = primeraLetra.toCharArray();
		
		
		caracteres[0] = Character.toUpperCase(caracteres[0]);

		return new String(caracteres);
	    }

	//--------------------------------------------------------------------------------
	
	// invetir cadena
	
	public static String invertirCadena(String invertir) {
		
		
		String palabra = "";
		Scanner inv = new Scanner (System.in);
		palabra = inv.nextLine();
		
		for(int i = palabra.length()-1; i >= 0 ; i-- ) {
			System.out.print(palabra.charAt(i));
		}
		System.out.println("");
		return palabra;
		
		
	}
	
	//------------------------------------------------------------------------------
	
	// vocales en mayuscula
	
	public static String Mayuscula(String vocal) {
		
		String newfrase = vocal.replace('a', 'A').replace('e', 'E').replace('i', 'I').replace('o', 'O').replace('u', 'U');
		
		return newfrase;
	}
	
	//-----------------------------------------------------------------------------
	// FizzBuzz
	
	public static String fizzBuzz(int valor) {
		
		if(valor % 3 == 0 && valor % 5 == 0) {
			return "FizzBuzz";
			
		} else if (valor % 5 == 0) {
			return "Buzz";
		} else if (valor % 3 == 0) {
			return "Fizz";
		}else {
			return String.valueOf(valor);
		}
	}
	
	//---------------------------------------------------------------------------------
	// Palindromo
	
	
	public static boolean palidromo(String pal) {
		
		boolean palindro = true;
		pal = pal.replace(" ", "");
		
			for(int i = 1; i <= pal.length()/2; i++ ) {
			
				if(pal.charAt(i) != pal.charAt(pal.length()-1-i)) {
					palindro = false;
					break;
				}
		}
		
		return palindro;
	}
		
	}

