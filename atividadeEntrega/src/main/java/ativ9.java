import java.util.Scanner;

public class ativ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero > 10 && numero < 100) {
            double potencia = Math.pow(numero, 2);
            System.out.printf("O número elevado ao quadrado é: %.5f%n", potencia);
        } else {
            double raizQuadrada = Math.sqrt(numero);
            System.out.printf("A raiz quadrada do número é: %.5f%n", raizQuadrada);
        }
        
        scanner.close();
    }
}
