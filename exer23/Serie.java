package exer23;

import java.util.Scanner;

public class Serie {
  private int n;
  private int a;

  public Serie() {
    entrarComDados();
  }

  private void entrarComDados() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual o número de parcelas? ");
    n = scanner.nextInt();

    System.out.println("Qual o valor da constante a? ");
    a = scanner.nextInt();

    scanner.close();

    calcularParcelas();
  }

  private void calcularParcelas() {
    double somatorio = 0;

    for (int i = n; i > 0; i--) {
      int expoente = i;
      int multiplicador = n - i + 1;

      somatorio += Math.pow(a * multiplicador, expoente) / fatorial(multiplicador);
    }

    System.out.println("somatório com " + 4 + " parcelas: " + somatorio);
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
