import java.util.Scanner;

public class Brayner5BA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        double altura, peso, promedio_de_la_altura, promedio_del_peso;
        promedio_de_la_altura = 0;
        promedio_del_peso = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de altura: ");
            altura = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de peso: ");
            peso = in.nextDouble();
            in.nextLine();
            promedio_del_peso=promedio_del_peso+peso;
            promedio_de_la_altura=promedio_de_la_altura+altura;
            System.out.println();
        }
        if (n == 0) {
            promedio_de_la_altura = 0;
        } else {
            promedio_de_la_altura=promedio_de_la_altura/n;
        }
        if (n == 0) {
            promedio_del_peso = 0;
        } else {
            promedio_del_peso=promedio_del_peso/n;
        }
        System.out.println("Valor de promedio de la altura: " + promedio_de_la_altura);
        System.out.println("Valor de promedio del peso: " + promedio_del_peso);
    }

}