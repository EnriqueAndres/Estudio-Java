package bucles.ejerciciosSimples;

public class ejercicioCinco {

    // realizar un programa que lleve a cabo la cuenta regresiva para el anio nuevo. la cuenta debe comenzar en 10 y terminar en 1
    public static void main(String[] args) {
        
        int contador = 10;

        while (contador > 0) {
            System.out.println(contador);
            contador --;

            if(contador <= 0){
                System.out.println("Feliz anio nuevo!!!!!");
            }
        }


    }
    
}
