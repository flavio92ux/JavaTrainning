package exer15;

import java.util.Scanner;

public class Tabuleiro {
  public Tabuleiro() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("TABULEIRO");
    System.out.print("Dimensão do tabuleiro: ");
    
    int n = scanner.nextInt();

    printarTabuleiro(n);

    scanner.close();
  }

  private void printarTabuleiro(int n) {
    for (int i = 1; i <= n; i++) {
      if (i == n) {
        System.out.println("  " + i);
      } else if (i == 1) {
        System.out.print("    " + i + " ");
      } else {
        System.out.print("  " + i + " ");
      }
    }

    for (int j = 1; j <= n; j++) {
      String caracteres = "";
      boolean isCerquilha = true;

      for (int k = 1; k <= j; k++) {
        if (j % 2 == 0) {
          if (isCerquilha == true) {
            caracteres += " #  ";
            isCerquilha = !isCerquilha;
          } else {
            caracteres += " +  ";
            isCerquilha = !isCerquilha;
          }
        } else {
          caracteres += " x  ";
        }
      }

      String msgFinal = j < 10 ? " " + j + " " + caracteres + "\n" : j +  " " + caracteres + "\n";
      System.out.print(msgFinal);
    }
  }
}
