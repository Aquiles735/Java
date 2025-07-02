public class ErrorDesboda {
    public static void main(String[] args) {

int []vector=new int[3];
        vector[0]=1;
        vector[1]=35;
        vector[2]=23;
        System.out.println("Mostrar el valor de la segunda posición: "+vector[2]);

     //   System.out.println("El valor de la tercera posición:  "+vector[3] );
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//	at ErrorDesboda.main(ErrorDesboda.java:8)
        //igual ocurre el error con el for...
    }
}