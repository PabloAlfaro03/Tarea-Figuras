package Figuras;


public class Circulo {

	
	double radio;

	
	public Circulo() {
		this(173549);
	}
	
public Circulo(double radio){
		
		this.radio = radio;
}
public double calculaCircunferencia() {
	
	
	return (2*Math.PI*radio);
}
public double calcularAreaDelCirculo() {
	
	return (Math.PI*(Math.pow(radio, 2)));
}
}
