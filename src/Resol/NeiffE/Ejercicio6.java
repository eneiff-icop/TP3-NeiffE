package Resol.NeiffE;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar(){
        Scanner scanner =new Scanner(System.in);


        System.out.print("Ingrese un mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.print("Ingrese el desplazamiento: ");
        int desplazamiento = scanner.nextInt();

        String cifrado = cifrarCesar(mensaje, desplazamiento);

        System.out.println("Mensaje cifrado: " + cifrado);
    }


    //metodo para cifrado
    public static String cifrarCesar(String texto, int desplazamiento) {

        String resultado ="";  //cadena vacía para ir guardando el resultado

        // Recorre el texto letra por letra
        for (int i =0; i <texto.length();i++){
            char letra= texto.charAt(i);

            // Solo trabaja con letras minúsculas
            if (letra>= 'a'&& letra<='z'){

                // Fórmula para el  cifrado
                letra =(char) ((letra- 'a' +desplazamiento)% 26 +'a');
            }
            resultado+=letra;
        }
        return resultado;       

    }
}
