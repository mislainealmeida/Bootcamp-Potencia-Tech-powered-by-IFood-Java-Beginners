package codigo.basico;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int A = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int B = scan.nextInt();

        String resposta = A == B ? "Sao iguais!" : "Nao sao iguais!";
        System.out.println(resposta);
    }

}
