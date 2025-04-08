package Sesion1.Reto2;

public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de la clase Entrada
        Entrada entrada = new Entrada("Concierto de Rock", 50.0);
        
        // Mostrar la información de la entrada
        entrada.mostrarInformacion();
        
        // Crear otro objeto de la clase Entrada
        Entrada entrada2 = new Entrada("Teatro", 30.0);
        
        // Mostrar la información de la segunda entrada
        entrada2.mostrarInformacion();
    }
}
