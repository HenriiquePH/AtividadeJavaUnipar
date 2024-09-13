import java.util.Scanner;
public class ativ8 {
    public static void main(String[] args) {
        
        double valor1;
        double valor2;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Valor relógio 1 dia: ");
        valor1 = s.nextDouble();
        System.out.println("Valor relógio 30 dia: ");
        valor2 = s.nextDouble();
        
        double sub = (valor1 - valor2) / 30;
        System.out.println("A media de uso diário é de " + sub + " litros");
    }
}
