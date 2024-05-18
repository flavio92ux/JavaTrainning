import java.util.Scanner;

public class HazenWilliams {
    double vazaoDesejada;
    double perdaCargaPermitida;
    Scanner scanner = new Scanner(System.in);

    public HazenWilliams() {
        System.out.print("Informe a vazão desejada (m3/s): ");
        vazaoDesejada = scanner.nextDouble();

        System.out.print("Informe a perda de carga máxima permitida (m/m): ");
        perdaCargaPermitida = scanner.nextDouble();

        System.out.println("\n");

        verificarTubulacao();
    }

    private void verificarTubulacao() {
        boolean verificado = false;

        do {
            System.out.print("Informe o diâmetro do tubo (m): ");
            double diametro = scanner.nextDouble();

            System.out.print("Informe o coeficiente de rugosidade do tubo: ");
            double coeficienteRugosidade = scanner.nextDouble();

            double perdaDeCarga = calcularPerdaDeCarga(diametro, coeficienteRugosidade);

            if (perdaDeCarga < perdaCargaPermitida) {
                System.out.println("\n");
                System.out.println("O tubo com diâmetro " + diametro + " m e coeficiente de rugosidade " + coeficienteRugosidade);
                System.out.println(String.format("atende as especificações com perda de carga de %.6f m/m", perdaDeCarga));
                verificado = true;
            } else {
                System.out.println("O tubo não atende as especificações! Tente novamente.");
                System.out.println("\n");
            }
        } while (verificado == false);

        scanner.close();
    }

    private double calcularPerdaDeCarga(double diametro, double coeficienteRugosidade) {
        return Math.pow(vazaoDesejada, 1.85) * 10.64 * Math.pow(diametro, -4.87)
                * Math.pow(coeficienteRugosidade, -1.85);
    }
}
