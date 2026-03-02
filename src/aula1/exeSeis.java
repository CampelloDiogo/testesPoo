package aula1;
import java.util.Scanner;
public class exeSeis {
    
    public static void main(String[] args){
        System.out.println("Bem vindo!! ");
        System.out.println("O valor digitado com 10% de desconto e de: " + calcularDesconto());
        
    }
    
    public static double calcularDesconto(){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Digite um valor: ");
            double valor = sc.nextDouble();
            
            return valor * 0.90;    
    }
}
