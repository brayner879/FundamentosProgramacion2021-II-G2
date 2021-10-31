import java.util.Scanner;

class Brayner2TMC{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    double montpago, total, doble;
    int horas;

    System.out.println("Ingrese las horas que trabajo: ");
    horas = sc.nextInt();

    System.out.println("Ingrese el pago tu pago por hora: ");
    montpago = sc.nextDouble();

    if(horas <= 40){
      total = montpago * horas;
    } else {
      doble = horas - 40;
      total = (montpago * 40) + (doble * montpago * 2);
    }

    System.out.println ("El monto total es: " + total);
  }
}