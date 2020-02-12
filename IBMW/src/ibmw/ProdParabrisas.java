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
public class ProdParabrisas extends Thread{
    
    private int n=1;
    public void run()
    {
    
        System.out.println("Creacion parabrisas");
        n++;
        System.out.println("N es:"+n);
        
    
    }
    
    public int primer(){
    
        return n;
    }
     
    
    
}
