package practicas;

//Clase en un paquete (por defecto, para este ejemplo simularemos el acceso)
class Caja {
 public String contenidoPublico = "Accesible desde cualquier lugar.";
 private String contenidoPrivado = "Solo accesible dentro de esta clase.";
 protected String contenidoProtegido = "Accesible en el paquete o subclases.";
 String contenidoPaquete = "Accesible solo dentro de este paquete."; // Default

 public void mostrarContenidoPrivado() {
     // La clase misma PUEDE acceder a su contenido privado.
     System.out.println("Contenido Privado (mostrado desde dentro): " + contenidoPrivado);
 }
}

public class AccessSpecifiersDemo {
 public static void main(String[] args) {
     Caja miCaja = new Caja();
     System.out.println("--- Pruebas de Especificadores de Acceso ---");

     // Accesible
     System.out.println("Public: " + miCaja.contenidoPublico);
     System.out.println("Paquete (Default): " + miCaja.contenidoPaquete); // Funciona si está en el mismo paquete
     System.out.println("Protegido: " + miCaja.contenidoProtegido);       // Funciona si está en el mismo paquete

     // NO Accesible (esto causaría un error de compilación si se descomenta)
     // System.out.println(miCaja.contenidoPrivado); 

     // Accediendo indirectamente a lo privado a través de un método público
     miCaja.mostrarContenidoPrivado();
 }
}