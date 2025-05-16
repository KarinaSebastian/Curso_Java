package Sesion6.Reto2;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Collections;

public class GestionTemas {
    public static void main(String[] args) {
        // Lista concurrente para temas activos
        CopyOnWriteArrayList<Tema> temasActivos = new CopyOnWriteArrayList<>();

        // Agregar temas
        temasActivos.add(new Tema("Lectura comprensiva", 2));
        temasActivos.add(new Tema("Matemáticas básicas", 1));
        temasActivos.add(new Tema("Cuidado del medio ambiente", 3));
        temasActivos.add(new Tema("Arte y creatividad", 2));
        temasActivos.add(new Tema("Educación física", 1));

        // Repositorio concurrente para recursos por tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Arte y creatividad", "https://recursos.edu/arte");
        recursos.put("Educación física", "https://recursos.edu/educacionfisica");

        // Mostrar lista ordenada alfabéticamente (orden natural por título)
        System.out.println("📋 Temas ordenados por título (alfabético):");
        Collections.sort(temasActivos); // usa compareTo
        for (Tema t : temasActivos) {
            System.out.println(t);
        }

        System.out.println("\n📋 Temas ordenados por prioridad (1 urgente → 3 opcional):");
        // Ordenar por prioridad ascendente usando Comparator
        temasActivos.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temasActivos) {
            System.out.println(t);
        }

        System.out.println("\n🔗 Repositorio de recursos por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println(titulo + " → " + recursos.get(titulo));
        }
    }
}

