package Principal;

import java.util.*;

public class Utilidades {

    static Scanner sc = new Scanner(System.in);

    static Partida[][] juego = {

            {//pista 1
                    new Partida("ANTONIA", 54, 5),
                    new Partida("ANTONIO", 74, 0),
                    new Partida("CARLOS", 55, 8),
                    new Partida("CARMEN	", 28, 2)},

            {//pista 2
                    new Partida("ALEJANDRO", 72, 9),
                    new Partida("ANA	", 30, 0),
                    new Partida("ANA MARIA", 74, 2),
                    new Partida("ANGEL", 26, 3)},

            {//pista 3
                    new Partida("CRISTINA", 31, 1),
                    new Partida("DANIEL", 61, 6),
                    new Partida("DAVID", 38, 5),
                    new Partida("DOLORES", 19, 2)},

            {//pista 4
                    new Partida("ELENA", 67, 1),
                    new Partida("FERNANDO", 55, 6),
                    new Partida("FRANCISCA", 29, 10),
                    new Partida("FRANCISCO", 29, 7)},

            {//pista 5
                    new Partida("FRANCISCO JAVIER", 73, 8),
                    new Partida("ISABEL", 70, 6),
                    new Partida("JAVIER", 56, 6),
                    new Partida("JESUS", 29, 0)},

            {//pista 6
                    new Partida("JOSE", 48, 5),
                    new Partida("JOSE ANTONIO", 45, 10),
                    new Partida("JOSE LUIS", 28, 6),
                    new Partida("JOSE MANUEL", 64, 7)},

            {//pista 7
                    new Partida("JOSE MARIA", 20, 1),
                    new Partida("JOSEFA", 38, 5),
                    new Partida("JUAN", 70, 2),
                    new Partida("LAURA", 54, 10)},

            {//pista 8
                    new Partida("LUCIA", 62, 0),
                    new Partida("MANUEL", 55, 10),
                    new Partida("MARIA", 32, 4),
                    new Partida("MARIA ANGELES", 71, 8)},

            {//pista 9
                    new Partida("MARIA CARMEN", 40, 0),
                    new Partida("MARIA DOLORES", 66, 7),
                    new Partida("MARIA ISABEL", 18, 8),
                    new Partida("MARIA JOSE", 56, 3)},

            {//pista 10
                    new Partida("MARIA LUISA", 29, 3),
                    new Partida("MARIA PILAR	", 31, 2),
                    new Partida("MARIA TERESA", 43, 0),
                    new Partida("MARTA", 75, 4)},

            {//pista 11
                    new Partida("MIGUEL", 53, 9),
                    new Partida("MIGUEL ANGEL", 49, 1),
                    new Partida("PABLO", 27, 6),
                    new Partida("PAULA", 64, 3)},

            {//pista 12
                    new Partida("PEDRO", 26, 8),
                    new Partida("RAFAEL", 54, 9),
                    new Partida("SARA", 28, 9),
                    new Partida("SERGIO", 69, 4)}
    };


    /**
     * Método para ver los jugadores de una pista específica que pasamos por teclado
     */

    public static void verJugadores() {

        int fila = sc.nextInt();

        try {
            for (int i = 0; i < juego[fila].length; i++) {
                System.out.print(juego[fila][i]);
            }
            System.out.println();
        } catch (Exception e) {
            if (fila < 0 || fila > 11) {
                System.out.println("Esta pista no existe");
            }
        }
    }

    /**
    * Para saber la puntuación final de cada pista tenemos que sumar los puntos de cada pista por lo que nos hacemos un
    * contador de los puntos totales
    */
    public static void puntuacionFinalPista() {

        int fila = sc.nextInt();
        int total = 0;

        try {
            for (int i = 0; i < juego[fila].length; i++) {
                total += juego[fila][i].getPuntos();
            }
            System.out.println(total);
        } catch (Exception e) {
            if (fila < 0 || fila > 11) {
                System.out.println("Esta pista no existe");
            }
        }

    }

    /**
     * Para saber la puntuación máxima de una pista nos creamos una variable auxiliar que se vaya reescribiendo si los puntos del siguiente
     * jugador son mayores que el del anterior
     */
    public static void puntuacionMaxPista() {

        int fila = sc.nextInt();
        int valorMax = 0;

        try {
            for (int i = 0; i < juego[fila].length; i++) {
                if (valorMax < juego[fila][i].getPuntos()) {
                    valorMax = juego[fila][i].getPuntos();
                }
            }
            System.out.println(valorMax);

        } catch (Exception e) {
            if (fila < 0 || fila > 11) {
                System.out.println("Esta pista no existe");
            }
        }

    }

    /**
     * Para ordenar las pistas nos creamos un ArrayList con los datos que nos piden en el boletín (el valor máximo de la pista y los datos
     * del jugador con mayor puntuación de la pista), y lo ordenamos con los métodos .sort() y compareTo()
     */

    public static void ordenarPistas() {

        ArrayList<PartidaSimplificada> listaPartidas = new ArrayList<>();

        for (int i = 0; i < juego.length; i++) { //recorremos las pistas
            Partida jugador = null;
            int total = 0;
            int valorMax=0;
            PartidaSimplificada aux;

            for (int j = 0; j < juego[i].length; j++) { //recorremos los jugadores
                total += juego[i][j].getPuntos();
                if (valorMax < juego[i][j].getPuntos()) {
                    valorMax = juego[i][j].getPuntos();
                    jugador = juego[i][j];
                }
            }

            aux = new PartidaSimplificada();
            aux.setDatos(jugador);
            aux.setPuntuacionTotal(total);

            listaPartidas.add(aux);
        }

        Collections.sort(listaPartidas, new Comparator<PartidaSimplificada>() {
            @Override
            public int compare(PartidaSimplificada o1, PartidaSimplificada o2) {
                int a= o1.getPuntuacionTotal();
                int b= o2.getPuntuacionTotal();
                int cmp = Integer.compare(b, a);;

                return cmp;
            }
        });

        System.out.println(listaPartidas);
    }

}

