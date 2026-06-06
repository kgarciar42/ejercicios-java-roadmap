package practicas;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // --- Casting Implícito (Widening) ---
        // Sucede automáticamente al pasar de un tipo menor a uno mayor.
        int numEntero = 10;
        double numDouble = numEntero; // Automático: int -> double
        System.out.println("--- Casting Implícito ---");
        System.out.println("Valor entero original: " + numEntero);
        System.out.println("Valor convertido a double: " + numDouble);

        // --- Casting Explícito (Narrowing) ---
        // Requiere sintaxis explícita porque puede haber pérdida de datos.
        double otroDouble = 15.78;
        int otroEntero = (int) otroDouble; // Forzado: double -> int (pierde decimales)
        System.out.println("\n--- Casting Explícito ---");
        System.out.println("Valor double original: " + otroDouble);
        System.out.println("Valor truncado a int: " + otroEntero);
    }
}