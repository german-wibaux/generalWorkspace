
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
	
	public static void seleccion (int A[]) {
		int  menor, pos, tmp;
		for(int i=0; i<A.length-1; i++) {
			menor = A[i];
			pos = i;
			for(int j=i+1;j<A.length;j++) {
				if (A[j] < menor) {
					menor = A[j];
					pos=j;
				}
			}
			if (pos != i) {
				tmp = A[i];
				A[i] = A[pos];
				A[pos] = tmp;
			}
		}
	}
	
	public static void burbujeo (int A[]) {
		int aux;
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length-i-1;j++) {
				if(A[j+1]<A[j]) {
					aux = A[j+1];
					A[j+1] = A[j];
					A[j] = aux;
				}
			}
		}
	}
	
	public static void print (int P[]) {
		for(int i=0;i<P.length;i++) {
			System.out.println("--> " + P[i] + "\n");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursividad f = new Recursividad();
		System.out.println(f.factorial(3));
		int[] b = {450,1,90,45,30,5,2};
		seleccion(b);
		burbujeo(b);
		print(b);
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
