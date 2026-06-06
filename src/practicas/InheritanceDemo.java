package practicas;

// Superclase (Clase Padre)
class Animal {
    void comer() {
        System.out.println("Este animal está comiendo.");
    }
}

// Subclase (Clase Hija) que hereda de Animal usando 'extends'
class Perro extends Animal {
    void ladrar() {
        System.out.println("El perro dice: ¡Guau guau!");
    }

    // Sobrescritura de métodos (Polimorfismo / Override)
    @Override
    void comer() {
        System.out.println("El perro come croquetas en su plato.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Herencia (Inheritance) ---");

        // Creamos el objeto de la clase hija
        Perro miMascota = new Perro();

        // Usa su propio método
        miMascota.ladrar();

        // Usa el método que heredó y modificó de la clase padre
        miMascota.comer();
    }
}