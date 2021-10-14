import java.util.Scanner;
import java.util.*;

public class Brayner5BA {
  static Scanner sc = new Scanner(System.in);

 static void ExBrayner1(){
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double primer_examen, promedio, segundo_examen, tercer_examen;
        System.out.print("Ingresa el valor de primer examen: ");
        primer_examen = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de segundo examen: ");
        segundo_examen = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de tercer examen: ");
        tercer_examen = in.nextDouble();
        in.nextLine();
        promedio=primer_examen*0.25+segundo_examen*0.25+tercer_examen*0.5;
        System.out.println("Valor de promedio: " + promedio);
    }

}
  
 static void Examen2BA (){
    //Declaracion de variables e inicializacion
    double salariomin = 0;
    int puntos = 0;
    double descuento, total;
    //Datos de entrada
    System.out.println("Ingrese su salario minimo: ");
    salariomin = sc.nextDouble();
    do{
      System.out.println("Ingrese su puntaje: ");
      puntos = sc.nextInt();
    } while (puntos < 100);
    //Proceso
    if (puntos >= 100 && puntos <= 200){
      descuento = salariomin * 0.10;
      total = salariomin + descuento;
    } else if(puntos > 200 && puntos <= 300){
      descuento = salariomin * 0.40;
      total = salariomin + descuento;
    } else if (puntos > 300 && puntos <= 400){
      descuento = salariomin * 0.70;
      total = salariomin + descuento;
    } else {
      descuento = salariomin * 0.80;
      total = salariomin + descuento;
    }
    //Datos de salida
    System.out.println("Usted tiene un descuendo de: $" + descuento);
    System.out.println ("El salario total es: $" + total);
  }

 static void BC(){
   //Declaracion de variables e inicializacion
    int edad = 0;
    char sexo;
    //Datos de entrada
    System.out.println("Ingrese su edad: ");
    edad = sc.nextInt();
    do{
    System.out.println("Ingrese su sexo, M(Masculino) o F(Femenino): ");
    sexo = sc.next().charAt(0);
    }while(sexo != 'F' && sexo != 'M');
    //Proceso
    if (edad >= 70){
    System.out.println("Usted se debe aplicar la vacuna tipo C");
    } else if (edad >= 16 && edad < 70 && sexo == 'F'){
    System.out.println ("Usted se debe aplicar la vacuna tipo B");
    } else if (edad >= 16 && edad < 70 && sexo == 'M'){
    System.out.println("Usted se debe aplicar la vacuna tipo A");
    } else if (edad < 16){
    System.out.println("Se le aplica la vacuna tipo A");
    }
  }

 static void Brayner4BA(){
   //Declaracion de variables e inicializacion
    double num1, num2;
    double total = 0;
    char signo;
    //Datos de entrada
    System.out.println("Ingrese el primer valor: ");
    num1 = sc.nextDouble();
    System.out.println("Ingrese el segundo valor: ");
    num2 = sc.nextDouble();
    System.out.println("Ingrese el signo: ");
    signo = sc.next().charAt(0);
    //Proceso
    if (signo == '+'){
      total = num1 + num2;
    } else if (signo == '-'){
      total = num1 - num2;
    } else if (signo == '*'){
      total = num1 * num2;
    } else if (signo == '/'){
      total = num1 / num2;
    } else if (signo == '^'){
      total = Math.pow(num1,num2);
    }
    //Datos de salida
    System.out.println ("El resultado es: " + total);

  }

 static void menuOpciones(){ 
    int opcionesA=0;
    System.out.println("-------------------------------");
    System.out.println("Ingrese el Algoritmo que desea probar");
    System.out.println("1 = Determinar el promedio que obtendrá un alumno");
    System.out.println("2 = Determinar el monto de bono que percibirá un profesor");
    System.out.println("3 = Determinar que tipo de vacuna (A, B o C) contra el Covid 19 se debe aplicar a una persona");
    System.out.println("4 = Calcular una operación aritmética entre 2 valores introducidos y el signo correspondiente por teclado");
    System.out.println("Ingrese la opcion: ");
    opcionesA=sc.nextInt();  
    while(opcionesA!=0){
        switch(opcionesA) {
          case 1: problema1();break;
          case 2: problema2();break;
          case 3: problema3();break;
          case 4: problema4();break;
          default:
            System.out.println("El Algoritmo no existe!");
        }   
      System.out.println("------------------------------");  
      System.out.println("Ingrese el Algoritmo que desea probar");
      System.out.println("1 = Determinar el promedio que obtendrá un alumno");
      System.out.println("2 = Determinar el monto de bono que percibirá un profesor");
      System.out.println("3 = Determinar que tipo de vacuna (A, B o C) contra el Covid 19 se debe aplicar a una persona");
      System.out.println("4 = Calcular una operación aritmética entre 2 valores introducidos y el signo correspondiente por teclado");
      System.out.println("Ingrese la opcion: ");
      opcionesA=sc.nextInt();        
    }
  }
 public static void main(String[] args){
 menuOpciones();
 }
}