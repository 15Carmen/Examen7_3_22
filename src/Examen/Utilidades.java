package Examen;

import java.util.Arrays;

public class Utilidades {

    //Array
    public static Partida[][] Partida() {

        Partida[][] juego = {

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

        return juego;

    }

    /*
    Para poder ver a todos los jugadores deberíamos imprimir el array por pantalla
     */

    public static void verJugadores() {



    }

    /*
    Para ver una pista específica recorremos el array y mostramos solo los jugadores de la pista que especifique
    el usuario
     */

    public static void verPista() {


    }

    /*
    Para saber la puntuación final de cada pista tomamos el metodo para recorrer el array anterior y
    lo usamos para saber que 4 valores hay que sumar
     */

    public static void puntuacionFinalPista() {

    }

    /*
    Para saber la puntuación máxima de cada pista comparamos los puntos de cada jugador con el método compareTo
     */
    public static void puntuacionMaxPista() {


    }

    public static void ordenarpista(){

    }
}
