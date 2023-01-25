package Figuras;


public class Circulo {

	
	float radio;
	float circunferencia;
	float areaDelCirculo;
	
	public Circulo() {
		this(173549);
	}
	
public Circulo(float radio){
		
		this.radio = radio;
}
public double calculaCircunferencia(float circunferencia) {
	System.out.printf("%4.2f",2*Math.PI*radio);
	
	return circunferencia;
}
public double calcularAreaDelCirculo(float areaDelCirculo) {
	System.out.printf("%4.2f",Math.PI*(Math.pow(radio, 2)));
	return areaDelCirculo;
}
}
