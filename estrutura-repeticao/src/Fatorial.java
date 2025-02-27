import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        for(int contador = 1; contador <= numero; contador ++) {
            fatorial *= contador;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        scanner.close();
    }
    
}
