// Determina si un triángulo es equilátero(lados iguales) o isósceles(dos lados iguales)

public class tipoTriangulo {
    public static void main(String[] args) {
        int lado1 = 6; 
        int lado2 = 6; 
        int lado3 = 6;

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo no es ni equilátero ni isósceles.");
        }
    }
  

}
