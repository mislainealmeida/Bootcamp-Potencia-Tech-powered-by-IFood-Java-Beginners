package codigo.intermediario;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do array");
        int N = input.nextInt();//leitura do teclado

        int[] nums = new int[N];// coloca o numero do teclado dentro do array (para definir o tamanho do array.
        int i, aux;


        System.out.println("Digite " + N + " números para o array");
        for (i = 0; i < N; i++) {// salvar os números dentro do array
            nums[i] = input.nextInt();
        }
        System.out.print("nums[]= {");//imprimir o array
        for (i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("}");
        System.out.println();


        for (i = 0; i < N; i++) { //i=0
            if (nums[i] % 2 != 0) { //verifica se é impar, caso seja impar eu vou ver a próxima posição.
                //se caso não for ímpar, o valor permanece nessa posição.
                for (int j = (i + 1); j < N; j++) { //j=1(i+1)
                    if (nums[j] % 2 == 0) {//verifica se é par, caso seja
                        aux = nums[i];// o auxiliar recebe o valor da posição 0;
                        nums[i] = nums[j];// depois a posição 0 recebe o valor da posição 1
                        nums[j] = aux;// a posição 1 recebe o valor do auxiliar.
                        j = N;// o J volta ser o N atual, ou seja j-1.

                    }
                }
            }
            System.out.print(nums[i] + " ");

        }
    }
}
