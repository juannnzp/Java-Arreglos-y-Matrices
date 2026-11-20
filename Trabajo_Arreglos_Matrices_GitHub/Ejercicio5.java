import java.util.Scanner;

/**
 * Modificación del arreglo.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[12];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número positivo para la posición " + i + ": ");
            int numero = entrada.nextInt();
            while (numero <= 0) {
                System.out.print("Debe ser positivo. Ingrese nuevamente: ");
                numero = entrada.nextInt();
            }
            numeros[i] = numero + i;
        }
        System.out.println("Arreglo modificado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        entrada.close();
    }
}
