package Sesion5.Reto2;

public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionExitosa;

    public PagoTransferencia(double monto, boolean validacionExitosa) {
        super(monto);
        this.validacionExitosa = validacionExitosa;
    }

    @Override
    public boolean autenticar() {
        return validacionExitosa; // Simula validación bancaria externa
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando pago por transferencia por $" + monto);
    }
}
