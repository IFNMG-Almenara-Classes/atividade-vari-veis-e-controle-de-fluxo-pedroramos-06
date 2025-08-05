package questao18;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        boolean primo;
        String numeros = "";

        System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();

        for(int i=n1+1; i<n2; i++){
            primo = true;

            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    primo = false;
                    break;
                }
            }

            if(primo){
                numeros += i + " ";
            }
        }

        System.out.printf("Numeros primos entre %d e %d: %s\n", n1, n2, numeros);
    }
}
