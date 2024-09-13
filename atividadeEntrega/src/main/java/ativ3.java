import java.util.Scanner;
public class ativ3 {
    public static void main(String[] args) {
        
        float num1;
        float num2;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        num1 = s.nextInt();
        
        System.out.println("Informe um numero: ");
        num2 = s.nextInt();
        
        float soma = num1 + num2;
        float divisao = num1/num2;
        float subtracao = num1/num2;
        float multiplicacao = num1*num2;
        
        if(num2 != 0){
            divisao = num1/num2;
            System.out.println("Divisão: " + divisao);
        } else{
            System.out.println("Não é possivel dividir por 0");
        }
        
 
        System.out.println("Soma: " + soma);
        System.out.println("Divisão: " + divisao);
        System.out.println("Subtração " + subtracao);
        System.out.println("Multiplicação" + multiplicacao);
    }
}
