// Verifica si un número es primo (divisible entre si mismo y 1) y menor que 100. 
public class numeroPrimo {

    public static void main(String[] args) {
        int numero = 95;

        // Verificar si el número es menor que 100
        if (numero < 100) {
            // Verificar si el número es primo
            boolean esPrimo = true;

            if (numero <= 1) {
                esPrimo = false; // 0 y 1 no son primos
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false; // Si es divisible por otro número, no es primo
                        break;
                    }
                }
            }

            // Mostrar el resultado
            if (esPrimo) {
                System.out.println(numero + " es un número primo menor que 100.");
            } else {
                System.out.println(numero + " no es un número primo o no es menor que 100.");
            }
        } else {
            System.out.println(numero + " no es menor que 100.");
        }

    }

}
