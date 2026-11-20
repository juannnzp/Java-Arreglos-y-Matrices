import java.util.Scanner;

/**
 * Mayor y menor del arreglo.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número de la posición " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        int mayor = numeros[0], menor = numeros[0];
        int posicionMayor = 0, posicionMenor = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) { mayor = numeros[i]; posicionMayor = i; }
            if (numeros[i] < menor) { menor = numeros[i]; posicionMenor = i; }
        }
        System.out.println("Mayor: " + mayor + " en la posición " + posicionMayor);
        System.out.println("Menor: " + menor + " en la posición " + posicionMenor);
        entrada.close();
    }
}
