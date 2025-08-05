package questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i=0, total=0, par=0;

        do { 
            System.out.print("Digite um numero: ");
            n = entrada.nextInt();
            
            if(n != 0){
                total += n;
                i++;
                
                if(n%2 == 0)
                    par++;
            }
        } while (n!=0);

        System.out.printf("Quantidade de pares: %d\n", par);
        System.out.printf("Media: %d\n", total/i);
    }
}
