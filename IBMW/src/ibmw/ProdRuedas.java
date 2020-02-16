
        
package ibmw;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ProdRuedas extends Thread {
    
    
  

    
   static  private final Semaphore permiso= new Semaphore(0,true);
   private static int n1;
   static private  int n2;
   static private int contract=3;
     Almacen almacen = new Almacen();  
    
    @Override
    public void run()
    {
        Ensambladores emsa = new Ensambladores();
    
        while(true)
        {
            
                 if(permiso.availablePermits()<30)
                 {
                       System.out.println("Numero n1 de R: " + n1);
                     for(int i=1; i<=contract;i++)
                     {
                          if(n1==30)
                            {
                                  n1=0;
                            }
                            if(n1<=29)
                            {
                                if(almacen.getStoreR(n1)==0)
                                     {
                                     generar();
                                     emsa.addR(1);
                                      }
                                 n1++;
                            }
                     
                     }
                   
                     try {
                         Thread.sleep(500);
                        } catch (InterruptedException ex) {
                         Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                         }
                    if(n1==30)
                    {
                        n1=0;
                    }
                   
                 }
                  
                 
        }
    
    
    }
    
    public void addR()
    {
    
        permiso.release();
       
    
    }
    
    public void preveerR(int cant)
    {
        try {
          
            permiso.acquire( cant);
             
           
           
            for(int cont=1; cont<=4;cont++)
            {
                
                 if(n2==29)
            {
                n2=0;
                System.out.println(" VEINTI NUEVE");
            
            }
            almacen.setStoreR(n2,0);
            System.out.println("Se le quito 1 Rueda: " + " posicion: "+ n2);
            n2++;
            } 
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProdMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
     public void generar(){
         
         
         almacen.setStoreR(n1,1);
        System.out.println("Se Genero 1 Rueda en la posicon " + n1); 
         addR();
                   
    
}

    public int getContract() {
        return contract;
    }
     
     
     
     
   }    

   
   
    
            
 
    

