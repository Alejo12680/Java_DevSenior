import java.util.Scanner;

public class App {

    // Atajo de Visual para el main es "psvm" o "main"
    public static void main(String[] args) throws Exception {
        SaludoPersonal();
        ImprimirCara();
        ImprimirDiamante();
        ImprimirInputs();
    }

    /* Metodos (Ejercicios de la Clase 01) */

    // Saludo Personal
    public static void SaludoPersonal() {
        String nombre = "Cesar";

        System.out.println(nombre + ", bienvenido al curso de Programacion en Java!!!");
    }

    // Imprimir Cara
    public static void ImprimirCara() {

        System.out.print(" @@@@@@@\r\n" + 
                        "@| O O |@\r\n" + 
                        "(|  ^  |)\r\n" + 
                        " | [_] |\r\n" + 
                        " +-----+\r\n");
    }

    // Imprimir rombo
    public static void ImprimirDiamante() {

        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
        System.out.println(" ***** ");
        System.out.println("  ***  ");
        System.out.println("   *   ");
    }

    // Imprimir Entrada y salida de texto
    public static void ImprimirInputs() {

        var consola = new Scanner(System.in);

        System.out.println("Ingrese la primera palabra: ");
        String text01 = consola.nextLine();

        System.out.println("Ingrese la segunda palabra: ");
        String text02 = consola.nextLine();

        System.out.println("Ingrese la tercera palabra: ");
        String text03 = consola.nextLine();

        System.out.printf("La palabra es : %s %s %s", text01, text02, text03);
        
        consola.close();
        
    }
    
}
