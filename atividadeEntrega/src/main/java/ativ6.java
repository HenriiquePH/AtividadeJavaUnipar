import java.util.Scanner;
public class ativ6 {
    public static void main(String[] args) {
         int valor;
         
          Scanner s = new Scanner(System.in);
          
          System.out.println("Digite um valor inteiro: ");
          valor = s.nextInt();
        
        int elevado2 = valor * valor;
        int elevado4 = elevado2 * elevado2;
        int elevado6 = elevado2 * elevado4;
        int elevado8 = elevado4 * elevado4;
        int elevado10 = elevado8 * elevado2;
        
        System.out.println("O valor elevado a 2 fica: " + elevado2);
        System.out.println("O valor elevado a 4 fica: " + elevado4);
        System.out.println("O valor elevado a 6 fica: " + elevado6);
        System.out.println("O valor elevado a 8 fica: " + elevado8);
        System.out.println("O valor elevado a 10 fica: " + elevado10);
        
    }
 
}
