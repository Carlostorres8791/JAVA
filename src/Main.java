//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //dia 1
        System.out.println("Bienvenido a tu primer programa en JAVA ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola "+nombre+" este es tu primer programa en JAVA");
        //dia 2
        System.out.println("Ingresa un número");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa un segundo número");
        int numero2 = scanner.nextInt();

        int suma = numero1+numero2;
        System.out.println("La suma de los numeros ingresados es: "+suma);
        int resta = numero1-numero2;
        System.out.println("La resta de los numeros ingresados es: "+resta);
        int multiplicacion = numero1*numero2;
        System.out.println("la multiplicacion de los numeros ingresados es: "+multiplicacion);
        double numeroUno = numero1;
        double numeroDos = numero2;
        double division = numeroUno/numeroDos;
        System.out.println("la division de los numeros ingresados es: "+division);

        //dia 3
        System.out.println("En este punto del software verificaremos si el numero1="+numero1+" es par o impar");

        int cociente = numero1%2;

        if (cociente==0) {
            System.out.println("El número "+numero1+" es par");
        }else{
            System.out.println("El número "+numero1+" es impar");
        }

        System.out.println("A continuacion generaremos la tabla de multiplicar del numero1= "+numero1+" que se ha ingresado");
        for (int i = 0; i < 11; i++) {
            System.out.println(numero1+" * "+i+" = "+(numero1*i));
        }

        scanner.close();

    }
}