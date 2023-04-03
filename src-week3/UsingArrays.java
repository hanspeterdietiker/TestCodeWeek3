import java.util.Scanner;

public class UsingArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamanho;

		System.out.print("Inform the array's size: ");
		tamanho = sc.nextInt();

		int[] value = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			value[i] = i * 2;

		}

		for (int i = 0; i < tamanho; i++) {
			System.out.print(value[i]);
		}
		sc.close();
	}
}
