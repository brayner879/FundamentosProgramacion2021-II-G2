import java.util.Scanner;

public class BBB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, suma, un_numero;
        suma = 0;
        for (i=1; i<=20; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de un numero: ");
            un_numero = in.nextInt();
            in.nextLine();
            if(un_numero%2==0)
                suma=suma+un_numero;
            System.out.println();
        }
        System.out.println("Valor de suma: " + suma);
    }

}