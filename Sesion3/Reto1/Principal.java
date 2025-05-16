package Sesion3.Reto1;

public class Principal {
    public static void main(String[] args) {
        // Crear vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Crear pasajero
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P123456");

        // Reservar asiento
        vuelo.reservarAsiento(pasajero1);

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        vuelo.cancelarReserva();

        // Mostrar itinerario sin reserva
        System.out.println(vuelo.obtenerItinerario());

        // Reservar usando nombre y pasaporte (sobrecarga)
        vuelo.reservarAsiento("Mario Gonzalez", "P654321");

        // Mostrar nuevo itinerario
        System.out.println(vuelo.obtenerItinerario());
    }
}

