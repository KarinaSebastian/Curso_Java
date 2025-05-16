package Sesion8.Reto1;

public class MainNarrativa {

    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    // Inyección de dependencias por constructor
    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void iniciarEscena() {
        dialogo.mostrarDialogo("El sol se oculta, y el camino se bifurca frente a ti...");
        String eleccion = decision.tomarDecision();
        transicion.siguienteEscena(eleccion);
    }

    public static void main(String[] args) {
        // Inyectamos implementaciones concretas
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa juego = new MainNarrativa(transicion, dialogo, decision);
        juego.iniciarEscena();
    }
}

