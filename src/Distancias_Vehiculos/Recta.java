package Distancias_Vehiculos;

public class Recta {
	
	public Punto puntoInicial,puntoFinal;
	
	public Recta(double xInicial,double yInicial,double xFinal,double yFinal) {
		
		puntoInicial = new Punto(xInicial,yInicial);
		puntoFinal=new Punto(xFinal,yFinal);
	}
	
	
	public double distanciaPuntos() {
		
		return Math.sqrt(Math.pow(puntoInicial.x-puntoFinal.x, 2)+Math.pow(puntoInicial.y-puntoFinal.y,2));
	}

}
