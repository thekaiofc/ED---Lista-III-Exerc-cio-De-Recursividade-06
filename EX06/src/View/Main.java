package View;

import java.util.Scanner;
import Controller.Serie;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        // Validação
        do {
            System.out.print("Digite um valor para N (1 a 20): ");
            n = sc.nextInt();

            if (n < 1 || n > 20) { //  Até 20 para não dar estouro
                System.out.println("Valor inválido!");
            }

        } while (n < 1 || n > 20);

        Serie controller = new Serie();

        double resultado = controller.somatoria(n);

        System.out.println("Resultado da somatória: " + resultado);

        sc.close();
    }
}