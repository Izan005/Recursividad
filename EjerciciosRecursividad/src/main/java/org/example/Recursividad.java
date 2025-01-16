package org.example;


import java.util.Scanner;

/**
 * @author Izan López Mora 1DAM
 */
public class Recursividad {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Función void que muestra por pantalla el menú principal
     */
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

    /**
     * Función void que muestra por pantalla el menú que aparece al final de cada ejercicio
     */
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

    /**
     * Función void creada para facilitar el proceso de obtención de un número y lo devuelve.
     * @return num - devuelve un número de tipo int.
     */
    public static int pedirNumInt() {
        System.out.println("Introduce un número:");
        int num = entrada.nextInt();
        return num;
    }

    /**
     * Función int que calcula la cantidad de dígitos de un número dividiendo este entre 10
     * hasta que el número sea menor que 10. A cada iteración se le suma 1 a modo de contador.
     * @param num - Número que le pasamos a la función para que haga los cálculos necesarios
     * @return num - Devuelve la variable num
     */
    public static int ejercicio1(int num) {

        if (num<10) {
            return 1;
        }
        return 1 + ejercicio1(num/10);
    }

    /**
     * Función que eleva un número (num) a la potencia que le pasemos (pot). Si la potencia
     * es 0, devuelve 1 automáticamente pero si es otro número se multiplica el número por
     * si mismo y se le resta 1 a la potencia.
     * @param num - Contiene el número con el que queremos operar.
     * @param pot - Contine la potencia a elevar.
     * @return num*ejercicio2(num,--pot)
     */

    public static int ejercicio2(int num, int pot) {

        if (pot == 0) {
            return 1;
        }
        return num*ejercicio2(num,--pot);

    }

    /**
     * Menú que se muestra al seleccionar el ejercicio 3 del menú principal.
     */
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
                System.out.println("Introduce una palabra:");
                String palabra = entrada.next();
                palabraact3 = palabra.toCharArray();
                stringEjercicio3(palabraact3.length-1);
                break;
            default:
                System.out.println("Opción inválida.");
                menuEjercicio3();
                break;
        }
    }

    /**
     * Función void que invierte un número entero y lo muestra por pantalla.
     * @param num - Número a invertir en el ejercicio
     */
    public static void intEjercicio3(int num) {

        if (num<10 && num>=0) {
            System.out.print(num);
        } else {
            System.out.print(num%10);
            intEjercicio3(num/10);
        }
    }

    static char palabraact3[];

    /**
     * Función void que invierte una cadena string y la muestra por pantalla mediante la conversión
     * de la cadena a un array de char.
     * @param cont - Cadena a invertir en el ejercicio
     */
    public static void stringEjercicio3(int cont) {

        if (cont == 0) {
            System.out.println(palabraact3[cont]);
        } else {
            System.out.print(palabraact3[cont]);
            stringEjercicio3(cont-1);
        }

    }

    /**
     * Función booleana que comprueba que un número sea binario. Esto lo comprobamos
     * verificando si está compuesto de únicamente 1s y 0s. La función devuelve
     * true si es binario y false si no lo es.
     * @param num - Número a verificar si es binario o no.
     * @return true || false - Devuelve true si es binario y false si no lo es.
     */
    public static boolean ejercicio4(int num) {

        if (num > 9) {
            if (num % 10 == 0 || num % 10 == 1) {
                return ejercicio4(num/10);
            } else {
                return false;
            }
        }
        if (num == 0 || num == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Función String que recibe un número para pasarse a binario dividiendose entre 2
     * y sumándole lo que da el módulo del número entre 2.
     * @param num - Número a convertir a binario.
     * @return num - Devuelve el número en binario convertido a string.
     */
    public static String ejercicio5(int num) {

       if (num == 0 || num == 1) {
           return Integer.toString(num);
       } else {
           return ejercicio5(num/2) + num%2;
       }

    }

    static char palabraact6[];

    /**
     * Función booleana que recibe un número y opera con un array de chars
     * que comprueba posición por posición que una palabra esté ordenada alfabéticamente.
     * @param cont - Longitud del array de chars que hemos introducido anteriormente.
     * @return true || false - Si la cadena está ordenada alfabéticamnte es true si no, false.
     */
    public static boolean ejercicio6(int cont) {

        if (cont<palabraact6.length-1) {
            if (palabraact6[cont]<=palabraact6[cont+1]) {
                return ejercicio6(++cont);
            } else  {
                return false;
            }

        }
        return true;
    }

    /**
     * Función int que obtiene la suma de todos los números desde el 1 hasta num,
     * mostrando por pantalla el proceso.
     * @param num - Número límite de la suma.
     * @return num - Devuelve el resultado final de la suma
     */
    public static int ejercicio7(int num) {

        if (num != 0) {
            if (num != 1) {
                System.out.print(num + " + ");
            } else {
                System.out.print(num);
            }

            num = ejercicio7(num-1) + num;
        }

        return num;
    }

    /**
     * Función void que contiene la selección de modos del menú principal.
     */
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
                num = pedirNumInt();
                boolean validar = ejercicio4(num);
                if (validar == true) {
                    System.out.println("El número es binario");
                } else {
                    System.out.println("El número no es binario");
                }
                break;
            case "5":
                num = pedirNumInt();
                String cad_num = ejercicio5(num);
                System.out.println(cad_num);
                break;
            case "6":
                System.out.println("Introduce una palabra:");
                String palabra = entrada.next();
                palabraact6 = palabra.toCharArray();
                boolean valido = ejercicio6(palabraact6.length);

                if (valido == true) {
                    System.out.println("Está ordenada alfabéticamnte");
                } else {
                    System.out.println("No está ordenada alfabéticamente");
                }
                break;
            case "7":
                num = pedirNumInt();
                System.out.println(" = " + ejercicio7(num));
                break;
            default:
                System.out.println("Opción incorrecta.");
                principal();
        }
       menuSalir();
    }
}