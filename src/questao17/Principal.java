package questao17;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = entrada.nextInt();

        for(int i=n-1; i>1; i--){
            n *= i;
        }

        System.out.printf("Fatorial: %d\n", n);
    }
}
