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


        Scanner teclado = new Scanner(System.in);
        String pago = teclado.nextLine();

        float quincena=Float.parseFloat(pago);
        float descuento=0.02f;
        float totalRecibido=quincena * descuento;
        System.out.println(totalRecibido);

    }
}
/* Mayus+F10 para Run
* para abrir carpeta Alt+1*/
// comentar linea
