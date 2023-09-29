//Comprueba si un número es positivo y no es igual a cero. 
public class comprobarNumeroPositivo {
    public static void main(String[] args) {
        
        int numero = 1;

      
        if (numero > 0) {
            System.out.println(numero + " es un número positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es un número negativo.");
        } else {
            System.out.println(numero + " es igual a cero.");
        }
    }

    
}
