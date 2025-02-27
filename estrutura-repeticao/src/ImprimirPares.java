import java.util.Scanner;

public class ImprimirPares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Imprimir pares: ");
        int numero = scanner.nextInt();

        for(int contador = 0; contador <= numero; contador ++) {
            if(contador % 2 == 0) {
                System.out.println(contador);
            }
        }

        scanner.close();


        
    }
}