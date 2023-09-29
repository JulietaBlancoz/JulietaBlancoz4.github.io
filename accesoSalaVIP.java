//Verifica si una persona tiene acceso a una sala VIP si es mayor de edad o si tiene una invitación especial
public class accesoSalaVIP {
    public static void main(String[] args) {
        
        int edad = 24; 
        boolean tieneInvitacionEspecial = true; 

        
        if (edad >= 18 || tieneInvitacionEspecial) {
            System.out.println("¡Bienvenido a la sala VIP!");
        } else {
            System.out.println("Lo siento, no tienes acceso a la sala VIP.");
        }
    }

}
