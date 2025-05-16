package Sesion3.Reto2;

import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        // Usamos Optional para manejar valores nulos
        if (rfc == null) {
            this.rfc = Optional.empty();
        } else {
            this.rfc = Optional.of(rfc);
        }
    }

    public String getResumen() {
        String resumen = "📄 Factura generada:\n"
                + "Descripción: " + descripcion + "\n"
                + "Monto: $" + monto + "\n"
                + "RFC: " + rfc.orElse("[No proporcionado]");
        return resumen;
    }
}

