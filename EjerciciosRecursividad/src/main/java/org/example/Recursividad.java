package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursividad {
    static Scanner entrada = new Scanner(System.in);
    public static int menu(int modo) {

        boolean valid = false;
        do {
            try {
                System.out.println("*** Batería de ejercicios sobre recursividad ***");
                System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
                System.out.println("  1 - Dígitos");
                System.out.println("  2 - Potencias");
                System.out.println("  3 - Del Revés");
                System.out.println("  4 - Binario");
                System.out.println("  5 - A Binario");
                System.out.println("  6 - Orden Alfabético");
                System.out.println("  7 - Mostrar Suma");
                modo = entrada.nextInt();
                valid = true;
            }catch (InputMismatchException e) {
                System.out.println("Opción incorrecta.");
                entrada.next();
            }

        } while (!valid);

        return modo;
    }
    public static String menuSalir() {
        String opc = "";

        System.out.println("Elige una opción:");
        System.out.println("  [M] - Volver al menú principal");
        System.out.println("  [X] - Salir");
        opc = entrada.next();
        String opcup = opc.toUpperCase();
        switch (opcup) {
            case "M":
                return "M";
            case "X":
                return "X";
            default:
                System.out.println("Opción incorrecta.");
                menuSalir();
        }
        return "N";
    }
    public static void main(String[] args) {
        int modo = 0;
        String opc;
        modo = menu(modo);
        System.out.println(modo);
        opc = menuSalir();
        System.out.println(opc);
    }
}