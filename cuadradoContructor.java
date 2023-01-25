package Figuras;


public class cuadradoContructor {

	float longitud;
	float diagonal;
	float perimetro;
	float area;
	
	public cuadradoContructor() {
		this(173549);
	}
	public cuadradoContructor(float longitud){
		
		this.longitud = longitud;
		
		
	}
	public float calculaDiagonal(float diagonal) {
		System.out.printf("%4.2f",Math.sqrt(Math.pow(longitud, 2)+(Math.pow(longitud, 2))));
		
		return diagonal;
	}
	public float calcularArea(float area) {
		System.out.printf("%4.2f",longitud*2);
		return area;
	}
	public float calcularPerimetro(float perimetro) {
		System.out.printf("%4.2f",longitud*4);
		return perimetro;
}
}
