package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {
			streng += tabell[i];
			if (i<tabell.length-1) streng+= ",";

		}
		return streng += "]";
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum=0;
		for (int i=0; i<tabell.length; i++) {
			sum +=tabell[i];
		}
		return sum;
		
		/*while:
		 * int sum= 0
		 * int i=0
		 * while (i<tabell.length){
		 * sum+=tabell[i];
		 * i++;
		 * }
		 * return sum;
		 * 
		 * for:
		 * int sum =0
		 * for(int i:tabell)
		 * sum+=i;
		 * return sum;
		 */
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		for (int i=0;i<tabell.length;i++) {
			if (tabell[i]==tall) return true;
		} 
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		for (int i=0;i<tabell.length;i++) {
			if (tabell[i]==tall) return i;
		} 
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int [] revers = new int[tabell.length];
		for (int i =0;i<tabell.length;i++) {
			revers[tabell.length-i-1]=tabell[i];
		}
		return revers;
	}
	

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for (int i=1;i<tabell.length;i++) {
			if (tabell[i]<tabell[i-1]) return false;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int nyLengde= tabell1.length+tabell2.length;
		int [] tabell1og2= new int [nyLengde];
		
		for (int i=0; i<tabell1.length; i++) {
			tabell1og2[i]= tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			tabell1og2[tabell1.length+j]=tabell2[j];
		}
		return tabell1og2;
	}
}
