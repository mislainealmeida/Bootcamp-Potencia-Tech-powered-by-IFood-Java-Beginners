package codigo.basico;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int N = numero.nextInt();
        int soma = 0;

        for(int i = N; i >= 0; i--){

            soma +=i;
        }

        System.out.print(soma);
    }
}
