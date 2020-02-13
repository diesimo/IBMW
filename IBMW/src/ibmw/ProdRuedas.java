
        
package ibmw;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ProdRuedas extends Thread {
    
    
  
    Almacen almacen = new Almacen();
   private int contador=0;
   private int Array[];
   @Override
   public void run()
   {
       while(true){
       System.out.println("Produci Ruedas");
       
       almacen.setStoreR(contador);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
     
   
   }
   
    
            
    
            
   //Productor Parabrisas
    
    
    
  //Productor motores
    
}
