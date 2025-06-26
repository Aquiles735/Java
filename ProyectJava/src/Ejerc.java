import java.util.Scanner;

public class Ejerc {
	public static void main(String[]ergs)
	{
	int edad;
	boolean edad1,edad2,edad3,edad4;

	Scanner teclado=new Scanner(System.in);

		System.out.println("Ingresar la eda para informarte de tu horario= ");
		 edad=teclado.nextInt();

		edad1=(edad>=4 && edad<=6);
		edad2=(edad>=7 && edad<=8);
		edad3=(edad>=9 && edad<=10);
		edad4=(edad>=11 && edad<=13);


		if (edad1) {
			System.out.println("Lunes y Miercoles de 16 y 17");
		} else if (edad2) {


			System.out.println("Martes y jueves de 16:30 a 17:30");
		} else if (edad3) {


			System.out.println("martes y Jueves de 17: a 19");
		} else if (edad4) {


			System.out.println("Lunes y Miercoles de 17 a 18:30 ");
		}
		else System.out.println("No tienes horario asignado, regrese pronto. ");
		}

	}
