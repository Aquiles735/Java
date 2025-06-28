public class Bucle {
    public static void main(String[] args) {
//bucle do while controlado por un contador ( no se utiliza casi nunca).
        int contador = 0;
        do {
            System.out.println("estoy en la vuelta " + (contador +1));
            contador=contador +1;
        } while (contador < 10);



    }
}