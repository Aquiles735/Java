
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        // activar ingreso datos por consola
        Scanner  teclado = new Scanner(System.in);
        // ingreso de dato por consola
        String variable = teclado.nextLine();
        int cant=25;
        int resultado1=Integer.parseInt(variable);//forzar String a int
       int resultado2= cant * resultado1;
        System.out.println(resultado2);
                                             */
    /*    String nombre = " casas ";
        String cosa = "perros ";
        String trabajos = "puptres";
        int numero = 40;
        int numero1 = 50;
        int none = numero * numero1;
        System.out.println("valor" + "" + cosa + "" + "=" + "" + none);
        System.out.println("Hola mm Mundo");

        System.out.println(nombre + cosa + trabajos);   */

        //declaracion de variables
        float pago,quincena,descuento,totalRecibido;

        Scanner teclado = new Scanner(System.in);
            pago = teclado.nextFloat();
            quincena=teclado.nextFloat();
            descuento=0.02f;
            totalRecibido=quincena * pago / descuento;
        System.out.println("total recibido= ");
        System.out.println(totalRecibido);

    }
}
/* Mayus+F10 para Run
* para abrir carpeta Alt+1*/
// comentar linea
