import java.util.Scanner;

/**
 * Ingreso y visualización de un arreglo.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("\nValores almacenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        entrada.close();
    }
}
