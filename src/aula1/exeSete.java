package aula1;
import java.util.Scanner;
public class exeSete {
    
    public static void main(String[] args){
        
        if (imparPar() %2 == 0) { //Toda vez que eu chamo "imparPar() ele executa uma verificação com Scanner
            System.out.println("Seu numero e Verdadeiro(PAR)!!");
        } else {
            System.out.println("Seu numero e Falso(IMPAR)!!");
        }
    }
    public static int imparPar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos descobrir se e verdadeiro(Par) ou Falso(Impar)");
        System.out.println("Digite um numero inteiro!!");
        int num = sc.nextInt();
        return num;
    }
    
}
