
public class Recursividad {
	
	void imprimir (int x) {
        if (x > 0) {
            System.out.println(x);
            imprimir(x-1);
        }
    }
	
	void imprimirAsc (int x) {
        if (x > 0) {
        	imprimirAsc(x-1);
        	System.out.println(x);            
        }
    }
	
	public double factorial (int n) {
		if (n>1) 
			return (n * factorial(n-1));
		else
			return 1;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Recursividad re = new Recursividad();
//        re.imprimir(5);
//        System.out.println("Descendente");
//		re.imprimirAsc(5);	
//		System.out.println("Ascendente");
//		System.out.println(re.factorial(1));
		
//		MySimpleLinkedList list = new MySimpleLinkedList();
//		MySimpleLinkedList list1 = new MySimpleLinkedList();
//		list.insert(10);
//		list.insert("Text");
//		list.insertLastPosition("Last");
//		list.insert("Metodologias");
//		list.showList();
//		Node searching = list.getRoot();
//		System.out.println(list.search(searching, "Yerman"));
//		System.out.println("///////////////////");		
//		System.out.println(list1.isEmpty());
//		System.out.println("/////////Size VV //////////");
//		System.out.println(list.size());
	}	
}
