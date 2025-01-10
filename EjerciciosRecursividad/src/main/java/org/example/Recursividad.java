package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursividad {
    static Scanner entrada = new Scanner(System.in);

    public static void menu() {

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("  1 - Dígitos");
        System.out.println("  2 - Potencias");
        System.out.println("  3 - Del Revés");
        System.out.println("  4 - Binario");
        System.out.println("  5 - A Binario");
        System.out.println("  6 - Orden Alfabético");
        System.out.println("  7 - Mostrar Suma");

        principal();
    }

    public static void menuSalir() {
        String opc = "";

        System.out.println("Elige una opción:");
        System.out.println("  [M] - Volver al menú principal");
        System.out.println("  [X] - Salir");
        opc = entrada.next();
        String opcup = opc.toUpperCase();
        switch (opcup) {
            case "M":
                menu();
            case "X":
                return;
            default:
                System.out.println("Opción incorrecta.");
                menuSalir();

        }

    }

    public static int pedirNumInt() {
        System.out.println("Introduce un número:");
        int num = entrada.nextInt();
        return num;
    }

    public static int ejercicio1(int num) {

        if (num<10) {
            return 1;
        }
        return 1 + ejercicio1(num/10);
    }

    public static int ejercicio2(int num, int pot) {

        if (pot == 0) {
            return 1;
        }
        return num*ejercicio2(num,--pot);

    }

    public static void menuEjercicio3() {
        int num = 0;
        System.out.println("¿Quieres invertir una cadena o un número?");
        System.out.println("   1 - Invertir cadena");
        System.out.println("   2 - Invertir número");
        String opc = entrada.next();
        switch (opc) {
            case "2":
                num = pedirNumInt();
                intEjercicio3(num);
                break;
            case "1":
//                stringEjercicio3();
                break;
            default:
                System.out.println("Opción inválida.");
                menuEjercicio3();
                break;
        }
    }

    public static void intEjercicio3(int num) {

        if (num<10 && num>=0) {
            System.out.print(num);
        } else {
            System.out.print(num%10);
            intEjercicio3(num/10);
        }


    }

    public static String stringEjercicio3(String cad) {
        return cad;
    }
    
    public static void principal() {
        String modo = entrada.next();
        int num = 0;
        switch (modo) {
            case "1":
                num = pedirNumInt();
                ejercicio1(num);
                System.out.println(ejercicio1(num));
                break;
            case "2":
                num = pedirNumInt();
                System.out.println("Introduce la potencia:");
                int pot = entrada.nextInt();
                ejercicio2(num, pot);
                System.out.println(ejercicio2(num,pot));
                break;
            case "3":
                menuEjercicio3();
                System.out.println();
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            default:
                System.out.println("Opción incorrecta.");
                principal();
        }

       menuSalir();
       System.out.println("pe");
    }
}