import java.util.Scanner;

class Brayner1TMC{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    

    int edad;
    System.out.println("Ingrese su edad: ");
    edad = sc.nextInt();

    if(edad >= 18){
      System.out.println("Ud si puede ir a votar");
    } else {
      System.out.println("Ud es menor de edad, por lo tanto no puede votar");
    }

  }
}