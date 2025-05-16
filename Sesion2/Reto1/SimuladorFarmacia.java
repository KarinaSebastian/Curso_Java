package Sesion2.Reto1;

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args){
        // Declaración de nuestras variables en donde se guardarán los datos
        String medicamento;
        double precio;
        int cantidad;

        // Declaración de nuestro objeto de tipo Scanner para obtener valores de entrada con el teclado
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario los valores para cada una de nuestras variables
        System.out.print("Introduce el nombre del medicamento: ");
        medicamento = teclado.nextLine();
        System.out.print("Introduce el precio del medicamento: $");
        precio = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Introduce la cantidad de piezas: ");
        cantidad = teclado.nextInt();

        // Cálculo del total
        var total = precio * cantidad;

        // Variable booleana para saber si el total supera los $500.00
        boolean aplicaDescuento = total > 500;

        // Si el total supera los 500 se aplica un descuento del %15
        double descuento = aplicaDescuento ? total * 0.15 : 0;

        // Cálculo del total final
        var totalFinal = total - descuento;

        // Salida formateada
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad + " pzs");
        System.out.println("Precio Unitario: $" + precio);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
