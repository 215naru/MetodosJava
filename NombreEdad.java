import java.util.Scanner;

public class NombreEdad {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor ingrese un nombre:");
    String nombre = scanner.nextLine();
    System.out.println("Por favor ingrese una edad:");
    int edad = scanner.nextInt();
    imprimirNombreEdad(nombre, edad);
    imprimirNombre(nombre);
  }

  public static void imprimirNombre(String nombre){
    System.out.println("Mi nombre es "+ nombre);
  }

  public static void imprimirNombreEdad(String nombre, int edad){
    System.out.println("Me llamo "+nombre+" y tengo "+edad+ "años");
  }
}