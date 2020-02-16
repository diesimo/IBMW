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
    
 static private final  Semaphore permiso = new Semaphore(0, true);
    Almacen almacen=new Almacen();
    static private int n1;
   static private int n2;
   static private int  contract=3;
   
    
    public void run()
    {
    
        Ensambladores emsa = new Ensambladores();
        
        while(true)
        {
           if(permiso.availablePermits()<25)
           {
                     
                     System.out.println("Numero n1 de P: " + n1);
                    for(int i=1;i<=contract;i++)
                     {
                          if(n1==25)
                            {
                                  n1=0;
                            }
                            if(n1<=24)
                            {
                                if(almacen.getStoreP(n1)==0)
                                     {
                                     generar();
                                     emsa.addP(1);
                                      }
                                 n1++;
                            }
                    }
                     try {
      
                        Thread.sleep(500);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                     }
        
             }

        }
    
    }
    
     public void addP()
    {
       
        permiso.release();
    
    }
    
      public void generar()
      {
         
                
                  
        almacen.setStoreP(n1,1);
        System.out.println("Se Genero 1  P  en la posicon " + n1);
        addP();
               
    
      }
      
      
    public void preveerP(int cant)
    {
        try {
          
            permiso.acquire( cant);
             
            if(n2==24)
            {
                n2=0;
              System.out.println(" veintinueve");
            
            }
            
            almacen.setStoreP(n2,0);
            System.out.println("Se le quito 1 parabrisas en la posicion: "+ n2);
            n2++;
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProdMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }


     
    
    
}
