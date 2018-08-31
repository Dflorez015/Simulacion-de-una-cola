
package simulaciondeunacola;


public class Nodo <E> {
    private E valor;
    private Nodo link;// ó next.

    public Nodo() {}  
        
    public Nodo(E valor) {
        this.valor = valor;
        this.link = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
    
    
    
}
