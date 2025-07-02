import java.util.Scanner;

public class EjercVector {
    public static void main(String[] args) {


String[] nombres=new String[8];
        Scanner teclado=new Scanner(System.in);
        for ( int i =0;i<nombres.length;i++) {
            // System.out.println("estoy en el índice: "+i+ "  Y el valor es: "+ numero[i]);
            System.out.println("Ingres el nombre para el indice: "+i);
            nombres[i]=teclado.next();
        }
        System.out.println("Los nombres ingresados fueron:  ");
        for ( int i =0;i<nombres.length;i++) {
            System.out.println("Índice: "+i+ " ,valor: "+ nombres[i] );
        }

    }
}
//ejemplo con String ( ocho nombres):

/*Ingres el nombre para el indice: 0
Alejandra
Ingres el nombre para el indice: 1
Leonard
Ingres el nombre para el indice: 2
Rosa
Ingres el nombre para el indice: 3
Guillermo
Ingres el nombre para el indice: 4
gabriel
Ingres el nombre para el indice: 5
daniel
Ingres el nombre para el indice: 6
luisa
Ingres el nombre para el indice: 7
ludmila
Los nombres ingresados fueron:
Índice: 0 ,valor: Alejandra
Índice: 1 ,valor: Leonard
Índice: 2 ,valor: Rosa
Índice: 3 ,valor: Guillermo
Índice: 4 ,valor: gabriel
Índice: 5 ,valor: daniel
Índice: 6 ,valor: luisa
Índice: 7 ,valor: ludmila*/
