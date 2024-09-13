import java.util.Scanner;
public class ativ5 {
    public static void main(String[] args) {
        int valor;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro: ");
        valor = s.nextInt();
        
        if(valor %2 == 0){
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é impar");
        }
    }
}
