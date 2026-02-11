package bucles;

public class ejercicioDoWhile {

    public static void main(String[] args) {
        
        int contador = 0;

        do{
            System.out.println("vuelta numero: " + (contador + 1));
            contador = contador + 1;
        }while(contador < 10);
    }
}
