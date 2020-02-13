/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

/**
 *
 * @author Diego Simoes
 */
public class IBMW {

    
    public static void main(String[] args) {
    
       ProdRuedas hilo1= new ProdRuedas();
       ProdParabrisas hilo2= new ProdParabrisas();
       ProdMotor hilo3= new ProdMotor();
   
       Almacen almacen= new Almacen();
        
      while(true){
        hilo1.start();
        hilo2.start();
       
        hilo3.start();
    }
        // repeticion de hilo
             
        
            
        
        
        
        
       
    }
    
}
