package exerc1;

import java.util.Scanner;

public class Equacao {
    int n = 0;
    int x = 50;
    int y = -80;

    public Equacao() {
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
        double resultado = 0.00;

        for (int i = 1; i <= n; i++) {
            resultado += (termoXNumerador(i) * x + termoYNumerador(i) * y) / (double) fatorial(i);
        }

        System.out.println(resultado);
    }

    private int termoXNumerador(int n) {
        return 1 + (n - 1) * 2;
    }

    private int termoYNumerador(int n) {
        int resultado = 1 + (n - 1) * 6;

        if (n % 2 == 0) {
            resultado = -resultado;
        }

        return resultado;
    }

    private int fatorial(int n) {
        if (n == 1) return n;

        int aux = n;

        for (int i = n - 1; i > 0; i--) {
            aux = aux * i;
        }

        return aux;
    }
}
