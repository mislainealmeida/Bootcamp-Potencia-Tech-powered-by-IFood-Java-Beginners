package codigo.intermediario;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os caracteres desejado: ");
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String[] letras = s.split("");
        String[] simbolos = {"(", ")", "{", "}", "[", "]"};
        boolean valido = false;

        for (int i = 0; i < simbolos.length; i++) {
            if (letras[0].equals(simbolos[i]) && letras[letras.length - 1].equals(simbolos[i + 1])) {
                valido = true;
            }
        }
        return valido;
    }
}
