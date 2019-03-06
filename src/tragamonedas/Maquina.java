
/*integrantes: 
  Mayeleen Rodriguez Gomez cod:2016114118
  Luis Hatum Clavijo
*/
package tragamonedas;


import java.util.Random;
import java.util.Arrays;
public class Maquina {
    
    private int nCasillas;
    private double precio;
    private double credito;
    private Premio[] prem;
	
    public Maquina(int casillas, double price, final Premio... q){
        this.nCasillas = casillas;
	this.precio = price;
	this.prem = q;
    }
	
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getCredito() {
        return credito;
    }
    
    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public int getnCasillas() {
        return nCasillas;
    }
    
    public Premio[] getPrem() {
        return prem;
    }
    
    public void incrementarCredito(double o){
        this.credito+=o;
    }
    
    public void cobrar(){
        this.credito=0;
    }

    public Fruta[] jugar(){
        if(this.credito>=this.precio){
            this.credito-=this.precio;
            Fruta q[] = new Fruta[nCasillas];
            Fruta[] fruit = Fruta.values();
            int i=0;
            for(i=0; i<nCasillas; i++){
                Random generador = new Random();
		int index = generador.nextInt(5);
		q[i]=fruit[index];
            }
            i=0;
            for(i=0; i<prem.length; i++){
                if(Arrays.equals(q, prem[i].getCombinacion())==true){
                    System.out.println("Felicitaciones has ganado" + prem[i].getdPremio() + "euros");
                    this.credito=prem[i].getdPremio();
		}
            }
            return q;
	}else{
            return null;
            }
		
    }
}
