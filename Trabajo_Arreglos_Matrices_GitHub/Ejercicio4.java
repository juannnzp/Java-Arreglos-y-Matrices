import java.util.Scanner;

/**
 * Números pares e impares.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadPares = 0, cantidadImpares = 0, sumaPares = 0, sumaImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            if (numeros[i] % 2 == 0) { cantidadPares++; sumaPares += numeros[i]; }
            else { cantidadImpares++; sumaImpares += numeros[i]; }
        }
        System.out.println("Cantidad de pares: " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        entrada.close();
    }
}
