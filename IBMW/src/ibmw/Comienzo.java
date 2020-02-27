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
public class Comienzo {
    
    // Cuanto durara un dia
    static private int tiempo;
    // Dia para que se despachen los carros 
    static private int dDespacho;
    //Maximo de cada almacen de produccion
    static private int max_APara;
    static private int max_ARue;
    static private int max_AMotor;
    
 
    
    
    //Cantidad de productores de cada area
    static private int iP_Para;
    static private int iP_Rue;
    static private int iP_Motor;
    static private int i_Ensam;

   
  
   
   
   
   
   
   
   
   
   
   //DE gerTiempo obtienes el tiempo de que dura 1 dia
   
    public int getTiempo() {
        return tiempo;
    }

    
    //Proporcionas el tiempo que dura 1 dia
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
      //------------
    
    //Despacho de los carros
    public int getdDespacho() {
        return dDespacho;
    }
   
    
    
    public void setdDespacho(int dDespacho) {
        this.dDespacho = dDespacho;
    }
   //------------
    
    
    // Maximo de cada almacen
    
    //Parabrisas
    public int getMax_APara() {
        return max_APara;
    }

    public void setMax_APara(int max_APara) {
        this.max_APara = max_APara;
    }
    //---
    //Ruedas
    public int getMax_ARue() {
        return max_ARue;
    }

    public void setMax_ARue(int max_ARue) {
        this.max_ARue = max_ARue;
    }
    //---
    //Motor
    public int getMax_AMotor() {
        return max_AMotor;
    }

    public void setMax_AMotor(int max_AMotor) {
        this.max_AMotor = max_AMotor;
    }

    //--

    
    
    //De aqui hasta el inidicador con (*) son los iniciales de cada Produccion
    
    // Parabrisas
    public int getiP_Para() {
        return iP_Para;
    }

    public void setiP_Para(int iP_Para) {
        this.iP_Para = iP_Para;
    }
    
    //------------

    
    // Ruedas
    public int getiP_Rue() {
        return iP_Rue;
    }

    public void setiP_Rue(int iP_Rue) {
        this.iP_Rue = iP_Rue;
    }
   //------------
   
    //  Motor
    public int getiP_Motor() {
        return iP_Motor;
    }

    public void setiP_Motor(int iP_Motor) {
        this.iP_Motor = iP_Motor;
    }
   //------------
    
    // Ensambladores 
    public int getI_Ensam() {
        return i_Ensam;
    }

    public void setI_Ensam(int i_Ensam) {
        this.i_Ensam = i_Ensam;
    }
    //------------
    
    
   //-------- (*) -----
   
  
   
   
   
    
}
