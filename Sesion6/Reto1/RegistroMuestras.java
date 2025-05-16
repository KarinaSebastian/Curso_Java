package Sesion6.Reto1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroMuestras {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestrasEnOrden = new ArrayList<>();
        muestrasEnOrden.add("Homo sapiens");
        muestrasEnOrden.add("Mus musculus");
        muestrasEnOrden.add("Arabidopsis thaliana");
        muestrasEnOrden.add("Homo sapiens"); // muestra replicada

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestrasEnOrden);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idAMuestra = new HashMap<>();
        idAMuestra.put("M-001", "Dra. López");
        idAMuestra.put("M-002", "Dr. Hernández");
        idAMuestra.put("M-003", "Biol. Martínez");
        idAMuestra.put("M-004", "Dra. López"); // Mismo investigador, diferente ID

        // Paso 4: Mostrar resultados

        // Mostrar lista completa de muestras en orden
        System.out.println("📥 Lista de especies en orden de llegada:");
        for (String especie : muestrasEnOrden) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧑‍🔬 Relación ID de muestra → Investigador responsable:");
        for (String id : idAMuestra.keySet()) {
            System.out.println(id + " → " + idAMuestra.get(id));
        }

        // Búsqueda por ID de muestra
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n🔍 Ingresa un ID de muestra para buscar al investigador (ej. M-002): ");
        String idBusqueda = scanner.nextLine();

        if (idAMuestra.containsKey(idBusqueda)) {
            System.out.println("✅ Investigador responsable: " + idAMuestra.get(idBusqueda));
        } else {
            System.out.println("❌ No se encontró información para el ID proporcionado.");
        }

        scanner.close();
    }
}

