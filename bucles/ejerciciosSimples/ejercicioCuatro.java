package bucles.ejerciciosSimples;

public class ejercicioCuatro {
 
    // realizar un programa que muestre por pantalla los numeros del 200 al 250 saltando de 2 en dos. la secuencia deberia ser: 200 202 204 etc.
    public static void main(String[] args) {
        
        int contador = 200;
        
        while (contador <= 250) {
            System.out.println("tu numero es: " + (contador));
            //contador = contador + 2;
            contador += 2;
        }

    }

}
