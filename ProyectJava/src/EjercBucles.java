import java.util.Scanner;

public class EjercBucles {
    public static void main(String[] args) {

//Ejerc 1, los números del 1 al 35:

        int contador;
        for (contador = 0; contador < 35; contador++) {
            System.out.println("Aqui está el conteo hasta el 35:   " + (contador + 1));
        }

        //por teclado hasta el limite de max 100

        int conteo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Colocar un número menor de 100:  ");
        conteo = teclado.nextInt();


            if (conteo<=10) {
                System.out.println("El número es igual o menor  a 10 >= " + conteo);
            }else

                System.out.println("Fin de la actividad, condición alcanzada con éxito, "+conteo +" =>10");


            }

        }

