package exerc4;

import java.util.Scanner;

public class Somatorio {
	int n = 0;
	int k = 30;
	int m = 40;

	public Somatorio() {
		introduzirValorDeN();
	}

	private void introduzirValorDeN() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("INFORME O NÚMERO DE PARCELAS: ");
			n = scanner.nextInt();

			if (n <= 0) {
				System.out.println("VALOR INVÁLIDO PARA n !");
			} else {
				scanner.close();
				calcularEquacao();
			}

		} while (n <= 0);
	}

	private void calcularEquacao() {
		double resultado = 0.0000;

		for (int i = 1; i <= n; i++) {
			int numeroFatorial = numeroParaFatorial(i);
			resultado += (i * k + termoMNumerador(i) * m) / (double) fatorial(numeroFatorial);
		}

		System.out.println(resultado);
	}

	private int numeroParaFatorial(int n) {
		return 1 + (n - 1) * 2;
	}

	private int termoMNumerador(int n) {
		if (n % 2 == 0) {
			return -n;
		}

		return n;
	}

	private int fatorial(int n) {
		if (n == 1)
			return n;

		int aux = n;

		for (int i = n - 1; i > 0; i--) {
			aux = aux * i;
		}

		return aux;
	}
}
