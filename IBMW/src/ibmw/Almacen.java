/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

/**
 *
 * @author Diego Simoes
 */
public class Almacen {
    
    private int n;
    private int [] StoreR = new int[30];
    private int [] StoreP= new int [25];
    private int [] StoreM= new int [15];
    
    ProdRuedas pro = new ProdRuedas();
    

   
  public void llenar()
  {
    System.out.println("llamando meotod");
  }

    public int getN() {
        return StoreR[0];
    }

    public void setN(int n) {
        StoreR[0]=n;
        System.out.println("Se ha gaurdado el valor"+ StoreR[0]);
    }
    
   
   
}
