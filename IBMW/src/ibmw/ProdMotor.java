/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Simoes
 */
public class ProdMotor extends Thread  {
    
    ProdParabrisas para= new ProdParabrisas();
    
    public void run()
    {
    while(true){
        System.out.println("Creacion de motor");
     
         
       
     
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProdMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
}
