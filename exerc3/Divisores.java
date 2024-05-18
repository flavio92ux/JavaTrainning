package exerc3;

import java.util.Scanner;

public class Divisores {
    Scanner scanner = new Scanner(System.in);

    public Divisores() {
        int numero;

        do {
            System.out.print("Digite um número inteiro positivo (-1 para terminar): ");
            numero = scanner.nextInt();

            if (numero != -1) {
                calcularDivisores(numero);
            }
            
        } while (numero != -1);

        System.out.println("FIM DO PROGRAMA");
    }

    public void calcularDivisores(int numero) {
        String mensagem = "Divisores de " + numero + ":";

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                mensagem += " " + i;
            }
        }

        System.out.println(mensagem);
    }
}
