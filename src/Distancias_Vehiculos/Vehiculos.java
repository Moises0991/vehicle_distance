package Distancias_Vehiculos;

public class Vehiculos extends Recta {

	private double angulo,velocidad,tiempo;
	
	public Vehiculos(double x,double y,double velocidad,double angulo,double tiempo) {
		
		super(x,y,0,0);
		this.velocidad=velocidad;
		this.angulo=angulo;
		this.tiempo=tiempo;
		
		Pfinal();
		
	}
	
	public void Pfinal() {
		
		double radianes;
		radianes = (angulo * 2.0 * Math.PI)/360.0;
		puntoFinal.x = puntoInicial.x + velocidad * tiempo * Math.cos(radianes);
		puntoFinal.y = puntoInicial.y + velocidad *tiempo * Math.sin(radianes);
		
	}
}
