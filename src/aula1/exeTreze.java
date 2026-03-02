package aula1;
import java.util.Scanner;
public class exeTreze {           

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temeratura em Celsius: ");
        double cel = sc.nextDouble();
        
        System.out.println(systConvTemp(cel)); 
    }

    public static double systConvTemp(double cel){
        return (cel * 1.8) + 32;
    }
    
}
