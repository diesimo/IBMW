/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;


import java.util.concurrent.*;
public class Almacen {
     Comienzo comienzo= new Comienzo();

   
     //Almacen de cada productora
    static private  int StoreR[]; 
    static private  int StoreP [];
    static private  int StoreM [];
    
   
    //funcion que se le asigna el valor maximo a cada almacen
    public void comienzo()
    {
        
        StoreR = new int[ comienzo.getMax_ARue()];
        StoreP = new int [comienzo.getMax_APara()];
        StoreM= new int [comienzo.getMax_AMotor()];
    
    
    
    }
    
    

    public int getStoreR(int a) {
        
       int i= StoreR[a];
       
        return i;
    }

    public void setStoreR(int n0,int n1) {
        StoreR[n0]=n1;
    }

    public int getStoreP(int a) {
        int i=StoreP[a];
        
        return i;
    }

    public void setStoreP(int n0, int n1) {
       StoreP[n0]=n1;
    }

    public int getStoreM(int a) {
        int i=StoreM[a];
        
        return i;
    }

    public void setStoreM(int n0,int n1) {
       StoreM[n0]=n1;
    }
    
    
    public void can (int n)
    {
        System.out.println("Numero: " + StoreR[n] );
    
    }
    
 
   
}
   
 
  