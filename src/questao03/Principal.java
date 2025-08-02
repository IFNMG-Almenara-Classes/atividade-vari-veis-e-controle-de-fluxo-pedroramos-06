package questao03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = entrada.nextInt();

        if(n%2 == 0)
            System.out.println("O numero é par.");
        else
            System.out.println("O numero é impar");
    }
}
