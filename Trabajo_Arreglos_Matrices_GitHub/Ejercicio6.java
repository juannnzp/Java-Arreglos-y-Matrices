import java.util.Scanner;

/**
 * Llenado e impresión de matriz.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = entrada.nextInt();
            }
        }
        System.out.println("Matriz ingresada:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
        entrada.close();
    }
}
