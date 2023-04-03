import java.util.Scanner;

public class UsingArrays4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de notas a serem digitadas: ");
		int n = sc.nextInt();
		float temp;
		float[] notas = new float[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Informe a nota: " + (i + 1) + ": ");
			notas[i] = sc.nextFloat();
		}

		// Ordenando as notas em ordem crescente:

		for (int i = 0; i < notas.length; i++) {
			for (int j = i + 1; j < notas.length; j++) {
				if (notas[i] > notas[j]) {
					temp = notas[i];
					notas[i] = notas[j];
					notas[j] = temp;

				}
			}
		}

		System.out.println("Notas em ordem crescente: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		sc.close();
	}
}
