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
public class Ensambladores extends Thread {
    
    static private final Semaphore permisoR = new Semaphore(0,true);
    static private final Semaphore permisoM = new Semaphore(0,true);
    static private final Semaphore permisoP = new Semaphore(0,true);
    static private int contract=2;
     
    
   ProdRuedas ruedas = new ProdRuedas();
   ProdMotor motor = new ProdMotor();
   ProdParabrisas para = new ProdParabrisas();
 
    @Override
    public void run ()
    {
    
    
        while(true)
        {
           // System.out.println("Permiso de Ruedas "+ permisoR.availablePermits());
          //System.out.println("Permiso de Motor "+ permisoM.availablePermits());
            if(permisoR.availablePermits()>(4*contract) && permisoM.availablePermits()>(1*contract) && permisoP.availablePermits()>(1*contract)){
                
               
                        contratados();
                    
            }
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
        }
        
        
        
        
        
    
    }
    
    public void contratados(){
    

    for(int i=1;i<=contract;i++)
            {
                System.out.println("--Inicio");
                ruedas.preveerR(4);
                para.preveerP(1);
                motor.preveerM(1);
                System.out.println("--Obteniendo ruedas--");
                
                System.out.println("--Obteniendo motor--");
                
                System.out.println("--Obteniendo parabrisas--");
                
             try {
                 permisoR.acquire(4);
                 permisoM.acquire(1);
                 permisoP.acquire(1);
                 
                 } catch (InterruptedException ex) {
                    Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
                                                   }
               
                System.out.println("Final---");

            }
    
    
    
    
    }
    
    
    public void addM(int n){
    
    
        permisoM.release(n);
    
    }
    public void addR(int n){
    
    
        permisoR.release(n);
    
    }
    public void addP(int n){
    
    
        permisoP.release(n);
    
    }
   
    
    
}
