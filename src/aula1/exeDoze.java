package aula1;
import java.util.Scanner;
import java.util.Arrays;
public class exeDoze {
    
    public static void main(String[] args) {
        System.out.println("Bem vindo a tabuada do 10!!");
        System.out.println(Arrays.toString(sistemaTabuada()));
    }
    
    public static int[] sistemaTabuada() {
        Scanner sc = new Scanner(System.in);
        
        int tabuada[] = new int [10];
        
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        
        for (int i = 0; i < 10; i++){
            tabuada[i] = num * (i + 1);
        }
        return tabuada;
    }
    
}
