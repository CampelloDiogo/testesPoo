package aula1;

public class exeUm {
    
    public static void main(String[] args) {
        exibirMenu();
    }
    public static void exibirMenu(){
        
         System.out.println(boasVindas());
         
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Sair ");
    }
    public static String boasVindas(){
       return "Boas Vindas!";
    }
    
}

