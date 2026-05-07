package Resol.NeiffE;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar(){


        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10]; // array para almacenar 10 números 

        // INGRESO DE NUMEROS
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        //PROMEDIO DE PRIMOS
        double promedio = promedioPrimos(numeros);

        System.out.println("El promedio de los números primos es: " + promedio);
    }

    // MÉTODO PARA SABER SI EL NUM ES PRIMO
    public static boolean esPrimo(int n) { // un número es primo si es mayor que 1 y no tiene divisores aparte de 1 y sí mismo

        if (n <= 1) return false; // 0 y 1 no son primos

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // tiene divisor → no es primo
            }
        }

        return true; // es primo
    }

    //MÉTODO PARA PROMEDIO DE PRIMOS
    public static double promedioPrimos(int[] numeros) {

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (esPrimo(numeros[i])) {
                suma += numeros[i];
                contador++;
            }
        }
        if (contador == 0) return 0; // evitar división por 0

        return (double) suma / contador; // promedio = suma de primos / cantidad de primos
    }
}
