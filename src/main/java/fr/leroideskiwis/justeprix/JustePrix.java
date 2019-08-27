package fr.leroideskiwis.justeprix;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {

    public static void main(String... args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100)+1;
        int input;

        System.out.println("Choisis un nombre entre 1 et 100");

        do{

            input = scanner.nextInt();

            new InputChecker(randomNumber, input).checkAndRun(integer -> System.out.println("Trop bas !"),
                    integer -> System.out.println("Trop haut !"),
                    integer -> System.out.println("Yes t'as gagner !"));

        }while(input != randomNumber);

        System.out.println("Bravo ! Tu as gagné !");

    }

}
