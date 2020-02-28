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
                revisar(bfRead);
                 add++;
                 
               
                //guard el contenido del archivo texto
            }
            
            texto = temp;
               
            
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
      
      
        return "";
        
  
    }
    
    
    //FUNCION QUE SELECCIONA SOLO LSO NUMEROS DEL TXT "iniciado"
    
    public void revisar(String a)
    {
   String temp2="";
 
       
       
        for(int i=0;i<a.length();i++)
        {
         
           
            if(Character.isDigit(a.charAt(i)))
            {
                
                    temp2=temp2+a.charAt(i);
 
            }
            if(a.charAt(i)=='.')
            {       
                  
                    Llenar(temp2);
                    temp2="";
            }
        
        }
        
    
    
    }
    
 // FUNCION QUE AYUDA A LLENAR LOS DATOS INICIALES 
  public void Llenar(String i)
    {
        switch(add)
        {
            case 1:
                  {
                     
                     
                     comi.setMax_ARue(Integer.parseInt(i));
                      
                  }
            case 2:
                  {
                     
                       
                      comi.setMax_APara(Integer.parseInt(i));
                  
                  }
           case 3:
                  {
                  
                      
                        
                        
                      comi.setMax_AMotor(Integer.parseInt(i));
                  
                  }
            case 4:
                  {
                     
                      comi.setdDespacho(Integer.parseInt(i));
                      
                  }
             case 5:
                  {
                      comi.setiP_Motor(Integer.parseInt(i));
                  
                  }
             case 6:
                  {
                        comi.setiP_Rue(Integer.parseInt(i));
      
                  
                  }
             case 7:
                  {
                      comi.setiP_Para(Integer.parseInt(i));
    
                  
                  }
             case 8:
                  {
                  
                    comi.setI_Ensam(Integer.parseInt(i));
                  }
             case 9:
             {
             
                 comi.setTiempo(Integer.parseInt(i));
                 
             }
             case 10:
             {
                 comi.setmP_Rue(Integer.parseInt(i));
             
             
             }
             case 11:
             {
                 comi.setmP_Para(Integer.parseInt(i));
             
             
             }
             case 12:
             {
                 comi.setmP_Motor(Integer.parseInt(i));
             
             
             }
             case 13:
             {
                 comi.setM_Ensam(Integer.parseInt(i));
             
             
             }
        
        }
        
    
    
    }
    
}

