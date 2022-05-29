package com.isep.rpg;
import com.isep.utils.InputParser;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private int PlayerTurn;
    private InputParser inputParser;



    static void storyMode() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hero> heroes = new ArrayList<>();
        int nbHeroes = nombreHeroes();
        heroes =  creerHeros(nbHeroes);

    }

    private static int nombreHeroes(){
        Scanner sc = new Scanner(System.in);
        int nbHeroes;
        do {
            System.out.println("Bonjour aventurier, avec combien de heros souhaitez vous effectuer l'aventure (1-4)?");
            nbHeroes = sc.nextInt();
        }while(nbHeroes<0 || nbHeroes>4);
        System.out.println("Nombre de héros:"+nbHeroes);
        return nbHeroes;
    }

    public static ArrayList<Hero> creerHeros(int nbHeroes) {
        Scanner sc = new Scanner(System.in);
        int choixClasse;
        ArrayList<Hero> heroes = new ArrayList<>();
        for (int i=1;i<nbHeroes+1;i++){
            do {
                System.out.println("Classe du hero " + i + ":    1.Guerrier 2.Chasseur 3.Mage 4.Pretre");
                choixClasse = sc.nextInt();
            }while(choixClasse!=1 && choixClasse!=2 && choixClasse!=3 && choixClasse!=4);
            switch (choixClasse) {
                case 1 -> {
                    Warrior warrior = new Warrior(15, 15, 5, 5);
                    System.out.println("ok");
                    heroes.add(warrior);
                }
                case 2 -> {
                    Hunter hunter = new Hunter(12, 12, 2, 8);
                    System.out.println("ok");
                    heroes.add(hunter);
                }
                case 3 -> {
                    Mage mage = new Mage(10, 10, 2, 12, 30);
                    System.out.println("ok");
                    heroes.add(mage);
                }
                case 4 -> {
                    Priest priest = new Priest(10, 10, 2, 5, 20);
                    System.out.println("ok");
                    heroes.add(priest);
                }
                default -> System.out.println("erreur dans la création des classes");
            }
        }
        return heroes;
    }

    private static void classes(){

    }

    //public ArrayList<Hero> getHeroes(){return heroes;}

}