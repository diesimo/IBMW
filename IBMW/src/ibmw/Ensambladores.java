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
    static private int contract;
    static private int ContCarL;
     
    
   ProdRuedas ruedas = new ProdRuedas();
   ProdMotor motor = new ProdMotor();
   ProdParabrisas para = new ProdParabrisas();
   Comienzo comienzo = new Comienzo();
 
    @Override
    public void run ()
    {
            contract=comienzo.getI_Ensam();
    
        while(true)
        {
            //Cantidad de ensambladores
            
           
            for(int i=1;i<=contract;i++)
        
            {
            if(permisoR.availablePermits()>=(4) && permisoM.availablePermits()>=(1) && permisoP.availablePermits()>=(1) )
            {
                
               
                        contratados();
                    
            }
            }
           
          
         try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
        
        
        
    
    }
    
    public void contratados(){
    

   
                
                
                // --System.out.println("--Inicio");
                //Se le retira 4 ruedas 1 motor y 1 parabrisas, llamando la funcion de preveer a cada clase
                ruedas.preveerR(4);
                para.preveerP(1);
                motor.preveerM(1);
              // --  System.out.println("--Obteniendo ruedas--");
                
               //--- System.out.println("--Obteniendo motor--");
                
               //-- System.out.println("--Obteniendo parabrisas--");
                 ContCarL++;
             try {
                 
                 //Se le realiza un acquiare a los semaforos establecidos en esta clase para indicar 
                 // lo que se tiene para poder ensamblar
                 permisoR.acquire(4);
                 permisoM.acquire(1);
                 permisoP.acquire(1);
                 
                 } catch (InterruptedException ex) {
                    Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
                                                   }
             //contador de carros
              
              // --  System.out.println("Cantidad de carros: " + ContCarL);
               // -- System.out.println("Final---");
                   try {
                       
                       // el tiempo de ensamblar un carro es 2 dias
            Thread.sleep((comienzo.getTiempo())*2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ensambladores.class.getName()).log(Level.SEVERE, null, ex);
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

    public  int getContCarL() {
        return ContCarL;
    }

    public void setContCarL(int ContCarL) {
        this.ContCarL = ContCarL;
       // -- System.out.println("Despachando carros");
    }
   
    public int getcsntR()
    {
    
        return permisoR.availablePermits();
    }
    
     public int getcsntP()
    {
    
        return permisoP.availablePermits();
    }
    
      public int getcsntM()
    {
    
        return permisoM.availablePermits();
    }

    public int getContract() {
        return contract;
    }

    public  void setContractadd() {
       contract++;
    }
    
     public  void setContractdis() {
       contract--;
    }
    
      
    
}
