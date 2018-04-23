
public class NodoArbol {
		private NodoArbol izq;
        private NodoArbol der;
        private int dato;
 
        private NodoArbol(){
            this.izq = null;
            this.der = null;
            dato = 0;
        }
        
        public void setIzq(NodoArbol ins){
        	this.izq = ins;
        }
        
        public void setDer(NodoArbol ins){
        	this.der = ins;
        }
        
        public void setDato(int ins) {
        	this.dato = ins;
        }
        
        public NodoArbol getIzq() {
        	NodoArbol ret = this.izq;
        	return ret;
        }
        
        public NodoArbol getDer() {
        	NodoArbol ret = this.der;
        	return ret;
        }
        
        public int getDato() {
        	return this.dato;
        }
}

