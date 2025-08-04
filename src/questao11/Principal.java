package questao11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero inteiro e positivo: ");
        n = entrada.nextInt();

        for(int i=0; i<n; i=i+2){
            System.out.println(i);
        }
    }
}
