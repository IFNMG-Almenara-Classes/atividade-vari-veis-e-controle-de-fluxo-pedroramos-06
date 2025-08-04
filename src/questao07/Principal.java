package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.print("Digite o tamanho do 1º lado do triangulo: ");
        lado1 = entrada.nextInt();

        System.out.print("Digite o tamanho do 2º lado do triangulo: ");
        lado2 = entrada.nextInt();

        System.out.print("Digite o tamanho do 3º lado do triangulo: ");
        lado3 = entrada.nextInt();

        if(lado1 == lado2 && lado1 == lado3)
            System.out.println("O triângulo é equilatero.");
        else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
            System.out.println("O triangulo é escaleno.");
        else
            System.out.println("O triângulo é isósceles.");
        
    }
}
