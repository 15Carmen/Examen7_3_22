package Principal;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static int leerOpcion() {
        return sc.nextInt();
    }

    public static void imprimirMenu() {

        System.out.println("""
                Elija la opción que desee realizar:
                  [1] Ver los jugadores de la pista que elija
                  [2] Puntuacion final de la partida en la pista que elija
                  [3] Conocer al jugador con la máxima puntuación de la pista que elija
                  [4] Pistas ordenadas por puntos en orden decreciente
                  [5] Salir
                 """);

    }

    public static void crearMenuPrograma() {

        int opc;
        boolean salir = false;

        do {
            imprimirMenu();
            opc = leerOpcion();

            switch (opc) {

                case 1:
                    System.out.println("Elija una pista. Tenga en cuenta que las pistas estan numeradas del 0 al 11:");
                   Utilidades.verJugadores();
                    break;
                case 2:
                    System.out.println("Elija una pista. Tenga en cuenta que las pistas estan numeradas del 0 al 11:");
                    Utilidades.puntuacionFinalPista();
                    break;
                case 3:
                    System.out.println("Elija una pista. Tenga en cuenta que las pistas estan numeradas del 0 al 11: ");
                    Utilidades.puntuacionMaxPista();
                    break;
                case 4:
                    System.out.println("Las pistas ordenadas por puntos en orden decreciente son: ");
                    Utilidades.ordenarPistas();
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

