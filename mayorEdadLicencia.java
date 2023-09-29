//Comprueba si una persona es mayor de edad y tiene un permiso de conducir. 
public class mayorEdadLicencia {
        public static void main(String[] args) {
            
            int edad = 28; 
            boolean tienePermisoConducir = true; 
    
            
            if (edad >= 18 && tienePermisoConducir) {
                System.out.println("La persona es mayor de edad y tiene permiso de conducir.");
            } else if (edad >= 18) {
                System.out.println("La persona es mayor de edad, pero no tiene permiso de conducir.");
            } else {
                System.out.println("La persona no es mayor de edad y no tiene permiso de conducir.");
            }
        
    }
    
    
}
