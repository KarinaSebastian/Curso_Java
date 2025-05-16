package Sesion8.Reto1;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void siguienteEscena(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("🌅 Transición a escena: El héroe toma el camino del bosque.");
        } else {
            System.out.println("🌌 Transición a escena: El héroe se adentra en la ciudad oscura.");
        }
    }
}

