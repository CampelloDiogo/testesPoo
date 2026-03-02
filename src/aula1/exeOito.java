package aula1;
import java.util.Scanner;
public class exeOito {
    
    public static void main(String[] args){
        
        System.out.println(emailAluno());
        
    }
    
    
    public static String emailAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        
        System.out.println("Digite o seu sobrenome (Apenas 01 !!): ");
        String sobrenome = sc.next();
        
        return nome +"." + sobrenome + "@ifsul.edu.br";
    }
}
