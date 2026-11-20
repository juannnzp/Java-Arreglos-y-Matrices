import java.util.Scanner;

/**
 * Mayor y menor de una matriz.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Ingrese [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = entrada.nextInt();
            }
        }
        int mayor = matriz[0][0], menor = matriz[0][0];
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                if (matriz[fila][columna] > mayor) mayor = matriz[fila][columna];
                if (matriz[fila][columna] < menor) menor = matriz[fila][columna];
            }
        }
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
        entrada.close();
    }
}
