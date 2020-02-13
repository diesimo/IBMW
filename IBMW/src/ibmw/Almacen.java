/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;


import java.util.concurrent.*;
public class Almacen {
    
    private int contador1;
   static private int contador2;
    private int contador3;
    static private boolean T =false;
    private int [] StoreR = new int[30];
    private int [] StoreP= new int [25];
    private int [] StoreM= new int [15];
  

    public int getStoreR() {
        
         Contador1(StoreR);
         
        return contador1;
    }

    public void setStoreR(int i) {
        StoreR[i]=1;
    }

    public int getStoreP() {
            
          StoreP[0]=1;
             Contador2(StoreP);
        
        return contador2;
    }

    public void setStoreP(int i) {
        StoreP[i]=1;
    }

    public int getStoreM() {
        Contador3(StoreM);
         
        return contador3;
    }

    public void setStoreM(int i) {
       StoreM[i]=1;
    }

    public static boolean isT() {
        return T;
    }

  
    
    
    
 
    
    
   public void Contador2(int Array[])
   {
      
       if(contador2<29){
          
       for(int i=0;i<Array.length;i++)
       {
           
          
           if(Array[i] != 0)
           {
               
               contador2++;
            
               
           } 
         
       }
       }else{
         contador2=0;
          T=true;
      
      }
    
   }
    
      
   public void Contador1(int Array[])
   {
      
       if(2<29){
          
       for(int i=0;i<Array.length;i++)
       {
           
          
           if(Array[i] != 0)
           {
               System.out.println(contador2);
               contador2++;
            System.out.println("Entro");
               
           } 
         
       }
       }else{
         contador2=0;
          T=true;
      
      }
    
   }
       
   public void Contador3(int Array[])
   {
      
       if(2<29){
          
       for(int i=0;i<Array.length;i++)
       {
           
          
           if(Array[i] != 0)
           {
               System.out.println(contador2);
               contador2++;
            System.out.println("Entro");
               
           } 
         
       }
       }else{
         contador2=0;
          T=true;
      
      }
    
   }
    
   
    

   
}
    
   
   

