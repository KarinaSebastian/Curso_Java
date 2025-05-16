package Sesion5.Reto2;

public class PagoEfectivo extends MetodoPago implements Autenticable {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true; // No requiere autenticación
    }

    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}

