package codigo.basico;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        A = input.nextInt();
        System.out.println("Digite o segundo numero");
        N = input.nextInt();

        int soma=0;
        for(int i=1; i<=N; i++){
            if(i%A==0){
                soma +=i;
            }

        }
        System.out.println(soma);
    }
}
