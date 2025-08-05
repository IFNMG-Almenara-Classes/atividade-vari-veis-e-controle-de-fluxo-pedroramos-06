package questao20;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;


        System.out.print("Digite um numero: ");
        n = entrada.nextInt();

        if((n%3 == 0 && n%5 != 0) || (n%5 == 0 && n%3 != 0)){
            System.out.println("o numero é divisivel por 3 OU 5");
        } else{
            System.out.println("o numero NÃO é divisivel por 3 OU 5");
        }
    }
}
