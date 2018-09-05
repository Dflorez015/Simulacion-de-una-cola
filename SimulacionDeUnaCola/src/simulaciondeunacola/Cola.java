package simulaciondeunacola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Cola <E> {
    
    private Nodo top,end;
    private int size;
    public Cola(){
        top=end=null;
        size=0;              
    }
    
    public void enqueue(E valor){
        Nodo <E> nodo = new Nodo(valor);
        if (top == null){   // cola vacía
          this.top= this.end = nodo;  
         
        }else{
          this.end.setLink(nodo);
          this.end=nodo;
        }        
        this.size++;
    }
    
    public Nodo<E> dequeue(){
         if (top == null)
             return null;
         else {
             Nodo<E> nodo = this.top;
             this.top = this.top.getLink();
             this.size --;
             return nodo;
         }    
    }
    
    public Nodo<E> peek(){        
        return this.top;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean isEmpty(){    
     return top == null;
    }
    
    
    public Nodo<E> getEnd(){
       return this.end;
    }
    
     public void display(){
       Nodo<E> nodo =this.top;
       System.out.println("La Cola de tamaño "+this.getSize()+ " es la siguiente:");
       while (nodo != null){
           System.out.println(nodo.getValor().toString());
           nodo=nodo.getLink();
       }
       
    }
   
     
}
