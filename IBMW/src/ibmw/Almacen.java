/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;


import java.util.concurrent.*;
public class Almacen {
    


    private static int [] StoreR = new int[30];
    private static int [] StoreP= new int [25];
    private static int [] StoreM= new int [15];
    

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
   
 
  