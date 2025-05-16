package Sesion7.Reto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    private static final Path RUTA_LOGS = Paths.get("errores.log");
    private static final Path RUTA_FALLOS = Paths.get("registro_fallos.txt");

    public static void main(String[] args) {
        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(RUTA_LOGS)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            // Mostrar resumen
            System.out.println("📊 Resumen del análisis de logs:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + conteoErrores);
            System.out.println("Cantidad de advertencias: " + conteoWarnings);

            double porcentaje = totalLineas == 0 ? 0 :
                    100.0 * (conteoErrores + conteoWarnings) / totalLineas;
            System.out.printf("Porcentaje de líneas con ERROR o WARNING: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.err.println("❌ Error al procesar el archivo: " + e.getMessage());
            registrarFallo(e.getMessage());
        }
    }

    // Método para guardar mensaje de error en archivo registro_fallos.txt
    private static void registrarFallo(String mensaje) {
        try (BufferedWriter escritor = Files.newBufferedWriter(RUTA_FALLOS)) {
            escritor.write("Error al analizar logs: " + mensaje);
            System.out.println("✅ Mensaje de error guardado en registro_fallos.txt");
        } catch (IOException e) {
            System.err.println("❌ No se pudo guardar el mensaje de error: " + e.getMessage());
        }
    }
}

