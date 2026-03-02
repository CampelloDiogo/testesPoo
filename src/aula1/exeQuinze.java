package aula1;
import java.util.Scanner;
public class exeQuinze {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        double imcCalculado = calcularImc(peso, altura);
        if (imcCalculado > 0) {
            System.out.println("Seu IMC e: " + imcCalculado);   
        }else {
            System.out.println("Dados invalidos!!");
        }
    }
    public static double calcularImc(double peso, double altura) {
        boolean dadosValidados = validacaoDados(peso, altura);
        if (dadosValidados) {
            double imc = peso / (altura * altura);
            return imc;
        } else {
            return 0;
        }
    }
    public static boolean validacaoDados(double peso, double altura){
        if (peso > 0 && altura > 0){
            return true;
        } else {
            return false;
        }
    }       
}
