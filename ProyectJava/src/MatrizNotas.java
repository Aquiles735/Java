
import java.util.Scanner;

public class MatrizNotas {
    public static void main(String[] args) {

        double suma,promedio;

        int[][] matriz = new int[3][4]; //3 filas,4 columnas

        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Introducir las Notas de cada estudiante ---");


        for (int i = 0; i < matriz.length; i++) {
            suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Calificación Estudiante " + (i + 1) + " (Evaluación " + (j + 1) + "): ");
                matriz[i][j] = teclado.nextInt();
                suma += matriz[i][j];
            }
            promedio = suma / matriz[i].length;
            System.out.println("Promedio del Estudiante " + (i + 1) + ": " + String.format("%.2f", promedio) + " Ptos.");
            System.out.println("----------------------------------------------");//String.format("%.2f", promedio)
        }                                                                        //para limitar número de decimales a 2

        System.out.println("\n--- Se mostrará el resumen de la matriz de notas ---");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Estudiante: " + (i + 1) + ", Evaluación: " + (j + 1) + " | Nota: " + matriz[i][j] + " Ptos.");
            }
            System.out.println("----------------------------------------------");
        }

        System.out.println("\n¡Valores ingresados y promedios calculados!");
        teclado.close();
    }
}