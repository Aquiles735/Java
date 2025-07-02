import java.util.Scanner;

public class ArrayBidi {
    public static void main(String[] args) {
//Array Bidireccional...matriz
int [] [] matriz =new  int[3][4];
       //3 filas
       //4 columnas
        System.out.println("Introducir los valores de la matriz:  " +"i"+ " X "+" j:");
        Scanner teclado=new Scanner(System.in);
        //for filas y for columnas
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++) {
                System.out.println("Cargado filas:   "+i+" ,Columnas: "+j);
                matriz[i][j]=teclado.nextInt();
            }

            }System.out.println("Se mostrará la matriz:   ");
        for ( int i =0;i<matriz.length;i++){
            for ( int j =0;j<matriz.length;j++) {


                System.out.println("Fila:  "+i+ " ,Columna: "+j+ "  valor:  "+ matriz[i][j]);
            }
            }
        }

    }
/*
luego de ingresar los valores se
almacenan en éste orden fila o para todas las columnas,
fila uno para todas las columnas...etc

Fila:  0 ,Columna: 0  valor:  x
Fila:  0 ,Columna: 1  valor:  x
Fila:  0 ,Columna: 2  valor:  x
Fila:  1 ,Columna: 0  valor:  x
Fila:  1 ,Columna: 1  valor:  x
Fila:  1 ,Columna: 2  valor:  x
Fila:  2 ,Columna: 0  valor:  x
Fila:  2 ,Columna: 1  valor:  x
Fila:  2 ,Columna: 2  valor:  x
*/
