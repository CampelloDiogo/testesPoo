package aula1;
import java.util.Scanner;

public class exeCinco {

    public static void main(String[] args) {
       
        testeAprovacao();
        
    }
    
    public static void testeAprovacao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dige seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite a sua nota: ");
        double nota = sc.nextInt();
        
        if(nota >= 6){
            System.out.println(nome + " esta aprovado(a)");
        }else {
            System.out.println(nome + " esta reprovado(a)");
        }
                
        
    }
    
}
