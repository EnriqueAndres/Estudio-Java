package Arrays;

public class errorDesbordamiento {

    public static void main(String[] args) {
        
        int vector[]= new int [3];
        vector[0] = 8;
        vector[1] = 14;
        vector[2] = 20;

        //System.out.println("el valor de la 3ra posicion es: "+ vector[3]); // aca va a tirar error

        for(int i=0;i<4;i++){
            System.out.println("valor: "+vector[i]);
        }// otro error por fuera de longitud

    }
    
}
