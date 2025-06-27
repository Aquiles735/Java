import java.util.Scanner;

public class Terna {
	public static void main(String[] args) {

float promedio;
String condiciomFinal;

		System.out.println("ingresar el promedio: ");
		Scanner teclado =new Scanner(System.in);
		promedio=teclado.nextFloat();

		//Estructura Ternaria, si se cumple es y si no, es...
		condiciomFinal=(promedio>=10)?" Aprobado":"Desaprobado";
		System.out.println("El promedio fué= "+ promedio+ "la condicion final del estudiante, es= "+ condiciomFinal);
	}
}