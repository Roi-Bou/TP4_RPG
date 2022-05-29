package com.isep.rpg;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start;
        do {
            System.out.println("Bienvenue souhaitez-vous lancer une nouvelle partie ? oui/non");
            start = sc.nextLine();
        } while(!start.equals("oui") && !start.equals("non"));

        if (start.equals("oui")) {
            Game g = new Game();
            g.storyMode();
        }

        if (start.equals("non")){
            System.out.flush();
            System.exit(0);
        }
    }

}
