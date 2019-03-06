
/*integrantes: 
  Mayeleen Rodriguez Gomez cod:2016114118
  Luis Hatum Clavijo
*/

package tragamonedas;

import java.util.*;

public class Programa {
    
    public static void main(String[] args) {
        
        Fruta[] combinacion1 = {Fruta.FRESA, Fruta.FRESA, Fruta.FRESA};
	Premio premio1 = new Premio(combinacion1, 20);
	Fruta[] combinacion2 = {Fruta.SANDIA, Fruta.FRESA,Fruta.SANDIA};
	Premio premio2 = new Premio(combinacion2, 10);
	Maquina maquina = new Maquina(3, 0.5, premio1, premio2);
        
	System.out.println("Introduzca el credito: ");
	Scanner teclado = new Scanner(System.in);
        
	double credito = teclado.nextDouble();
	teclado.nextLine();
	maquina.incrementarCredito(credito);
	
	while (maquina.getCredito() > 0){
            
            Fruta[] combinacion = maquina.jugar();
            System.out.println(Arrays.toString(combinacion)
            + " --- " + "lo siento perdiste. tu nuevo credito es: " + maquina.getCredito());
            
            System.out.println("Pulse Intro para volver a jugar");
            teclado.nextLine();
	}
    }
}