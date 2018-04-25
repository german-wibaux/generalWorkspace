
public class ArbolBinario {
	
	NodoArbol raiz;
	
	public ArbolBinario() {
		this.raiz = null;
	}
	
	private NodoArbol insert( NodoArbol nodo, NodoArbol raiz1) {
        if ( raiz1 == null ) {
            raiz1 = new NodoArbol();
            raiz1.setDato(nodo.getDato());
            raiz1.setIzq(null);
            raiz1.setDer(null);
            if (this.raiz == null) {
            	this.raiz = raiz1;
            }         
        }
        else {
            
            if ( nodo.getDato() <= raiz1.getDato() ) {                
                raiz1.setIzq(insert(nodo, raiz1.getIzq())); 
            }
            else {
                raiz1.setDer(insert(nodo, raiz1.getDer()));
            } 
        }        
        return raiz1;        
    }
 
    public void insert( int dato ) {    	
        NodoArbol ins = new NodoArbol();
        ins.setDato(dato);
        ins.setIzq(null);
        ins.setDer(null); 
    	this.insert( ins, this.raiz );
    }
    
    public boolean esVacio(){
        return (this.raiz == null);
    }
    
    private void preOrder(NodoArbol raiz){
        if (raiz != null) {        	
	         System.out.println( raiz.getDato() + ", "  );
	         preOrder(raiz.getIzq());
	         preOrder(raiz.getDer());
        }
    }
    
    public void preorder() {
    	this.preOrder(raiz);
    }
 
    private void inOrder(NodoArbol raiz){
        if (!esVacio()) {        	
	         preOrder(raiz.getIzq());
	         System.out.println( raiz.getDato() + ", "  );
	         preOrder(raiz.getDer());
        }
    }
    
    public void inOrder() {
    	this.inOrder(this.raiz);
    }
 
    private void postOrder(NodoArbol raiz){
        if (!esVacio()) {        	
	         preOrder(raiz.getIzq());
	         preOrder(raiz.getDer());
	         System.out.println( raiz.getDato() + ", "  ); 
        }
    }
    
    public void postOrder() {
    	this.postOrder(this.raiz);
    }
    
    private boolean hasElement(NodoArbol actual, int valor) {
        if (actual == null) {
            return false;
        } 
        if (valor == actual.getDato()) {
            return true;
        } 
        return valor < actual.getDato()
          ? hasElement(actual.getIzq(), valor)
          : hasElement(actual.getDer(), valor);
    }
    
    public boolean hasElement(int valor) {
        return hasElement(this.raiz, valor);
    }
    
    public void borrar(int dato) {
    	 
        borrarElemento(this.raiz, dato);
    }

    private NodoArbol borrarElemento(NodoArbol raiz, int dato) {
 
        if(raiz == null) return raiz;
 
        if(dato < raiz.getDato()) {
            raiz.setIzq(borrarElemento(raiz.getIzq(), dato));
        } else if(dato > raiz.getDato()) {
            raiz.setDer(borrarElemento(raiz.getDer(), dato));
        } else {
            // node with no leaf nodes
            if(raiz.getIzq() == null && raiz.getDer() == null) {
                System.out.println("deleting "+ dato);
                return null;
            } else if(raiz.getIzq() == null) {
                // node with one node (no left node)
                System.out.println("deleting "+dato);
                return raiz.getDer();
            } else if(raiz.getDer() == null) {
                // node with one node (no right node)
                System.out.println("deleting "+dato);
                return raiz.getIzq();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                int minVal = minValor(raiz.getDer());
                raiz.setDato(minVal);
                raiz.setDer(borrarElemento(raiz.getDer(), minVal));
                System.out.println("deleting "+ dato);
            }
        }
 
        return raiz;
    }
 
    private Integer minValor(NodoArbol nodo) {
 
        if(nodo.getIzq() != null) {
            return minValor(nodo.getIzq());
        }
        return nodo.getDato();
    }
	
}
