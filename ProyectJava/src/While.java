import java.util.Scanner;

public class While {
    public static void main(String[] args) {

//While con ejemplo de contador.
     /*
     int contador=0;
        while ( contador <10) {
            System.out.println("Estoy por la vuelta N " + contador);
            contador++;
        }
            */




        //Bucle while controlado por centinela (muy usado)
        boolean bandera = true;

        Scanner teclado = new Scanner(System.in);
        String respuesta;
        while (true) {

            System.out.println("El valor de mi bandera es " + bandera);
            System.out.println("Quieres cambiar mi bandera con? (si/no/salir)");
            respuesta = teclado.next();
            //ecualsInoreCase ( no importa si es mayuscula o minuscula
            if (respuesta.equalsIgnoreCase("Si")) {
                bandera=true;

            } else if (respuesta.equalsIgnoreCase("No")) {
                bandera=false;
            } else if (respuesta.equalsIgnoreCase("Salir")) {
                break;

            } else {
                System.out.println("Entrada no reconocida, favor colocar 'Si','No'o 'Salir'");
            }
            System.out.println("___________________________________");
            }
        System.out.println("The end......");
        System.out.println("___________________________________");


        }


}
