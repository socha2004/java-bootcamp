import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        try{
            String nome, sobrenome;
            int idade;
            float altura;
    
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();
    
            System.out.println("Digite seu sobrenome: ");
            sobrenome = entrada.nextLine();
    
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
            
            System.out.println("Digite sua altura: ");
            altura = entrada.nextFloat();
    
        }
        catch(InputMismatchException e){
            System.out.println("Idade e altura precisam ser numericos!!!");
        }
       
    }
}
