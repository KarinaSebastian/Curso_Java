package Sesion3.Reto1;

public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("✅ Reserva realizada con éxito.");
            return true;
        } else {
            System.out.println("❌ Ya hay una reserva para este vuelo.");
            return false;
        }
    }

    // Método sobrecargado
    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva() {
        if (asientoReservado != null) {
            System.out.println("❌ Cancelando reserva...");
            asientoReservado = null;
        } else {
            System.out.println("⚠️ No hay reserva que cancelar.");
        }
    }

    public String obtenerItinerario() {
        String info = "\n✈️ Itinerario del vuelo:\n"
                + "Código: " + codigoVuelo + "\n"
                + "Destino: " + destino + "\n"
                + "Salida: " + horaSalida + "\n"
                + "Pasajero: ";
        if (asientoReservado != null) {
            info += asientoReservado.getNombre();
        } else {
            info += "[Sin reserva]";
        }
        return info;
    }
}

