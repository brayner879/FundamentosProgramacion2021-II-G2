import java.util.Scanner;

public class BBBA {

    public static void main(String[] args) {
        int i, n, suma;
        suma = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            if(i%2==0)
                suma=suma+i;
            System.out.println();
        }
        System.out.println("Valor de suma: " + suma);
    }

}