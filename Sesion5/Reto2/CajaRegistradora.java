package Sesion5.Reto2;

public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(900.0, false) // simulación de fallo
        };

        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable) {
                Autenticable auth = (Autenticable) pago;
                if (auth.autenticar()) {
                    System.out.println("✅ Autenticación exitosa.");
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
                }
                System.out.println(); // salto de línea entre pagos
            }
        }
    }
}

