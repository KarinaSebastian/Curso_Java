package Sesion2;

public class Ejemplo2 {
    public static void main(String[] args){
        // Declaramos variables con los precios unitarios
        double precioCafe = 45.50;
        double precioPastel = 80.00;
        double precioAgua = 20.00;

        // Cantidades que pidió el cliente
        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadAgua = 1;

        // Supongamos que el cliene pide un pastel más
        cantidadPastel++; // Incrementamos la variable de pastel en 1

        // Cálculo del total (Con prioridad de operadores)
        double total = (precioCafe * cantidadCafe) + (precioPastel * cantidadPastel) + (precioAgua * cantidadAgua);

        // Variable booleana para verificar si el total supera los $150
        boolean aplicaDescuento = total > 150;

        // Se aplica descuento del 10% si supera los $150
        // Si se aplica el descuento (aplicaDescuento = true) se multiplica el total * 0.10, en otro caso el descuento es igual a 0
        double descuento = aplicaDescuento ? total * 0.10 : 0;

        // Guardamos el total final
        double totalFinal = total - descuento;

        // Salida formateada
        System.out.println("Total de la compra: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

    }
}
