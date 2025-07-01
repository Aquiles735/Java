import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        int [] numero =  new int[8];

//datos de forma manual
       /* numero [0]=35;
        numero [1]=40;
        numero [2]=23;
        numero [3]=11;
        numero [4]=91;
        numero [5]=16;
        numero [6]=7;
        numero [7]=12;*/
        //búsqueda manual
     //   System.out.println("El numero en la quinta posición es:  "+numero[4]);
// = 91
        //Agregar por teclado:
        Scanner teclado=new Scanner(System.in);

        //Información automática con for
        for ( int i =0;i<numero.length;i++) {
           // System.out.println("estoy en el índice: "+i+ "  Y el valor es: "+ numero[i]);
            System.out.println("Ingres el valor para el indice: "+i);
            numero[i]=teclado.nextInt();
        }
        System.out.println("Los valors ingresados fueron:  ");
        for ( int i =0;i<numero.length;i++) {
            System.out.println("Índice: "+i+ " ,valor: "+ numero[i] );
        }

    }// se van ingresando por teclado cada valor hasta i=7, luego
    // muestra indices y valores en una lista.
}