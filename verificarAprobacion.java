//Verifica si un estudiante ha aprobado si su nota es mayor o igual a 70 o si ha obtenido un resultado de "Aprobado" en su evaluación. 

    public class verificarAprobacion {
        public static void main(String[] args) {
            int nota = 78; 
            String resultado = "Aprobado"; 
    
            // Verificar si el estudiante ha aprobado
            if (nota >= 70 || resultado.equals("Aprobado")) {
                System.out.println("El estudiante ha aprobado.");
            } else {
                System.out.println("El estudiante no ha aprobado.");
            }
        }
    }
    
