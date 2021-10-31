import java.util.Scanner;

class Brayner3TMC{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    double pagar;

    System.out.println("ingrese el dinero que tiene: ");
    pagar = sc.nextDouble();

    if(pagar <= 10){
      System.out.println("te alcanza para tarjeta");
    } else if (pagar > 10 && pagar <= 100) {
      System.out.println("te alcanza para unos chocolates");
    } else if (pagar > 100 && pagar <= 250){
      System.out.println("te alcanza para unas flores");
    } else {
      System.out.println("te alcanza para un anillo");
    }
  }
}