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
     Comienzo comienzo= new Comienzo();
   static private final  Semaphore permiso = new Semaphore(0, true);
    Almacen almacen=new Almacen();
   static private int n1;
   static private int n2;
   static private int  contract;
   
      
    public void run()
    {
        
        Ensambladores emsa = new Ensambladores();
         Jefe jefe = new Jefe();
        
        while(true)
        {
            
            //Cantidad de productores
         contract=comienzo.getiP_Para();   
          
         
         //Podra entrar si ya lleva por el segundo dia y clase rueda lo permite 
          if(jefe.cantCont()==2 && jefe.isBooP()==false)
          {
              
           if(permiso.availablePermits()<25)
           {
               
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
                     
        
            }
           
           
           
            jefe.setBooP(true);

          }else
          {
              //Si no puede entrar, igual debe ponerse en truee para poder entrar en funcion de jefe y 
              // contar el dia
                jefe.setBooP(true);
                 try {
                Thread.sleep(10);
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
    
     
     // Funcion que asigna un 1 a la posicion indicada con n1, indicando que hay un parabrisas
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
