package exer15;

public class Tabuleiro {
  public Tabuleiro() {
    for (int i = 1; i <= 6; i++) {
      if (i == 6) {
        System.out.println("  " + i);
      } else {
        System.out.print("  " + i + " ");
      }
      
    }

    for (int j=1; j<=6; j++) {
      String caracteres = "";

      for (int k=1; k <= j; k++) {
        caracteres += " x  ";
      }

      System.out.print(j + caracteres + "\n");
    }

  }
}
