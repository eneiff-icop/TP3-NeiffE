package Resol.NeiffE;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Ejercicio4 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera fecha (formato: YYYY-MM-DD): ");
        LocalDate fecha1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Ingrese la segunda fecha (formato: YYYY-MM-DD): ");
        LocalDate fecha2 = LocalDate.parse(scanner.nextLine());

        long dias=calcularDiasEntre (fecha1,fecha2);

//validar que la primera fecha sea anterior a la segunda
        if (dias >= 0) {
            System.out.println("La cantidad de días entre las fechas ingresadas es de: " + dias);
        } else {
            System.out.println("Error: la primera fecha debe ser anterior a la segunda.");
        }
    }

//Metodo que calcule la dif
public static long calcularDiasEntre(LocalDate f1, LocalDate f2) {
    
    if (f1.isAfter(f2)) {
            return -1; //señal de error
        }
//Diferencia en días
        return ChronoUnit.DAYS.between(f1, f2);
    }
}

