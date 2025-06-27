import java.util.Scanner;

public class Compli {
    public static void main(String[] args) {
//Declaracion de variables
        int cantidad;
        double dinero, diferencia, descuento, descuento1;
        boolean cant1, cant2, monto1, monto2;

        System.out.println("Colocar la cantidad que desea comprar:  ");
        Scanner teclado = new Scanner(System.in);
        cantidad = teclado.nextInt();

        System.out.println("Coloca la cantidad de USD que utilizará en la compra:  ");
        Scanner teclado2 = new Scanner(System.in);
        dinero = teclado2.nextDouble();

        cant1 = (cantidad < 5);
        cant2 = (cantidad >= 5 && cantidad <= 15);


        monto1 = (dinero < 100);
        monto2 = (dinero >= 100 && dinero <= 300);

        diferencia = (dinero - 300);
        descuento = dinero - (dinero * 0.05);
        descuento1 = dinero - (dinero * 0.10);


        if (cant1) {
            System.out.println("No se permiten compras inferiores a 5 productos. ");
        } else if (cant2) {
            System.out.println("El costo de envío es de $10.");
            System.out.println("Gracias por su pedido...!");
        } else {
            System.out.println("El envó será gratuito");

        }

        if (monto1) {
            System.out.println("No hay promociones, necesitas agregar " + diferencia + "  para optar a la promoción.");
        } else if (monto2) {
            System.out.println("posee un descuento del 5%, total pagar  :"+ descuento);

        }else System.out.println("Posee un descuento del 10%, en total pagará:" + descuento1);
    }
    }






