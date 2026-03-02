package aula1;
import java.util.Scanner;
public class exeDez {
    
    public static void main(String [] args) {
        
        System.out.println("Sua media ponderada e " + mediaPonderada());
        
    }
    
    public static double mediaPonderada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double notaUm = sc.nextDouble();
        
        System.out.println("Digite o peso da primeira nota: ");
        double pesoUm = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double notaDois =sc.nextDouble();
        
        System.out.println("Digite o peso da segunda nota: ");
        double pesoDois = sc.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double notaTres = sc.nextDouble();
        
        System.out.println("Digite o peso da terceira nota: ");
        double pesoTres = sc.nextDouble();
        
        return ((notaUm * pesoUm) + (notaDois * pesoDois) + (notaTres * pesoTres)) / (pesoUm + pesoDois + pesoTres);
    }
    
}
