package Sesion8.Reto2;

import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Double> registrosCPU = new HashSet<>();

        try {
            System.out.println("Ingrese el número de servidores a registrar:");
            int cantidad = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese el consumo de CPU del servidor " + i + " (%): ");
                String entrada = scanner.nextLine();

                try {
                    double valor = Double.parseDouble(entrada);

                    // Validaciones
                    if (valor < 0 || valor > 100) {
                        System.out.println("❌ Error: El valor debe estar entre 0% y 100%.");
                        i--; // repetir esta iteración
                        continue;
                    }

                    if (registrosCPU.contains(valor)) {
                        System.out.println("⚠️ Valor duplicado. No se registrará de nuevo.");
                        continue;
                    }

                    if (valor > 95) {
                        throw new ConsumoCriticoException("🚨 Consumo crítico detectado: " + valor + "%");
                    }

                    registrosCPU.add(valor);
                    System.out.println("✅ Registro exitoso: " + valor + "%");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Entrada no válida. Ingrese solo números.");
                    i--; // repetir esta iteración
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                    registrosCPU.add(95.0); // Agregamos un límite de seguridad simbólico
                }
            }

            System.out.println("\n📊 Registros únicos de consumo:");
            for (Double val : registrosCPU) {
                System.out.println("- " + val + "%");
            }

        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Debe ingresar un número válido de servidores.");
        } finally {
            scanner.close();
            System.out.println("🔚 Finalizando monitoreo.");
        }
    }
}

