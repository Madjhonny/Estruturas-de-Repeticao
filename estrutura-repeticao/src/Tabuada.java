import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número maior que 0 para receber a tabuada do mesmo até 10: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for(int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i) );



        }

        scanner.close();


    }
    }

