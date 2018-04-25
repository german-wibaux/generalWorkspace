
public class Practico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario tree = new ArbolBinario();
		tree.insert(25);
		tree.insert(20);
		tree.insert(30);
		tree.insert(10);
		tree.insert(40);
		tree.insert(28);
		tree.insert(24);
		tree.insert(45);
		tree.insert(43);
		
		System.out.println(tree.hasElement(40));
		tree.borrar(30);
		//tree.inOrder();
		tree.borrar(28);
		tree.borrar(24);
		tree.inOrder();
	}

}
