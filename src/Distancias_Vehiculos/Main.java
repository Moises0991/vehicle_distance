package Distancias_Vehiculos;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad=0;
		double mayor=0,menor=0,suma=0,cantidad2=0;
		int M1=0,M2=0,m1=0,m2=0;
		boolean aux=true;
		
		do {
			
			cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de vehiculos a registrar"));
			
			if(cantidad>1) {

				double tiempo=Integer.parseInt(JOptionPane.showInputDialog("Tiempo de recorrido","segundos"));
				Vehiculos[] vehiculos=new Vehiculos[cantidad];
				
				for(int i=0;i<cantidad;i++) {
					
					double x=Integer.parseInt(JOptionPane.showInputDialog("Punto inicial vehiculo "+(i+1),"x"+(i+1)));
					double y=Integer.parseInt(JOptionPane.showInputDialog("Punto inicial vehiculo "+(i+1),"y"+(i+1)));
					double velocidad=Integer.parseInt(JOptionPane.showInputDialog("Velocidad coche "+(i+1),"m/s"));
					double angulo=Integer.parseInt(JOptionPane.showInputDialog("Angulo coche "+(i+1),"grados"));
					
					vehiculos[i] = new Vehiculos(x,y,velocidad,angulo,tiempo);	
					
				}
				
				Recta distancias = new Recta(0,0,0,0);
				
		        for(int i=0;i<cantidad-1;i++) {
		        	
		        	for(int i2=i+1;i2<cantidad;i2++) {
		        		
		        		distancias.puntoInicial = vehiculos[i].puntoFinal;
		        		distancias.puntoFinal = vehiculos[i2].puntoFinal;
		        		
		        		JOptionPane.showMessageDialog(null, "La distancia final del vehiculo "+(i+1)+" con el vehiculo "+(i2+1)+" es de "+distancias.distanciaPuntos()+" metros.");
		        		
		        		
		        		if(aux) {
		        			menor=distancias.distanciaPuntos();
			        		m1=i+1;
			        		m2=i2+1;
			        		aux=false;
		        		}
		        		
		        		if(distancias.distanciaPuntos()>=mayor) {
		        			
		        			mayor=distancias.distanciaPuntos();
		        			M1=i+1;
		        			M2=i2+1;
		        			
		        		}
		        		
		        		if(distancias.distanciaPuntos()<=menor) {
		        			
		        			menor=distancias.distanciaPuntos();
		        			m1=i+1;
		        			m2=i2+1;
		        			
		        		}
		        		
		        		suma+=distancias.distanciaPuntos();
		        		cantidad2++;
		       
		        	}
		        }
		        
		        
		        JOptionPane.showMessageDialog(null,"El Vehiculo "+M1+" con Vehiculo "+M2+" son los que estan mas alejados.\nCon una distancia de "+mayor+" metros");
		        JOptionPane.showMessageDialog(null,"El Vehiculo "+m1+" con Vehiculo "+m2+" son los que estan mas cercanos.\nCon una distancia de "+menor+" metros");
		        JOptionPane.showMessageDialog(null,"La distancia promedio entre todos vehiculos es de "+(suma/cantidad2)+" metros");
		        
			}else {
				
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "Es necesario que se registre mas de un vehiculo",null, JOptionPane.ERROR_MESSAGE);

			}
			
		}while(cantidad<=1);
	
	}

}
