package Resol.NeiffE;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto= scanner.nextLine();

        System.out.println("Ingrese un caracter: ");
        char letra= scanner.nextLine().charAt(0);

        identificarCaracter(texto, letra);
    }

    public static void identificarCaracter(String texto, char letra) {
        texto = texto.toLowerCase(); //Convierte todo el texto a minúsculas
        letra = Character.toLowerCase(letra); //Convierte la letra ingresada a minúscula

        int contador=0;//cuantas veces aparece la letra 

        System.out.print("Posiciones donde se encuentra el caracter: ");

        for (int i =0; i< texto.length();i++) { //recorre todo el texto
//texto.charAt(i) agarra el caracter en la posicion i 
            if (texto.charAt(i)== letra) { //compara la letra del texto con la elegida
                System.out.print(i +" "); //si coincide imprime la posicion y un espacio
                contador++; //suma al contador cada vez que encuentra la letra
            }
        }
        System.out.println();

//CALCULO DE PORCENTAJE
        double porcentaje =((double) contador /texto.length())* 100;

        System.out.printf("La letra '%c' aparece %d veces (%.2f%% del texto)%n",
                letra, contador, porcentaje);
    }
}
