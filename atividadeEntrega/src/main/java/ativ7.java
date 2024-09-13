
import java.util.Scanner;

public class ativ7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Informe um valor inteiro: ");
        valor1 = s.nextInt();
        System.out.println("Informe outro valor inteiro: ");
        valor2 = s.nextInt();

        if (valor1 > valor2){
            System.out.println("O primeiro valor é maior que o segundo");
        } else{
            System.out.println("O segundo valor é maior que o primeiro");
        }
        
        if (valor1 < valor2){
            System.out.println("O primeiro valor é menor que o segundo");
        } else{
            System.out.println("O segundo valor é menor que o primeiro");
        }
        
       if (valor1 == valor2){
           System.out.println("Ambos tem o mesmo valor");
       } else{
           System.out.println("Um valor é diferente do outro");
       }
    }
}
