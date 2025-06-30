import java.util.Scanner;

public class VariosClient {

    public static void main(String[] args) {

//Ejercicio: tres tipos de servicios
// de estacionamiento , al cierre conteo total
// de vistantes de la jornada. (prueba exitosa)
        //declaración de variables
        String placa, tipoEst,respuesta;
        int cantHoras, contA=0,contB=0,contC=0;
        double totalA=0, totalB=0, totalC=0, totalD;


        System.out.println("Eres un nuevo cliente? Si o No");
    while (true) {
            Scanner teclado = new Scanner(System.in);
            respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("Si")) {


            teclado = new Scanner(System.in);
            System.out.println("Favor colocar el código la placa:  ");
            placa = teclado.next();

            System.out.println("Tu código de placa es:  " + placa);
            System.out.println("Por favor indicar el tipo de estacionanmiento:  ");
            teclado = new Scanner(System.in);//asi se puede usar de nuevo "reclado"
            tipoEst = teclado.next();
            System.out.println("El tipo de estacionamiento es  " + tipoEst);


                // Tipo "A" se le calculará el monto por la cantidad de horas
            if (tipoEst.equalsIgnoreCase("A")) {
                    System.out.println("Coloque la cantidad de Horas en uso del estacionamiento:..");
                    teclado = new Scanner(System.in);//asi se puede usar de nuevo "reclado"
                    cantHoras = teclado.nextInt();
                    totalA = (cantHoras * 3)+totalA;
                    System.out.println("La cantidad de horas de estacionamiento usados:  " + cantHoras);
                    System.out.println("Usted, dueño del vehículo con placa:  " + placa + "  Pagará 3 USD por hora  " + "pagará en total de:  " + totalA + " USD ");
                    System.out.println("Gracias por visitarnos...");
                    contA = contA + 1;

                } else if (tipoEst.equalsIgnoreCase("B")) {
                    System.out.println("Usted, dueño del vehículo con placa:  " + placa + "  Pagará 15 USD con 5% de descuento, " + "total a pagar=  " + "14,25 USD");
                    System.out.println("Gracias por visitarnos...");
                    contB = contB + 1;
                    totalB=14.25 + totalB;

                } else if ((tipoEst.equalsIgnoreCase("C"))) {


                    System.out.println("Usted, dueño del vehículo con placa:  " + placa + "  Pagará 30 USD con 10% de descuento, " + "total a pagar=  " + "27 USD");
                    contC = contC + 1;
                    totalC= 27 + totalC;
                }


                //ecualsInoreCase ( no importa si es mayuscula o minuscula


                System.out.println("Regrese pronto...");
                System.out.println("Eres un nuevo cliente? Si o No");

        } else {
        totalD=totalA+totalB+totalC;
        System.out.println("No eres cliente...");
        System.out.println("Cantidad de usuarios de estacionamiento de la jornada:");
        System.out.println("Estacionamiento tipo A:  "+ contA+"  Usuarios. Total= "+totalA+ " USD");
        System.out.println("Estacionamiento tipo B:  "+ contB+"  Usuarios.Total= "+totalB+ " USD");
        System.out.println("Estacionamiento tipo C:  "+ contC+"  Usuarios.Total= "+totalC+ " USD");
        System.out.println("Total de dinero recaudado por servicios de Estacionamiento: "+ totalD+" USD");
        break;
            }
        }

    }
}
