package practicas;

// Aquí importamos la calculadora que está en la otra carpeta
import mi_paquete_externo.CalculadoraDemo;

public class PackagesDemo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Paquetes (Packages) ---");

        // Creamos y usamos la calculadora externa
        CalculadoraDemo miCalc = new CalculadoraDemo();
        int resultado = miCalc.sumar(40, 20);
        
        System.out.println("Resultado de la suma usando un paquete externo: " + resultado);
    }
}