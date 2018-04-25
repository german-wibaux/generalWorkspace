
public class Practico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario tree = new ArbolBinario();
		tree.agregarElemento(25);
		tree.agregarElemento(20);
		tree.agregarElemento(30);
		tree.agregarElemento(10);
		tree.agregarElemento(40);
		tree.agregarElemento(28);
		tree.agregarElemento(24);
		tree.postOrder();
		//System.out.println(tree.esVacio());
	}

}
