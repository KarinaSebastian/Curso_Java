package Sesion2.Reto2;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Saldo inicial (Java infiere el tipo con 'var' desde Java 10)
        var saldo = 1000.0;
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            // Mostrar menú
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            // Verificamos si el usuario ingresó un número
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Opción inválida. Por favor, ingresa un número del 1 al 4.");
                scanner.next(); // Limpiar entrada no válida
                continue;
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("✅ Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("💰 Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("❌ El monto debe ser mayor a cero.");
                    }
                    break;

                case 3:
                    System.out.print("💸 Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("❌ Fondos insuficientes. Tu saldo es: $" + saldo);
                    } else if (retiro <= 0) {
                        System.out.println("❌ El monto debe ser mayor a cero.");
                    } else {
                        saldo -= retiro;
                        System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;

                case 4:
                    System.out.println("👋 Gracias por usar el cajero automático. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Por favor, selecciona del 1 al 4.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}
