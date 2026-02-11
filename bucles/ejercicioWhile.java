package bucles;

import java.util.Scanner;

public class ejercicioWhile {
    
    public static void main(String[] args) {
        
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        while (bandera == true) {

            System.out.println("el valor de mi bandera es:" + bandera);
            System.out.println("estas actualmente suscrito?: "+ bandera);

            System.out.println("quieres desuscribirte?");
            respuesta = teclado.next();

            if(respuesta.equalsIgnoreCase("si")){
            bandera = false;

            }
            System.out.println("---------------------------");
        }


        
    }
}
