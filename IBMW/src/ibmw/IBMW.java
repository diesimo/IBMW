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
public class IBMW {

    
//<<<<<<< Updated upstream
    public static void main(String[] args) throws InterruptedException {
//=======
   
        Interfaz n = new Interfaz();
//>>>>>>> Stashed changes
    
       ProdRuedas hilo1= new ProdRuedas();
       ProdParabrisas hilo2= new ProdParabrisas();
       ProdMotor hilo3= new ProdMotor();
       Ensambladores hilo4 =new Ensambladores();
       Jefe jefe = new Jefe();
       Gerente  geren= new Gerente();
       Almacen almacen = new Almacen();
       Comienzo comienzo= new Comienzo();
   
      //Inicializo lo maximo de cada alamacen
      comienzo.setMax_ARue(30);
      comienzo.setMax_APara(25);
      comienzo.setMax_AMotor(15);
      //Inicializo el dia en que el gerente va a despachar los carros
      comienzo.setdDespacho(7);
      //Cantidad de Productores por cada area
      comienzo.setiP_Motor(3);
      comienzo.setiP_Rue(3);
      comienzo.setiP_Para(3);
      comienzo.setI_Ensam(2);
      
      
      //Inicializo la funcion de almacen comienzo
       almacen.comienzo();
       
       //Inicializo la cantidad que durara 1 dia
       comienzo.setTiempo(2000);
       
        jefe.dia(62);
        
        

       //Iniciando hilos
        jefe.start();
        geren.start();
        hilo4.start();
        hilo1.start();
        hilo3.start();
        hilo2.start();

    
      
         
        
        
        
      
         
       
       
           
            
       
//        try {
//            hilo4.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(IBMW.class.getName()).log(Level.SEVERE, null, ex);
//        }
//  hilo4.start();
//       
      
      
                      
    
        // repeticion de hilo
             
        
            
        
        
        
        
       
    }
    
}
