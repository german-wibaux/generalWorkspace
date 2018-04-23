
public class ArbolBinario {
	
	NodoArbol raiz;
	
	public ArbolBinario() {
		this.raiz = null;
	}
	
	private void insertarNodo( NodoArbol nodo, NodoArbol raiz ) {

        if ( raiz == null ) {      
            raiz = nodo;
        }
        else {
            
            if ( nodo.getDato() <= raiz.getDato() ) {                
                this.insertarNodo(nodo, raiz.getIzq());
            }
            else {
                this.insertarNodo(nodo, raiz.getDer());
            } 
        }
    }
 
    public void agregarElemento( NodoArbol nodo ) {
        this.insertarNodo( nodo, this.raiz );
    }
	
}
