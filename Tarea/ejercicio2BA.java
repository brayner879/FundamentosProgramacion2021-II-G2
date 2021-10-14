import java.util.Scanner;

public class ejercicio2BA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hora_normal, horas_extras, horas_trabajadas, pago_del_trabajador;
        String nombre_del_trabajador;
        System.out.print("Ingresa el nombre del trabajador: ");
        nombre_del_trabajador = in.nextLine();
        System.out.print("Ingresa el valor de hora normal: ");
        hora_normal = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de horas trabajadas: ");
        horas_trabajadas = in.nextDouble();
        in.nextLine();
        if(horas_trabajadas>44)
            horas_extras=horas_trabajadas-44;
        else
            horas_extras=0;
        pago_del_trabajador=horas_trabajadas*hora_normal+horas_extras*hora_normal*0.5;
        System.out.println("Nombre del trabajador: " + nombre_del_trabajador);
        System.out.println("Valor de horas extras: " + horas_extras);
        System.out.println("Valor de pago del trabajador: " + pago_del_trabajador);
    }

}