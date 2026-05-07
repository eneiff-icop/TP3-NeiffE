package Resol.NeiffE;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("   TP3 ");
        System.out.println(" ");
        System.out.println("1 → Ejercicio 1:   ");
        System.out.println("2 → Ejercicio 2: ");
        System.out.println("0 → Salir");
        System.out.println(" ");

        System.out.println("Ingrese el numero del ejercicio que desea ejecutar:");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break; 
            case 2: 
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break; 
            case 4:
                Ejercicio4.ejecutar();
                break; 
            case 5:
                Ejercicio5.ejecutar();
                break;
            case 6:
                Ejercicio6.ejecutar();
                break; 
            case 0:
                System.out.println("¡Gracias por usar el programa! Hasta luego.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}