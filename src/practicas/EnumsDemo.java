package practicas;

// Definición del Enum (conjunto de constantes fijas)
enum NivelDificultad {
    BAJO,
    MEDIO,
    ALTO
}

public class EnumsDemo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Enums (Enumeraciones) ---");

        // Creamos una variable usando el tipo de dato del Enum
        NivelDificultad miNivel = NivelDificultad.MEDIO;

        System.out.println("El nivel seleccionado actualmente es: " + miNivel);

        // Los enums son perfectos para usarse con estructuras de control como el switch
        switch (miNivel) {
            case BAJO:
                System.out.println("¡Ideal para empezar a practicar!");
                break;
            case MEDIO:
                System.out.println("Un reto interesante para poner a prueba tus habilidades.");
                break;
            case ALTO:
                System.out.println("¡Cuidado! Este nivel requiere mucha experiencia.");
                break;
        }
    }
}