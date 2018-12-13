//  C O M P L E J I D A D

//Fórmula: 6n + 10
//Notación Big-O: O(n)

public class adv {

	public static void main(String[] args) {
		
		long var1 = 1;
		long var2 = 2;
		long var3 = 2;
		int  contador = 10;
		
		System.out.println("Pares de números: ");
		System.out.println();
		
		while(contador > 0) {
			
			if (var3 == 0) {
				System.out.println(var1+" ------- "+var2);
		    	contador--;
		    }
		    if (var3 <= 0) {
		    	var2++;
		    	var3 = var3 + var2;
		    } else {
		    	var3 = var3 - var1;
		    	var1++;
		    	var3 = var3 - var1;
	       }
		}
	}

}

