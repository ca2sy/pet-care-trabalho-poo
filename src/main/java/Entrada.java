import java.util.Scanner;
public class Entrada {
  public static Scanner entrada = new Scanner(System.in);

  public static String lerTexto(String mensagem){
    System.out.println(mensagem );
    return entrada.nextLine();
  }

  public static int lerInt(String mensagem) {
    System.out.println(mensagem);
    while (!entrada.hasNextInt()) {
      System.out.println("Por favor, digite um número inteiro válido: ");
      System.out.println("    ");
      entrada.next();
    }
    int valorInt= entrada.nextInt();
    entrada.nextLine();
    return valorInt;

  }
  public static float lerFloat(String mensagem) {
      System.out.println(mensagem);
      while (!entrada.hasNextFloat()) { 
          System.out.println("Por favor, digite um número decimal válido: ");
        System.out.println("    ");
          entrada.next();
      }
      float valorFloat = entrada.nextFloat(); 
      entrada.nextLine(); 
      return valorFloat; 
  }



}