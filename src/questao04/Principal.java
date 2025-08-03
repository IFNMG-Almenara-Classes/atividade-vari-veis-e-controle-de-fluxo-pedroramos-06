package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;

        do{
            System.out.print("Digite a senha: ");
            n = entrada.nextInt();

            if(n != 1234)
                System.out.println("ACESSO NEGADO");
        } while(n !=1234);

        System.out.println("ACESSO PERMITIDO");
    }
}
