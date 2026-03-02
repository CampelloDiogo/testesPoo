package aula1;
import java.util.Scanner;
public class exeOnze {
    
    public static void main(String[] args) {             //LOGIN "adm" SENHA "123"                      
        
        System.out.println("TELA DE ACESSO A SUA CONTA");
        
        System.out.println(sistemaDeAcesso());
        
    }
    public static String sistemaDeAcesso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        String login = sc.nextLine();
        
        System.out.println("Password: ");
        String password = sc.nextLine();
        
        if (login.equals("admin") && password.equals("123")){
            return "Login efetuado com sucesso!!";
        }else {
            return "Acesso negado!, tente novamente";
        }    
        
    }
    
}
