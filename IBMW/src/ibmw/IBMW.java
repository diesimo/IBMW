/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;
 import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Diego Simoes
 */
public class IBMW {

    
    public static void main(String[] args) {
    
       ProdRuedas hilo1= new ProdRuedas();
       ProdParabrisas hilo2= new ProdParabrisas();
       ProdMotor hilo3= new ProdMotor();
       Ensambladores hilo4 =new Ensambladores();
   
       Almacen almacen= new Almacen();
        
  
        hilo1.start();
                        try {
      
                        hilo1.sleep(500);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                     }
                   
        hilo3.start();
         try {
      
                        hilo3.sleep(500);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                     }
         
       hilo2.start();
       try {
      
                        hilo2.sleep(500);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                     }
        
        hilo4.start();
        try {
            hilo4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(IBMW.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
      
                        hilo4.sleep(500);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                     }
    
        // repeticion de hilo
             
        
            
        
        
        
        
       
    }
    
}
