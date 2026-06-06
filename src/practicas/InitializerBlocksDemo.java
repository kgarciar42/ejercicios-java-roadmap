package practicas;

class PruebaBloques {
    // 1. Bloque de Inicialización ESTÁTICO (Static Initializer Block)
    // Se ejecuta una Sola vez en toda la vida del programa, cuando la clase se carga en memoria.
    static {
        System.out.println("[1] -> Bloque ESTÁTICO ejecutado (La clase se cargó).");
    }

    // 2. Bloque de Inicialización de INSTANCIA (Instance Initializer Block)
    // Se ejecuta CADA VEZ que creas un nuevo objeto, justo ANTES del constructor.
    {
        System.out.println("[2] -> Bloque de INSTANCIA ejecutado (Antes del constructor).");
    }

    // 3. El Constructor de toda la vida
    public PruebaBloques() {
        System.out.println("[3] -> CONSTRUCTOR ejecutado.");
    }
}

public class InitializerBlocksDemo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Bloques de Inicialización ---");

        System.out.println("\nCreando el PRIMER objeto:");
        PruebaBloques objeto1 = new PruebaBloques();

        System.out.println("\nCreando el SEGUNDO objeto:");
        PruebaBloques objeto2 = new PruebaBloques();
    }
}