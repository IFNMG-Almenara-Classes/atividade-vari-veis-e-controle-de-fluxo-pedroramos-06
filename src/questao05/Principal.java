package questao05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float laranjas, total;
    
        System.out.print("Quantas laranjas foram compradas: ");
        laranjas = entrada.nextInt();

        total = (laranjas < 12) ? laranjas*0.5f : laranjas*0.3f;

        System.out.printf("Valor total: R$%.2f\n", total);
    }
}
