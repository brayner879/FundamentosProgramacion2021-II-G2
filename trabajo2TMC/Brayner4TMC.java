import java.util.Scanner;

class Brayner4TMC{
  static Scanner sc = new Scanner(System.in);
  
  public static void main(String [] arg){
    
    int n;
    double precio, descuento, total, totalneto;
    descuento = total = totalneto = 0;

    System.out.println("ingrese cuantos articulos quiere coprar: ");
    n = sc.nextInt();

    while (n > 0)
    {
      System.out.println("Ingrese el precio del articulo " + n + ": ");
      precio = sc.nextInt();
      if (precio >= 200)
      {
        descuento = precio * 0.15;
      } if (precio > 100 && precio < 200)
      {
        descuento = precio * 0.12;
      } if (precio > 0 && precio <=100){
        descuento = precio * 0.10;
      }
      totalneto = precio - descuento;
      System.out.println("El precio del articulo con su descuento es: S/" + totalneto);
      System.out.println("El descuento es: S/" + descuento);
      total = total + (precio - descuento);
      n--;
    }
    System.out.println("El presio total es: S/" + total);
  }
}