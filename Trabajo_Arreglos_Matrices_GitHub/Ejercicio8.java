import java.util.Scanner;

/**
 * Diagonal principal.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = entrada.nextInt();
            }
        }
        int sumaDiagonal = 0;
        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("\nSuma de la diagonal: " + sumaDiagonal);
        entrada.close();
    }
}
