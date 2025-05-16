package Sesion8.Reto1;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción: (A) Bosque / (B) Ciudad");
        String input = sc.nextLine();
        return input;
    }
}

