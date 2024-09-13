import java.util.Scanner;
public class ativ1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double nota;
        
        System.out.print("Qual foi sua nota final no ano letivo? ");
        nota = s.nextDouble();
       
        if (nota < 6 && nota >= 4){
            System.out.println("Precisa fazer prova substitutiva");
        } else if (nota >= 6){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
    }
}
