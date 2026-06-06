package practicas;

class Globo {
    String color;

    public Globo(String color) {
        this.color = color;
    }
}

public class PassByValueDemo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Pass by Value en Java ---");

        // 1. CASO CON PRIMITIVOS (Se copia el valor puro)
        int numero = 10;
        probarPrimitivo(numero);
        System.out.println("Luego del método, el número original sigue siendo: " + numero); // Sigue siendo 10

        System.out.println("\n-------------------------------------------");

        // 2. CASO CON OBJETOS (Se copia el valor de la dirección en memoria)
        Globo miGlobo = new Globo("Rojo");
        System.out.println("Color original del globo ANTES del método: " + miGlobo.color);

        probarObjeto(miGlobo);
        System.out.println("Color del globo DESPUÉS del método: " + miGlobo.color); // ¡Cambió a Azul!
    }

    public static void probarPrimitivo(int copiaNumero) {
        copiaNumero = 999; // Solo modifica la copia local
    }

    public static void probarObjeto(Globo copiaReferencia) {
        // Al usar la dirección copiada, alteramos el objeto real en la memoria
        copiaReferencia.color = "Azul"; 
        
        // Si intentamos reasignar la copia a un objeto nuevo, se rompe el lazo
        // El 'miGlobo' del main no se verá afectado por la línea de abajo
        copiaReferencia = new Globo("Verde"); 
    }
}