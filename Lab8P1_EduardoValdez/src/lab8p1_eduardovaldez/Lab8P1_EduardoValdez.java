/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_eduardovaldez;

import java.util.Scanner;

import java.util.Random;

import java.util.ArrayList;

/**
 *
 * @author guali
 */
public class Lab8P1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();


    public static void main(String[] args) {
        Game juego = new Game();
        juego.Inicio();
    }
}
