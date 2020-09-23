package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		// TODO
		for (int[] rad : matrise) {
			for (int x : rad) {
				System.out.print(x + " ");
			}
			System.out.println();

		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String streng = "";
		for (int[] j : matrise) {
			for (int i : j) {
				streng += i + " ";
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// TODO
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int y = 0; y < matrise.length; y++)
			for (int x = 0; x < matrise[y].length; x++)
				nyMatrise[y][x] = matrise[y][x] * tall;

		return nyMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length)
				return false;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j])
					return false;
			}

		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int[][] m = new int[matrise[0].length][matrise.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = matrise[j][i];
			}
		}
		return m;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int[][] m = new int[a.length][b[0].length];
		b = speile(b);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int x = 0; x < a[i].length; x++) {
					m[i][j] += a[i][x] * b[j][x];
				}
			}
		}

		return m;

	}

}
