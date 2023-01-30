package Figuras;
import java.util.Scanner;

public class FigurasFinal{
	
	
	public static void main(String[] args) {
		
		System.out.println("Que figura quiere crear?, circulo o cuadrado?");
		Scanner input = new Scanner(System.in);
		String entrada = input.nextLine();
		boolean opciones = true;	
		
		if(entrada.equals("cuadrado")) {
			
			while(opciones) {
				System.out.println("1. obtener perimetro");
				System.out.println("2. obtener area");
				System.out.println("3. obtener diagonal");
				System.out.println("4. salir");
				System.out.print("escoje una opcion");
				int casos = Integer.parseInt(input.nextLine());
				
				double lado;
				cuadradoContructor figura = new cuadradoContructor();
				switch (casos) {
				
				case 1:
					
					System.out.print("escriba el valor del lado");
				    lado = Double.parseDouble(input.nextLine());
					figura.longitud = (double)lado;
					System.out.println("el perimetro del cuadrado es:" + figura.calcularPerimetro());
					break;
					
				case 2:
					
					System.out.print("escriba el valor del lado");
					lado = Double.parseDouble(input.nextLine());
					figura.longitud = (double)lado;
					System.out.println("el area del cuadrado es:" + figura.calcularArea());
					break;
					
				case 3:
					
					System.out.print("escriba el valor del lado");
					lado = Double.parseDouble(input.nextLine());
					figura.longitud = (double)lado;
					System.out.println("la diagonal del cuadrado es:" + figura.calculaDiagonal());
					break;
					
				case 4:
					System.out.println("saliendo...");
					System.exit(0);
					break;
					
				default:
					System.out.println("opcion invalida inserte otro valor");
					break;
				}
			}
			
		}else if(entrada.contains("circulo")){
			
			while(opciones) {
				System.out.println("1. obtener la circunferencia del circulo");
				System.out.println("2. obtener area del circulo");
				System.out.println("3. salir");
				System.out.print("escoje una opcion");
				int casos = Integer.parseInt(input.nextLine());
				
				double radio;
				Circulo circulo = new Circulo();
				switch (casos) {
				
				case 1:
					
					System.out.print("escriba el valor del radio");
				    radio = Double.parseDouble(input.nextLine());
					circulo.radio = (float)radio;
					System.out.println("el valor de la circunferncia es:" + circulo.calculaCircunferencia());
					break;
					
				case 2:
					
					System.out.print("escriba el valor del radio");
					radio = Double.parseDouble(input.nextLine());
					circulo.radio = (float)radio;
					System.out.println("el area de la circunferencia es:" + circulo.calcularAreaDelCirculo());
					break;
					
				case 3:
					System.out.println("saliendo...");
					System.exit(0);
					break;
					
				default:
					System.out.println("opcion invalida inserte otro valor");
					break;
				}
			}
			
		}
		
			
}
}