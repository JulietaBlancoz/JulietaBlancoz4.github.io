//Determina si una cadena de texto contiene la letra "a" y la letra "b". 
public class cadenaTextoAB {
    public static void main(String[] args) {

        String texto = "Hola Mundo";

        if (texto.contains("a") && texto.contains("b")) {
            System.out.println("Hola Mundo contiene tanto 'a' como 'b'.");
        } else {
            System.out.println("Hola Mundo contiene  no contiene ambas letras 'a' y 'b'.");
        }
    }

}
