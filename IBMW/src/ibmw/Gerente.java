/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
public class Gerente extends Thread  {
    
    Comienzo comienzo = new Comienzo();
    
    static private boolean veri ;
   
    static private int hora;
    
    static private boolean dormir;
    
    public void run()
    {
        Jefe jefe = new Jefe();
        Ensambladores ensa = new Ensambladores();
      
        
        while(true)
        
        {
            //Genera un numero random entre 6 y 18 que son las horas que puede dormir el gerente
            hora= (int)(Math.random()*(19-6)+6);
            
            if(veri==true && ensa.getContCarL()!=0)
            {
                setGeren(false);
                ensa.setContCarL(0);
              
                dormir=false;
            
            }else
            {
               
               
                try {
                   // System.out.println("La hora a dormir delg gerentees: "+ (comienzo.getTiempo()/24)*hora);
                    Thread.sleep((comienzo.getTiempo()/24)*hora);
                     
                     dormir=true;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
               
            
            }
            
            
        }
    
    
    
    
    }
    
    
    public void setGeren(boolean i)
    {
    
            veri=i;
    
    
    
    }
    
    public boolean getGeren()
    {
        
        return veri;
    
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
    
}
