/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibmw;

import java.io.*;

/**
 *
 * @author the_g
 */
public class Archivo {
      int add=1;
     Comienzo comi = new Comienzo();
     String temp ;
    public String LeerTxt(String direccion){ //direccion del archivo
        String texto = "";
        ProdRuedas rue = new ProdRuedas();
        ProdParabrisas para = new ProdParabrisas();
        ProdMotor moto = new ProdMotor();
        Ensambladores ensa = new Ensambladores();
     
       
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            
            String bfRead;
          
            while((bfRead = bf.readLine()) != null){ //se hace el ciclo mientras bfRead tiene datos
         
                temp=bfRead;
                 System.out.println(temp);
                 System.out.println(add);
                 Llenar();
                   add++;
                 
                    
                   
                   
                 
               
                //guard el contenido del archivo texto
            }
            
            texto = temp;
             
            
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
            
      
        return "";
        
  
    }
    
    
  public void Llenar()
    {
        switch(add)
        {
            case 1:
                  {
                     
                     
                     comi.setMax_ARue(Integer.parseInt(temp));
                      
                  }
            case 2:
                  {
                     
                       
                      comi.setMax_APara(Integer.parseInt(temp));
                  
                  }
           case 3:
                  {
                  
                      
                        
                        
                      comi.setMax_AMotor(Integer.parseInt(temp));
                  
                  }
            case 4:
                  {
                     
                      comi.setdDespacho(Integer.parseInt(temp));
                      
                  }
             case 5:
                  {
                      comi.setiP_Motor(Integer.parseInt(temp));
                  
                  }
             case 6:
                  {
                        comi.setiP_Rue(Integer.parseInt(temp));
      
                  
                  }
             case 7:
                  {
                      comi.setiP_Para(Integer.parseInt(temp));
    
                  
                  }
             case 8:
                  {
                  
                    comi.setI_Ensam(Integer.parseInt(temp));
                  }
        
        }
        
    
    
    }
    
}

