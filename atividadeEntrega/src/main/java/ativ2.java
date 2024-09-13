import java.util.Scanner;
public class ativ2 {
    public static void main(String[] args){
        String nome;
        int idade;
        String genero;
        String corFavorita;
        String esporte;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = s.nextLine();
        
        System.out.print("Digite sua idade? ");
        idade = s.nextInt();
        s.nextLine();  
        
        System.out.print("Digite seu genero: ");
        genero = s.nextLine();
        
        System.out.print("Digite sua cor favorita: ");
        corFavorita = s.nextLine();
        
        System.out.print("Voce pratica algum esporte? Se sim, qual?");
        esporte = s.nextLine();
        
        System.out.println("Nome:" + nome);
        System.out.println("Idade " + idade);
        System.out.println("Genero " + genero);
        System.out.println("Cor favorita: " + corFavorita);
        System.out.println("Pratica esportes: " + esporte);
        
    }
}
