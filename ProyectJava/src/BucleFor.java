public class BucleFor {

    public static void main(String[] args) {

int contador;
int suma;
// Maravilloso bucle For
for ( contador=0; contador<10; contador++){
    System.out.println("Estoy en la vuelta N "+(contador ));

    suma=3+contador;
    if (suma == 9){
        contador=11;
        System.out.println("Fin de la ejecución...");
    }
}


    }
}