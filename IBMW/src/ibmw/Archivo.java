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
    
    public String LeerTxt(String direccion){ //direccion del archivo
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ //se hace el ciclo mientras bfRead tiene datos
                temp = temp + bfRead; //guard el contenido del archivo texto
            }
            
            texto = temp;
            
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
            
        return texto;
    }
    
}

