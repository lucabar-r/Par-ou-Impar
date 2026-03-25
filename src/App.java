import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

      
        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }

       
        leitor.close();
    }
}