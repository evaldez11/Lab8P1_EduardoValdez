/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_eduardovaldez;
import java.util.Scanner;

import java.util.Random;

import java.util.ArrayList;

/**
 *
 * @author guali
 */
public class Game {
    public Scanner leer = new Scanner(System.in);
    public Random rand = new Random();

    ArrayList<String> lista = new ArrayList<>();

    public  void Inicio () {
        System.out.println("**********Menu**********");
        System.out.println("1.Game of Life\n2.Salir del programa\nIngrese una opcion: ");
        int opcion = leer.nextInt();

        switch (opcion) {

            case 1:

                System.out.println("Cuantas rondas quiere jugar: ");
                int rondas = leer.nextInt();
                System.out.println("Tablero Incial");
                int[][] matrices = llenar(10, 10);
                ArrayList<String> Coordenadas = lista(matrices, 10, 10);

                for (String coordenada : Coordenadas) {
                    System.out.print(coordenada);
                }
                System.out.println("");
                imprimir2(matrices);

                for (int i = 1; i < rondas + 1; i++) {
                    System.out.println("");
                    System.out.println("Round" + i);

                    System.out.println("");
                    int[][] matrices2 = nextGen(matrices);
                    ArrayList<String> Coordenadas2 = lista(matrices2, 10, 10);

                    for (String coordenada : Coordenadas2) {
                        System.out.print(coordenada);
                    }
                    System.out.println("");
                    imprimir2(matrices2);

                    matrices = matrices2;
                }

                break;
            case 2:
                System.out.println("Salio del programa");
                break;

        }
    }

    public  ArrayList<String> lista(int[][] matriz, int filas, int columnas) {
        ArrayList<String> Coordenadas = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 1) {
                    String coordenada = "(" + i + ":" + j + ")";
                    Coordenadas.add(coordenada);
                }
            }
        }

        return Coordenadas;
    }

    public  void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public  void imprimir2(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public  int[][] llenar(int fila, int columna) {
        int[][] temporal = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                temporal[i][j] = rand.nextInt(2);

                if (i == 0 || j == 0 || i == 9 || j == 9) {
                    temporal[i][j] = 0;
                }
            }
        }
        return temporal;
    }

    public  int[][] nextGen(int[][] matriz) {
        int[][] temporal = matriz;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int cont = 0;
                if (matriz[i][j] == 1) {

                    //Arriba
                    if (matriz[i - 1][j] == 1) {
                        cont++;
                    }
                    //Abajo
                    if (matriz[i + 1][j] == 1) {
                        cont++;
                    }
                    //Derecha
                    if (matriz[i][j + 1] == 1) {
                        cont++;
                    }
                    //Izquierda
                    if (matriz[i][j - 1] == 1) {
                        cont++;
                    }
                    //Arriba Derecha
                    if (matriz[i - 1][j + 1] == 1) {
                        cont++;
                    }
                    //Arriba Izquierda
                    if (matriz[i - 1][j - 1] == 1) {
                        cont++;
                    }
                    //Abajo Derecha
                    if (matriz[i + 1][j + 1] == 1) {
                        cont++;
                    }
                    //Abajo Izquierda
                    if (matriz[i + 1][j - 1] == 1) {
                        cont++;
                    }
                }

                if (cont == 3) {
                    matriz[i][j] = 0;
                }
                if (cont > 3) {
                    matriz[i][j] = 0;
                }

                if (cont < 2) {
                    matriz[i][j] = 0;
                }

            }

        }
        return temporal;
    }
}

    

