package Figuras;
import java.util.Scanner;

public class FigurasFinal{
	
	
	public static void main(String[] args) {
		
		System.out.println("Que figura quiere crear?, circulo o cuadrado?");
		Scanner input = new Scanner(System.in);
		String escrito = input.next();
		
			
			if(escrito.equals("cuadrado")) {
				System.out.println("inserte el valor del lado");
				String lado = input.next();
				int longitud = Integer.parseInt(lado);
				cuadradoContructor figura = new cuadradoContructor(3);
				
				System.out.println("que quiere calcular?");
				System.out.println("Diagonal, perimetro o area?");
				
				String respuesta = input.next();
				
				if (respuesta.equals("Diagonal")) {
					System.out.println(figura.calculaDiagonal(0));
					
					
				}else if(respuesta.equals("perimetro")) {
					System.out.println(figura.calcularPerimetro(0));
					
				}else if(respuesta.equals("area")) {
					
					System.out.println(figura.calcularArea(0));
				}else {
					System.out.println("error");
				}

				
			}else if (escrito.contains("circulo")){
				System.out.println("inserte el valor del radio");
				String radio = input.next();
				int longitud = Integer.parseInt(radio);
				Circulo circulo = new Circulo(173549);
				
				System.out.println("que quiere calcular?");
				System.out.println("circunferencia o area del circulo?");
				
				String respuesta2 = input.next();
				
				if (respuesta2.contains("circunferencia")) {
					System.out.println(circulo.calculaCircunferencia(0));
					
					
				}else if(respuesta2.contains("area del circulo")) {
					System.out.println(circulo.calcularAreaDelCirculo(0));
				
			}else {
				System.out.println("error");
			}
			input.close();
	
		
	}
}
}