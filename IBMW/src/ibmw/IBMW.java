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
       Archivo archi = new Archivo();
   
    

      archi.LeerTxt("D:\\Repertorio\\SistemasOperativos\\IBMW\\src\\ibmw\\Inicial.txt");
     

     
  
      
      //Inicializo la funcion de almacen comienzo
       almacen.comienzo();
     
       
       
       
       //Inicializo la cantidad que durara 1 dia
       comienzo.setTiempo(1000);
       
        
        
        

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
