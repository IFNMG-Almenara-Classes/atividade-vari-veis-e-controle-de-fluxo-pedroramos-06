package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, maior;

        System.out.print("Digite o primeiro numero: ");
        x = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        y = entrada.nextInt();

        maior = (x>y) ? x : y;

        System.out.printf("O maior numero é %d\n", maior);
    }
}