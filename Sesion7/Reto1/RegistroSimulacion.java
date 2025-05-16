package Sesion7.Reto1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    // Ruta del archivo de configuración dentro de carpeta "config"
    private static final Path RUTA_ARCHIVO = Paths.get("config", "parametros.txt");

    public static void main(String[] args) {
        try {
            // Parámetros a escribir en el archivo
            String parametros = """
                    Tiempo de ciclo: 55.8 segundos
                    Velocidad de línea: 1.2 m/s
                    Número de estaciones: 8
                    """;

            // Guardar parámetros (crear carpeta si no existe)
            guardarParametros(parametros);

            // Validar existencia del archivo
            if (Files.exists(RUTA_ARCHIVO)) {
                System.out.println("✅ Archivo creado correctamente en: " + RUTA_ARCHIVO.toAbsolutePath());
            } else {
                System.out.println("❌ Error: No se pudo crear el archivo.");
                return;
            }

            // Leer y mostrar contenido
            String contenido = leerParametros();
            System.out.println("\n📄 Contenido del archivo parametros.txt:");
            System.out.println(contenido);

        } catch (IOException e) {
            System.err.println("Error en operaciones de archivo: " + e.getMessage());
        }
    }

    // Método para guardar parámetros en archivo
    private static void guardarParametros(String contenido) throws IOException {
        // Crear carpeta config si no existe
        Path carpetaConfig = RUTA_ARCHIVO.getParent();
        if (!Files.exists(carpetaConfig)) {
            Files.createDirectories(carpetaConfig);
            System.out.println("📁 Carpeta 'config' creada.");
        }

        // Escribir contenido al archivo (sobrescribe si existe)
        Files.writeString(RUTA_ARCHIVO, contenido);
        System.out.println("📝 Parámetros guardados en archivo.");
    }

    // Método para leer parámetros del archivo
    private static String leerParametros() throws IOException {
        return Files.readString(RUTA_ARCHIVO);
    }
}
