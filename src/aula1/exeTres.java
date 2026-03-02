package aula1;

import java.util.Scanner;

public class exeTres {

    public static void main(String[] args) {
        
        System.out.println("Boas vindas a exponenciadora!! ");
        
        System.out.println("O Resultado da exponenciação é: " + calcularPotencia());
    
    }
     public static int calcularPotencia(){
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Digite um número: ");
            int num = sc.nextInt();

            int total = num;
            
            System.out.println("Digite o seu expoente: ");
            int exp = sc.nextInt();

            for (int i = 1; i < exp; i++) {
                total = total * num;
            }
            return total;
     }
}
