import java.util.Arrays;
import java.util.Scanner;

public class SumaSueldo {
    public static void main(String[] args) {

        double suma, media;

        int[] sueldo = new int[12];

        Scanner teclado = new Scanner(System.in);

        //Información automática con for
        for (int i = 0; i < sueldo.length; i++) {
            // System.out.println("estoy en el índice: "+i+ "  Y el valor es: "+ numero[i]);
            System.out.println("Ingres el valor para el indice: " + i);
            sueldo[i] = teclado.nextInt();
        }
        System.out.println("Los valors ingresados fueron:  ");
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("Índice: " + i + " ,valor:  $ " + sueldo[i]);
        }
        //sumatoria de los doce sueldos:
        suma= Arrays.stream(sueldo).sum();
        System.out.println("__________________________________");
        System.out.println("Suma total de sueldos: $ "+suma );

        // Promedio de los doce sueldos:
        media = suma/sueldo.length;
        System.out.println("__________________________________");
        System.out.println("media de sueldos:   $ "+media);
    }
}