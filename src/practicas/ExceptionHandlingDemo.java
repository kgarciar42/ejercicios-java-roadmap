package practicas;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Manejo de Excepciones ---");

        int numerador = 10;
        int denominador = 0; // Provocará un error ya que la división por cero no existe

        try {
            System.out.println("Intentando realizar la división...");
            int resultado = numerador / denominador; // Aquí se genera la excepción
            
            // Esta línea NO se ejecutará porque el error ocurre arriba
            System.out.println("El resultado es: " + resultado); 
            
        } catch (ArithmeticException e) {
            // Capturamos el error específico de matemáticas
            System.out.println("¡ERROR CAPTURADO!: No se puede dividir un número entre cero.");
            System.out.println("Mensaje interno del error: " + e.getMessage());
            
        } finally {
            // Esto se ejecuta pase lo que pase
            System.out.println("Bloque final ejecutado: Limpieza de recursos completada.");
        }

        System.out.println("\nEl programa continuó ejecutándose con éxito gracias al bloque de captura.");
    }
}