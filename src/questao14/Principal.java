package questao14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float valor;
        int escolha;

        System.out.print("Valor da pizza: ");
        valor = entrada.nextFloat();

        System.out.print("Tipo de cliente: ");
        escolha = entrada.nextInt();

        switch (escolha) {
            case 1 -> {}
            case 2 -> valor *= 0.95f;
            case 3 -> valor *= 0.9f;
        }

        System.out.printf("Valor a ser pago: %.2f", valor);
    }
}
