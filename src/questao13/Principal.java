package questao13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcao, n1=0, n2=0;

        do { 
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");

            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            if(opcao != 5){
                System.out.print("Digite o 1º numero: ");
                n1 = entrada.nextInt();

                System.out.print("Digite o 2º numero: ");
                n2 = entrada.nextInt();
            }

            switch (opcao) {
                case 1 -> System.out.printf("Soma = %d\n", n1+n2);
                case 2 -> System.out.printf("Subtração = %d\n", n1-n2);
                case 3 -> System.out.printf("Multiplicação = %d\n", n1*n2);
                case 4 -> System.out.printf("Divisão = %d\n", n1/n2);
                case 5 -> System.out.println("Programa finalizado");
                default -> System.out.println("Opção invalida");
            }
        } while (opcao != 5);
    }
}
