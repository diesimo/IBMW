/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Jefe extends Thread{
    static private int diacant;
    static private final Semaphore contador= new Semaphore(0,true);
    static private boolean booR;
    static private boolean booP;
    static private boolean booM;
    
    Ensambladores emsa= new Ensambladores();
    Comienzo comienzo = new Comienzo();
    ProdRuedas r = new ProdRuedas();
    private static boolean dormir;
    
    
    public void run(){
        
        
            setBooR(true);
             setBooM(true);
             setBooP(true);
             //Dia para despacho
             diacant=comienzo.getdDespacho();
         
             
            Gerente geren = new Gerente();
        while(true)
        {
                
 
            
            if(booR==false && booP==true && booM==true)
            {
                dormir=false;
              //--- System.out.println("Quedan "+ diacant + " dias"); 
            
             setBooR(true);
             setBooM(true);
             setBooP(true);
             dormir=false;
             
                            
               
                           try {
                             
                               diacant();
                             //  System.out.println("Despierto");
                        Thread.sleep((comienzo.getTiempo()/24) + ((comienzo.getTiempo()/24)/2));
                        //--System.out.println(" 1 Diaaaa!!!!");
                       
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Jefe.class.getName()).log(Level.SEVERE, null, ex);
                    
                    }
                           
                           
             
                           
             //Cuando el semaforo llegue a 3, se inicializa para saber cuantos dias pasan
             //mediante el tiempo que esta incorporado en produccion ruedas
             if(contador.availablePermits()==3)
            {   
                //----System.out.println("Ya pasaron" + comienzo.getdDespacho() + " DIAS");
                 
                restCon(3);
         

            }
             
             //Cuando llegue a 0 se inicializa el dia en 
             
             if(diacant==0)
             {
                 
                   try {
                       
                    
                       
                        geren.setGeren(true);
                       Thread.sleep((comienzo.getTiempo()/24) + ((comienzo.getTiempo()/24)/2));
                        
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Jefe.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   diacant=comienzo.getdDespacho();
                
                
                   
                 
             }
           
             

            }
            
              dormir=true;
            
          
            
          
                        
            
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Jefe.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
       
    }
    
    
    public void diacant()
    {
        diacant--;
    
    }
//Cantidad de dias
    public int getDiaD() {
        return diacant;
    }

    public void setDiaD(int diaD) {
        Jefe.diacant = diaD;
        
    }
    
 // Semaforo contador
    public void restCon(int i)
    {
            try {
                contador.acquire(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jefe.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
    
  
    

    public void addCont ()
    {
         
        contador.release();
    
    }
    
    public int cantCont()
            
    {
        return contador.availablePermits();
        
    
    }
    //----------------------------------

       // Booleanb de R P M
    public boolean isBooR() {
        return booR;
    }

    public  void setBooR(boolean i) {
       booR = i;
    }

    public boolean isBooP() {
        return booP;
    }

    public void setBooP(boolean i) {
       booP =i ;
    }

    public  boolean isBooM() {
        return booM;
    }

    public  void setBooM(boolean i) {
          booM =i;
    }
    
     public String dormir()
    {
        String d;
        d="durmiendo";
    
          return d;
    }
    
    
     public String despertar()
    {
        String d;
        d="despierto";
    
          return d;
    }
     
     
     
     public String evaluar()
     {
     String h="";
     
         if(dormir==false)
         {
            h= despertar();
             
             
         } else if(dormir==true)
         {
         
            h= dormir();
         
         
         }
         
         return h;
         
         
     }
     
     public void truee(boolean i)
     {
         dormir =i;
     
     }
 
}