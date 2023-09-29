//Determina si una persona puede votar si es mayor de 18 años y no está inhabilitada legalmente. 
public class votar {
    public static void main(String[] args) {
        int edad = 19; 
        boolean inhabilitadoLegalmente = false; // Cambia esto a "true" si la persona está inhabilitada

        if (edad >= 18 && !inhabilitadoLegalmente) {
            System.out.println("La persona puede votar.");
        } else {
            System.out.println("La persona no puede votar.");
        }
    }
 
}
