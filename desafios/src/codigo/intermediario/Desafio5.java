package codigo.intermediario;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro");

        int n = Integer.parseInt(new Scanner(System.in).nextLine());//n=4
        int res = 0;
        int tmp = n;//tmp=n=4;
        n--;//aqui já começa tirando um do n=4-1=3;

        while (n > 0) {//enquanto o número for positivo
            tmp *= n; //multiplico-> tmp=4*3=12
            n--; //tiro um->n=3-1=2

            if(n != 0){//caso n seja diferente de zero iremos dividir o fatorial pelo valor de n.
                tmp /= n; // tmp=12/2=6
                n--; //n=2-1=1
            }

            tmp += n;//tmp +n= 6+1=7
            n--; //n=1-1=0
            res += tmp; //res = 0+7=7;
            tmp = n; //tmp= 0;

            if (n == 1 ){// caso n = 1
                res = tmp; // res= 7;
            } // como n=0 isso não acontece e res= 7 e tmp = -n =0;

            n--; //n=1-1=0 e encerra o while.
        }

        System.out.println(res);
    }
}
