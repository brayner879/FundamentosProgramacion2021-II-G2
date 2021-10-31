import java.util.Scanner;

class Brayner5TMC{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int n, años, x;
    double ahorros, total, interes, inverfinal;
    ahorros = total = interes = inverfinal = 0;

      System.out.println("Ingrese los años de ahorro: ");
    años = sc.nextInt();   

    while (años > 0)
    {
      for (x = 1; x <= 12;x++)
      {
        System.out.println("Ingrese el ahorro del mes " + x + ": ");
        ahorros = sc.nextDouble();
        total = total + ahorros;
      }
      interes = interes + (total * 0.10);
      inverfinal = total + interes;
      System.out.println("El interes anual es: S/" + interes);
      System.out.println("La inversion final es: S/" + inverfinal);
      años--;
    }
    
  }
}