package Examen;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static int leerOpcion() {
        return sc.nextInt();
    }

    public static void crearMenu() {

        System.out.println("""
                Elija la opción que desee realizar:
                  [1] Ver todos los jugadores
                  [2] Ver pista
                  [3] Puntuación final de la partida en cada pista
                  [4] Puntuación máxima de cada pista
                  [5] Salir
                 """);

    }

    public static void pintarMenu() {

        int opc;
        boolean salir = false;

        do {
            crearMenu();
            opc = leerOpcion();

            switch (opc) {

                case 1:
                    System.out.println("Estos son todos los participantes del campeonato:");
                   Partida.verJugadores();
                    break;
                case 2:
                    System.out.println("Estás son las pistas: ");
                    break;
                case 3:
                    System.out.println("La puntuación final de la partida den cada pista es:");
                    break;
                case 4:
                    System.out.println("La puntuación máxima de cada pista es:");
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    salir = true;
                    break;

                default:
                    System.out.println("Esta opción no se encuentra en el menú, por favor escoja una de las opciones " +
                            "ofrecidas en él.");
            }

        } while (!salir);
    }

}

