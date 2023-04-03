import java.util.Scanner;

public class UsingArrays2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, add = 0;
		int[] user = new int[10];

		for (int i = 0; i < user.length; i++) {
			System.out.print("Inform the number " + (i + 1) + ": ");
			num = sc.nextInt();
			user[i] = num;
		}
		for (int i = 0; i < user.length; i++) {
			add =add+ user[i];

			System.out.println(add);
		}
		sc.close();
	}
}
