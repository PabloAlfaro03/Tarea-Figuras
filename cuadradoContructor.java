package Figuras;


public class cuadradoContructor {

	double longitud;
	
	
	public cuadradoContructor() {
		this(173549);
	}
	public cuadradoContructor(double longitud){
		
		this.longitud = longitud;
		
		
	}
	public double calculaDiagonal() {
		
		return (Math.sqrt(Math.pow(longitud, 2)+(Math.pow(longitud, 2))));
	}
	public double calcularArea() {
		
		return (longitud*longitud);
	}
	public double calcularPerimetro() {
		
		return (longitud+longitud+longitud+longitud);
}
}
