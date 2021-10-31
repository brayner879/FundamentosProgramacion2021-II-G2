import java.util.Scanner;

class Brayner6TMC{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int n, colordefoco, fcverde, fcblanco, fcrojo;
    fcverde = fcblanco = fcrojo = 0;

    do
    {
      System.out.println ("Ingrese la cantidad de focos: ");
    n = sc.nextInt();
    } while (n < 0);

    for (n = n; n > 0; n--)
    {
      do{
        System.out.println ("Seleccione el color ");
        System.out.println ("1 = verde ");
        System.out.println ("2 = blanco ");
        System.out.println ("3 = rojo ");
        colordefoco = sc.nextInt();
      } while (n <= 0 || n > 3);      

      if (colordefoco == 1)
      {
        fcverde++;
      } if (colordefoco == 2)
      {
        fcblanco++;
      } if (colordefoco == 3)
      {
        fcrojo++;
      }
    }
    System.out.println ("El total de focos verdes es: " + fcverde);
    System.out.println ("El total de focos blancos es: " + fcblanco);
    System.out.println ("El total de focos rojos es: " + fcrojo);
  }
}