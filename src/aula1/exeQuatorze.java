package aula1;

import java.util.Scanner;

public class exeQuatorze {

    public static void main(String[] args) {
        System.out.println("Verificacao de vogal!!");
        boolean vogal = tipoLetra();
        if (vogal) {
            System.out.println("E verdadeira (VOGAL)");
        } else {
            System.out.println("E falsa (CONSOANTE)");
        }
    }

    public static boolean tipoLetra() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra (Apenas uma letra!!): ");
        String letra = sc.next().toLowerCase();

        return "aeiou".contains(letra);
    }

}
