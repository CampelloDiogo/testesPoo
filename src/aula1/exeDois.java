package aula1;
import java.util.Scanner;

public class exeDois {
    
    public static void main(String[] args){ //Função main com void não aceita Return!! 
        System.out.println("O valor da sua cotação é: "+ converterDolarParaReal()); 
    }
    
    public static double converterDolarParaReal(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em Dolares: ");
        double valorDolar = sc.nextDouble();
                         //Declarar as variaveis durante o uso do Scanner e não na abertura da função
        System.out.println("Agora, digite a cotação do Dolar: ");
        double cotacao = sc.nextDouble();
        
        return valorDolar * cotacao;  //Não usar variaveis desnecessárias!! 
    }
    
    
}
