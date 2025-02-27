import java.util.Scanner;

public class DivisaoPorZero {

   public static void main (String args []) {

    try{

    Scanner scanner = new Scanner (System.in);

      System.out.print("\n---CALCULADORA BÁSICA---");

      System.out.print("\n Insira o primeiro valor: ");
      int primeiroNumero = scanner.nextInt();

      System.out.print("\n Insira o segundo número: ");
      int segundoNumero = scanner.nextInt();

      scanner.nextLine();

      System.out.print("\n Escolha um operador: + | - | * | /: ");
      String operador = scanner.nextLine();
 
      if (operador.equals("+")) {

      System.out.println(primeiroNumero + segundoNumero);

      }

      else if (operador.equals("-")) {

      System.out.println(primeiroNumero - segundoNumero);

      }

      else if (operador.equals("*")) {

      System.out.println(primeiroNumero * segundoNumero);
      
      }

      else {

        System.out.println(primeiroNumero / segundoNumero);
      }

      scanner.close();

    } catch (ArithmeticException e) {

      System.out.println("Não é possível dividir por zero");

    }
 
   }

}