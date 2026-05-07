package Resol.NeiffE;
import java.util.Scanner;

public class Ejercicio5 {
public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero positivo: ");
        int numero=scanner.nextInt();

        String binario= ConvertirABinario(numero);
        System.out.println("El numero " + numero + " en binario es: " + binario);
    }
    

    //método estático llamado convertirABinario(int decimal) que realice la conversión.
    public static String ConvertirABinario(int decimal){
        
        
        if (decimal==0) return "0";
        String resultado=""; //cadena vacía para ir construyendo el resultado
        while(decimal>0){
            int resto=decimal%2; //obtiene 0 o 1
            resultado = resto + resultado; // lo agrego adelante

            decimal=decimal/2; //divide el numero por 2
        }
        return resultado;
    }

}
