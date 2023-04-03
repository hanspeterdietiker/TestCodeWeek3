import java.util.Scanner;

public class UsingArrays3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float media = 0;

		float maior, menor;

		System.out.print("Informe a quantidade de notas a serem lidas : ");
		int notas = sc.nextInt();

		float[] note = new float[notas];

		for (int i = 0; i < notas; i++) {
			System.out.print("Informe a nota " + (i + 1) + " : ");
			note[i] = sc.nextFloat();
			media += note[i];

		}
		media = media / notas;

		System.out.print("A media das notas e: " + media);

		maior = note[0];
		menor = note[0];

		for (int i = 1; i < notas; i++) {
			if (maior < note[i]) {
				maior = note[i];
			}
			if (menor > note[i]) {
				menor = note[i];
			}

		}
		System.out.print("\nA maior nota e: " + maior);
		System.out.print("\nA menor nota e: " + menor);

		sc.close();
	}
}
