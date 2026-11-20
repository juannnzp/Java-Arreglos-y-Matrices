import java.util.Scanner;

/**
 * Suma de una matriz.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int suma = 0;
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = entrada.nextInt();
                suma += matriz[fila][columna];
            }
        }
        System.out.println("Suma total: " + suma);
        entrada.close();
    }
}
