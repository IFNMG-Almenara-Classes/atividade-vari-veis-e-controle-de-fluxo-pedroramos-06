package questao16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = entrada.nextInt();

        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}
