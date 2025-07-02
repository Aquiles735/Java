import java.util.Scanner;

public class ValorMayorMenor {
    public static void main(String[] args) {

        int[] numero = new int[11];

        Scanner teclado = new Scanner(System.in);

        //Información automática con for
        for (int i = 0; i < numero.length; i++) {
            // System.out.println("estoy en el índice: "+i+ "  Y el valor es: "+ numero[i]);
            System.out.println("Ingres el valor para el indice: " + i);
            numero[i] = teclado.nextInt();
        }
        System.out.println("Los valors ingresados fueron:  ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Índice: " + i + " ,valor: " + numero[i]);
        }


        // Inicializar mayor y menor con el primer elemento del array
        int mayor = numero[0];
        int menor = numero[0];

        // Recorrer el array desde el segundo elemento (índice 1)
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] > mayor) {
                mayor = numero[i]; // Si el número actual es mayor, actualizar 'mayor'
            }
            if (numero[i] < menor) {
                menor = numero[i]; // Si el número actual es menor, actualizar 'menor'
            }
        }
                System.out.println("El número mayor en el array es: " + mayor);
                System.out.println("El número menor en el array es: " + menor);

        }
    }
