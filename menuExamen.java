package Figuras;

import java.util.Scanner;

public class menuExamen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Examen contructor = new Examen();
		
		
		String Cadena = "anita lava la tina";
		String frase2 = "hasta luego cocodrilo";
		
		try {
			
			while(true) {
				System.out.println("Esoge una de las 5 opciones");
				System.out.println("1. primeraMayuscula");
				System.out.println("2. invertirCadena");
				System.out.println("3. vocalesMayusculas");
				System.out.println("4. FizzBuzz");
				System.out.println("5. Palindromo");
				
				int opciones = Integer.parseInt(input.nextLine());
				
				switch(opciones) {
				
				case 1:
					System.out.println(Examen.primeraMayuscula(Cadena));
					break;
				case 2:
					System.out.println(Examen.invertirCadena(null));
					break;	
				case 3:
					System.out.println(Examen.Mayuscula(frase2));
					break;
				case 4:
					for(int i = 1; i <= 100; i++ ) {
						
						System.out.println(Examen.fizzBuzz(i));
					}
					break;
				
				case 5:
					Scanner inv = new Scanner (System.in);
					String escrito = inv.nextLine();
					System.out.println(Examen.palidromo(escrito));
					break;
					
				default:
					System.out.println("opcion invalida");
					break;
				}
			}
		}finally{
			
		}
		

	}

}
