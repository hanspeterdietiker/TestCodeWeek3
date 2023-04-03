import java.util.Arrays;
import java.util.Scanner;

public class UsingArrays6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float media = 0;

		float maior, menor;

		float temp;

		

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
		// Ordenando notas em ordem crescente:
		Arrays.sort(note);
				
		System.out.println("\nNotas em ordem crescente: ");
		for (int i = 0; i < note.length; i++) {
			System.out.println(note[i]);
		}
		
		// Ordenando notas em ordem decrescente:
		for (int i = 0; i < note.length/2; i++) {
			temp = note[i];
			note[i] = note[note.length - i - 1];
			note[note.length - i - 1] = temp;
		}

		System.out.println("\nNotas em ordem descrescente: ");
		for (int i = 0; i < note.length; i++) {
			System.out.println(note[i]);
		}

		System.out.print("\nA maior nota e: " + maior);
		System.out.print("\nA menor nota e: " + menor);

		

		sc.close();
		}

	}


