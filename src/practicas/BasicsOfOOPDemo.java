package practicas;

//Definición de la clase básica
class Vehiculo {
 String marca;
 int año;

 // Constructor
 public Vehiculo(String marca, int año) {
     this.marca = marca;
     this.año = año;
 }

 // Un método simple
 public void arrancar() {
     System.out.println("El " + marca + " del " + año + " está arrancando.");
 }
}

public class BasicsOfOOPDemo {
 public static void main(String[] args) {
     // Crear instancias (objetos) de la clase Vehiculo
     Vehiculo miCoche = new Vehiculo("Toyota", 2022);
     Vehiculo tuMoto = new Vehiculo("Honda", 2021);

     // Llamar a métodos de los objetos
     System.out.println("Demostración de Fundamentos de POO:");
     miCoche.arrancar();
     tuMoto.arrancar();
 }
}