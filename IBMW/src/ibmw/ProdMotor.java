/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.*;
/**
 *
 * @author Diego Simoes
 */
public class ProdMotor extends Thread  {
    
   
   static private final Semaphore permiso= new Semaphore(0,true);
   static private int n1;
   static private int n2;
   static private int  contract=3;
   Almacen almacen= new Almacen();
   
    @Override
    public void run()
    {
     
        Ensambladores emsa = new Ensambladores();
        
       while(true)
        {
            
                 if(permiso.availablePermits()<15){
                     
                     System.out.println("Numero n1 de M: " + n1);
                    for(int i=1;i<=contract;i++)
                     {
                          if(n1==15)
                            {
                                  n1=0;
                            }
                            if(n1<=14)
                            {
                                if(almacen.getStoreM(n1)==0)
                                     {
                                     generar();
                                     emsa.addM(1);
                                      }
                                 n1++;
                            }
                    }
                     try {
      
                        Thread.sleep(500);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                     }
                   
                    if(n1==3)
                    {
                       
                        
                        
                    }
                   // System.out.println(permiso.availablePermits());
                
                     
                 }else
                 {
                    // System.out.println("Almacen de ruedas lleno");
                     
                 
                 }
        
                 
        
                 
                 
                 
        }
       
       
       
    
    }
    
    public void addM()
    {
       
        permiso.release();
    
    }
    
    
     public void generar(){
         
                
                  
        almacen.setStoreM(n1,1);
        System.out.println("Se Genero 1 Motor "+ " en la posicon " + n1);
        addM();
               
    
}
    
    public void preveerM(int cant)
    {
        try {
          
            permiso.acquire( cant);
             
            if(n2==14)
            {
                n2=0;
                System.out.println(" QUINCEEEE");
            
            }
            
            almacen.setStoreM(n2,0);
         System.out.println("Se le quito 1 motor en la posicion: "+ n2);
            n2++;
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProdMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
        
}
