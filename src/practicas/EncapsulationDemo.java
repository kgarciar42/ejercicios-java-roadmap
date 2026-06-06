package practicas;

class CuentaBancaria {
    // Variables PRIVADAS: Nadie fuera de esta clase puede verlas o cambiarlas directamente
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // GETTER: Método público para PERMITIR LEER el saldo de forma controlada
    public double getSaldo() {
        return this.saldo;
    }

    // SETTER: Método público para PERMITIR MODIFICAR el saldo bajo reglas estrictas
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito exitoso de: $" + cantidad);
        } else {
            System.out.println("Error: No puedes depositar cantidades negativas.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Encapsulamiento ---");

        CuentaBancaria cuenta = new CuentaBancaria("Wenne", 500.0);

        // Intentar hacer esto daría un error de compilación porque el saldo es private:
        // cuenta.saldo = -1000; 

        // Forma correcta usando la cápsula segura (métodos públicos)
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        cuenta.depositar(150.0);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}