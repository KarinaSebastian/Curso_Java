package Sesion1.Reto1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        Paciente p1 = new Paciente();
        System.out.println("Ingresa el nombre del Paciente: ");
        p1.nombre = datos.nextLine();
        System.out.println("Ingresa la edad del Paciente: ");
        p1.edad = datos.nextInt();
        System.out.println("Ingresa el número de expediente: ");
        datos.nextLine(); // Limpiar el buffer
        p1.numExp = datos.nextLine();
        p1.mostrarInformacion();
    }
}
