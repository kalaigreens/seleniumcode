package javaconcepts;

public class Forloopconcept {

	public static void main(String[] args) {
		int i, j;

		for (i = 1; i <= 3; i++) { // outer loop

			for (j = 1; j <= 3; j++) { // inner loop

				System.out.print(i);

			}
			System.out.println();
		}

	}
}