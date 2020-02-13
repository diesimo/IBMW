/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;


import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProdParabrisas extends Thread{
    
   
    Almacen almacen=new Almacen();
   static private int contador;
    private int [] StoreR = new int[30];
  
    
    public void run()
    {
        
        while(true){
        
        if(almacen.getStoreP() <=29 & almacen.isT()==true)
        {
        System.out.println("Creacion parabrisas");
             contador++;
            almacen.setStoreP(contador);
         
        }else   
        {
            
        }
        
           try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProdParabrisas.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
     
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int[] getStoreR() {
        return StoreR;
    }

    public void setStoreR(int[] StoreR) {
        this.StoreR = StoreR;
    }

    
    
    


     
    
    
}
