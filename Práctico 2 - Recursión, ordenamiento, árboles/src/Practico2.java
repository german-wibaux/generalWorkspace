
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
		tree.postOrder();
		System.out.println(tree.hasElement(40));
	}

}
