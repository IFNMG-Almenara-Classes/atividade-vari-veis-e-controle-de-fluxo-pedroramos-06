package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float altura, peso, imc;

        System.out.print("Digite sua altura: ");
        altura = entrada.nextFloat();

        System.out.print("Digite seu peso: ");
        peso = entrada.nextFloat();

        imc = peso / (altura*altura);

        System.out.print("Classificação: ");
        if(imc < 18.5)
            System.out.println("Magreza");
        else if(imc < 25)
            System.out.println("Saudável");
        else if(imc < 30)
            System.out.println("Sobrepeso");
        else if(imc < 35)
            System.out.println("Obesidade Grau I");
        else if(imc < 40)
            System.out.println("Obesidade Grau II (severa)");
        else
            System.out.println("Obesidade Grau III (mórbida)");
        
    }
}
