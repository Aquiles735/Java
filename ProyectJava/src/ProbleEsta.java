import java.util.Scanner;

public class ProbleEsta {
    public static void main(String[] args) {

        //declaración de variables
        String placa, tipoEst;
        int cantHoras;
        double total;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Favor colocar el código la placa:  ");
        placa = teclado.next();

        System.out.println("Tu código de placa es:  " + placa);
        System.out.println("Por favor indicar el tipo de estacionanmiento:  ");
        teclado = new Scanner(System.in);//asi se puede usar de nuevo "reclado"
        tipoEst = teclado.next();

        System.out.println("El tipo de estacionamiento es  " + tipoEst);

      // Tipo "A" se le calculará el monto por la cantidad de horas
        if (tipoEst.equals("A")) {
            System.out.println("Coloque la cantidad de Horas en uso del estacionamiento:..");
            teclado = new Scanner(System.in);//asi se puede usar de nuevo "reclado"
            cantHoras = teclado.nextInt();
            total = (cantHoras * 3);
            System.out.println("La cantidad de horas de estacionamiento usados:  " + cantHoras);
            System.out.println("Usted, dueño del vehículo con placa:  " + placa + "  Pagará 3 USD por hora  " + "pagará en total de:  " + total + " USD ");
            System.out.println("Gracias por visitarnos...");

        } else if (tipoEst.equals("B")) {
                System.out.println("Usted, dueño del vehículo con placa:  " + placa + "  Pagará 15 USD con 5% de descuento, " + "total a pagar=  " + "14,25 USD");
                System.out.println("Gracias por visitarnos...");

            } else
                System.out.println("Usted, dueño del vehículo con placa:  " + placa + "  Pagará 30 USD con 10% de descuento, " + "total a pagar=  " + "27 USD");

            System.out.println("Regrese pronto...");

        }
    }