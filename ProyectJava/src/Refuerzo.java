import java.util.Scanner;

public class Refuerzo {
	public static void main(String[] args) {
//Declaracion de variables
		int cantidad;
		boolean cant1, cant2;

		System.out.println("Colocar la cantidad que desea comprar:  ");
		Scanner teclado=new Scanner(System.in);
		cantidad=teclado.nextInt();
		cant1=(cantidad<5);
		cant2=(cantidad>=5 && cantidad<=15);


		if (cant1) {
			System.out.println("No se permiten compras inferiores a 5 productos. ");
		} else if (cant2) {
			System.out.println("El costo de envío es de $10.  ");
			System.out.println("Gracias por su pedido...!");
		} else {
			System.out.println("El envó será gratuito");
			System.out.println("Gracias por su pedido...!");
		}
	}
}

