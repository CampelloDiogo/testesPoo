package aula1;
import java.util.Scanner;
public class exeNove {
    
    public static void main(String[] args){
        System.out.println(horaDoDia());    
    }
    
    
    public static String horaDoDia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite em que hora do dia esta (0 - 23): ");
        int hora = sc.nextInt();
       
        if(hora > 6 && hora < 12){
            
            return "Bom dia!!";
        }else if (hora < 5 && hora > 0) {
            return "Madrugando em, que coisa!!";
        } else if (hora < 18 && hora > 11) {
            return "Boa tarde!!";
        } else if (hora > 17 && hora < 24){
            return "Boa noite!!";
        } else {
            return"Que raio de dia e esse que vai ate " + hora + "????";
            
        }
    }
}
