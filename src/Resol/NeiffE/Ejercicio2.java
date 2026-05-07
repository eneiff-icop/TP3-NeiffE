package Resol.NeiffE;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz que desee: ");

        int n=scanner.nextInt();

        int[][]matriz = new int[n][n]; // matriz cuadrada de tamaño n x n

        //llenar la matriz con  numeros aleatorias
        for (int i =0; i <n; i++) {
            for (int j =0; j < n; j++) {
            matriz[i][j] =(int)(Math.random()* 100) +1;
            }
        }

        //imprimir la matriz
        System.out.println("Matriz generada por el sistema:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        //metodos para sumas
        int sumaPrincipal = sumaDiagonalPrincipal(matriz);
        int sumaSecundaria =sumaDiagonalSecundaria(matriz);
        System.out.println("Suma de la diagonal principal: " +sumaPrincipal);
        System.out.println("Suma de diagonal secundaria: " + sumaSecundaria);


        //Determinar cuál de las dos sumas es mayor usando Math.max().
        int mayor = Math.max(sumaPrincipal, sumaSecundaria);
        System.out.println("La suma mayor es: " + mayor);

    }

    //  DIAGONAL PRINCIPAL
    public static int sumaDiagonalPrincipal(int[][] matriz){  //recibe una matriz de enteros y devuelve un número entero con la suma de su diagonal principal

        int suma =0; //variable que va acumulando la suma de los elementos de la diagonal principal

        for (int i= 0; i<matriz.length; i++) { //recorre la matriz por filas, y en cada fila accede al elemento de la diagonal principal (matriz[i][i])
            suma +=matriz[i][i];
        }
        return suma;
    }

    // DIAGONAL SECUNDARIA
    public static int sumaDiagonalSecundaria(int[][]matriz){

        int suma =0;
        int n=matriz.length; 

        for (int i= 0; i< n;i++) {
            suma +=matriz[i][n-1- i];
    }
return suma;
    }
}


