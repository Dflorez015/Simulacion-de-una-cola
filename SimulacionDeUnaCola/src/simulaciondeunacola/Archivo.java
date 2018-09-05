
package simulaciondeunacola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

 
public class Archivo {
   
    
 private  Cola <String> cola = new Cola<>();
 
    public Archivo() {
    } 
    
    public  Cola<String> getCola() {
        return cola;
    }

    public  void setCola(Cola<String> cola) {
        this.cola = cola;
    }   
    
     public void Cargar (){       
         getString("spool.txt"); 
     }
     
     public void getString(String archivo) {
        String cadena="";
        FileReader file;
       
        try {
            file = new FileReader(archivo);
            BufferedReader br = new BufferedReader(file);
            try {     
                 
                while ((cadena=br.readLine())!=null) {                    
                    cadena = br.readLine(); 
                    StringTokenizer texto = new StringTokenizer(cadena, ",");
                    while (texto.hasMoreTokens()) {                    
                    cola.enqueue(texto.nextToken());                    
                    }
                }              
                
                br.close();
                file.close();
               
            } catch (IOException ex) {
                System.out.println("Error de lectura de archivo");
            }              
        
        }catch(FileNotFoundException e){
           System.out.println("No se ha encontrado el archivo");
        } 
        
    }  
}
