import java.util.Scanner;
public class ativ4 {
    public static void main(String[] args) {
        int num1;
        int num2;
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro: ");
        num1 = s.nextInt();
        System.out.println("Informe outro valor inteiro: ");
        num2 = s.nextInt();
        
       if(num1 > num2){
           System.out.println("O valor " + num1 + " é maior");
       } else if (num1 < num2){
           System.out.println("O valor " + num2 + " é maior");
       }else{
           System.out.println("O primeiro e o segundo número têm o mesmo valor");
       }
        
    }
}
