import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("CONVERSÃO DE TEMPERATURA\n");

		char Code;

		do {
			System.out.printf("\nQual a temperatura em Celsius?: ");
			double C = sc.nextDouble();
			double F = (C * 9 / 5) + 32;

			System.out.printf("\nÉ equivalente em Fahrenheit é: %.1f%n", F);

			System.out.printf("\nDeseja repetir? (s/n): ");
			Code = sc.next().charAt(0);

		} while (Code == 's');

		sc.close();
	}
}
