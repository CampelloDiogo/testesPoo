package aula1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class exeDezesseis {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ge = new Random();
        int opcao;
  
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Agora o seu sobrenome (Apenas 1): ");
        String sobrenome = sc.nextLine();
        System.out.println(saudacao(nome));
        
        exibirMenu(); //   <-----------   SEM PARAMETRO E SEM RETORNO

        do {
            
            System.out.println("MENU: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
        // ADICIONAR NO SWITCH POSTERIORMENTE VERIFICAÇÃO VOGAL
                
                case 1:
                     System.out.println("Email cadastrado com Sucesso: " + emailAluno(nome, sobrenome));
                     System.out.println("Retornando ao Menu...");
                break;
                case 2:
                System.out.println("Verificacao de vogal!!");
                 boolean vogal = tipoLetra();
                 if (vogal) {
                    System.out.println("E verdadeira (VOGAL)");
                } else {
                    System.out.println("E falsa (CONSOANTE)");
                }
                 System.out.println("Retornando ao Menu...");
                break;
                
                case 3:
                    System.out.println("Vamos descobrir se e verdadeiro(Par) ou Falso(Impar)");
                    System.out.println("Digite um numero inteiro!!");
                    int num = sc.nextInt();    
                   
                    imparPar(num);
                    
                    System.out.println("Retornando ao Menu...");
                break;
                
                case 4:
                    System.out.println("Digite um valor: ");
                    double valor = sc.nextDouble();
                    System.out.println("Digite a porcentagem a ser descontada: ");
                    int desconto = sc.nextInt();
                   
                    System.out.println("O resultado é: " + calcularDesconto(valor, desconto));
                    System.out.println("Retornando ao Menu...");
                break;
                
                case 5:
                    System.out.println("Resultado:" + Arrays.toString(sistemaTabuada()));
                    System.out.println("Retornando ao Menu...");
                break;
                
                case 6:
                    System.out.println("Versão Atual: " + obterVersaoSistema());
                    
                      
                break;
                
                case 7: 
                    int luckyNumber = ge.nextInt(100);
                    System.out.println("Seu numero e: " + luckyNumber);
                    System.out.println("Retornando ao Menu...");
                break;
                
                default: 
                   
                    
                break;                    
            }
        
        } while (opcao != 0);
        
        sc.close();   
        
        System.out.println("Fim do Programa!");
        System.out.println("By. campelinhoDaMassaDePaoDeQueijo");
        
        
    } 
    ///////////////////FUNÇÃO SAUDAÇÃO///////////////////////////////////////////////////
    public static String saudacao(String nome){
        return "Seja bem Vindo ao Sistema teste, " + nome + "!";
        
      
    }
    //////////////////////MENU;//////////////////////////////////////////////////
    public static void exibirMenu() {

        System.out.println("MENU:");
        System.out.println("(1) - Cadastrar Email: automode (nome.sobrenome@...).");
        System.out.println("(2) - Verificacao de Vogal.");
        System.out.println("(3) - IMPAR x PAR.");
        System.out.println("(4) - Calculo de Desconto.");
        System.out.println("(5) - Conferir Tabuada do 10.");
        System.out.println("(6) - Versao do Sistema.");
        System.out.println("(7) - Gerar um numero aleatorio (0-100).");
        System.out.println("(0) - ENCERRAR O PROGRAMA1.");
}
    ////////////////////FUNÇÃO EMAIL//////////////////////////////////////////////////
    public static String emailAluno(String nome, String sobrenome){
        
        return nome +"." + sobrenome + "@ifsul.edu.br";
    }
    //////////////////////FUNÇÃO TIPO LETRA ////////////////////////////////////////////////
    public static boolean tipoLetra() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra (Apenas uma letra!!): ");
        String letra = sc.next().toLowerCase();

        return "aeiou".contains(letra);
    }
    ////////////////////////////IMPAR X PAR///////////////////////////////////////////////
    ///
    public static void imparPar(int num){
        Scanner sc = new Scanner(System.in);
        if (num %2 == 0) { 
            System.out.println("Seu numero e Verdadeiro(PAR)!!");
        } else {
            System.out.println("Seu numero e Falso(IMPAR)!!");
        }
    }
    //////////////////////////////CALCULAR DESCONTO/////////////////////////////////
    public static double calcularDesconto(double valor, int desconto){
        return valor * (1 - (desconto / 100.0));        
    }
    /////////////////////////////////TABUADA DO 10////////////////
    public static int[] sistemaTabuada() {
        Scanner sc = new Scanner(System.in);
        
        int tabuada[] = new int [10];
        
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        
        for (int i = 0; i < 10; i++){
            tabuada[i] = num * (i + 1);
        }
        return tabuada;
    }
    /////////////////////////VERSÃO DO SISTEMA/////////////////////
    public static String obterVersaoSistema(){
        return "26.2.3";
    }
        
}
