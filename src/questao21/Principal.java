package questao21;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, tempotrabalho;

        System.out.print("Idade da pessoa: ");
        idade = entrada.nextInt();

        System.out.print("Tempo trabalhado: ");
        tempotrabalho = entrada.nextInt();

        if((idade >= 65) || (tempotrabalho >= 30) || (idade >=60 && tempotrabalho >= 25)){
            System.out.println("A pessoa pode se aposentar");
        } else{
            System.err.println("A pessoa NÃO pode se aposentar");
        }
    }
}
