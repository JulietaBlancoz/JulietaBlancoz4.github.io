//Verifica si un número es par o si es múltiplo de 5
public class verificarNumeroParOMultiplo {
    public static void main(String[] args) {
        
        int numero = 9; 

     
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " no es un número par.");
        }

      
        if (numero % 5 == 0) {
            System.out.println(numero + " es un múltiplo de 5.");
        } else {
            System.out.println(numero + " no es un múltiplo de 5.");
        }
    }

}
