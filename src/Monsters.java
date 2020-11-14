/**
 * Created by Jerry Johansson
 * Project: BattleSimulator_OOP_U3_Kvalit20
 * Copyright: MIT
 */
public class Monsters {

    /**
     * A Wizard is created and stats for health and damgae is assigned.
     *
     * @param playerStats User input data
     * @return Wizard-Object
     */

    public static int[] wizard(int playerStats[]) {

        int[] wizardStats = {playerStats[0] - 3, playerStats[1] + 5};
        return wizardStats;
    }

    /**
     * A knight is created and stats for health and damage is assigned.
     *
     * @param playerStats User input data
     * @return Knight-Object
     */

    public static int[] knight(int playerStats[]) {
        int[] knightStats = {playerStats[0] + 5, playerStats[1] - 3};
        return knightStats;
    }

    /**
     * A method to start a battle simulation with entered stats.
     *
     * @param playerStats User input data
     * @param wizardStats Wizard data
     * @param knightStats Knight data
     */

    public static void fight(int[] playerStats, int[] wizardStats, int[] knightStats) {
        boolean dead = false;

        double rand = Math.random() * 1;
        rand = Math.round(rand);

        if (rand == 0.0) {
            System.out.println("A wild Wizard appears!");
            while (!dead) {

                double attack = Math.random() * wizardStats[1];
                attack = Math.round(attack);
                System.out.println("The Wizard inflicts " + attack + " dmg.");

                playerStats[0] -= attack;
                System.out.println("You have " + playerStats[0] + " HP left");

                if (playerStats[0] > 0) {

                    attack = Math.random() * playerStats[1];
                    attack = Math.round(attack);
                    System.out.println("You inflict " + attack + " dmg");

                    wizardStats[0] -= attack;
                    System.out.println("The Wizard have: " + wizardStats[0] + " HP left");

                } else {
                    System.out.println("You lost the fight");
                    dead = true;

                }
                if (wizardStats[0] <= 0) {
                    System.out.println("You won the fight!");
                    dead = true;
                }
            }
        } else {

            while (!dead) {

                double attack = Math.random() * knightStats[1];
                attack = Math.round(attack);
                System.out.println("The Knight inflicts " + attack + " dmg");

                playerStats[0] -= attack;
                System.out.println("You have " + playerStats[0] + " HP left");

                if (playerStats[0] > 0) {

                    attack = Math.random() * playerStats[1];
                    attack = Math.round(attack);
                    System.out.println("You inflict " + attack + " dmg");

                    knightStats[0] -= attack;
                    System.out.println("The Knight have: " + knightStats[0] + " HP left");

                } else {
                    System.out.println("You lost the fight");
                    dead = true;

                }
                if (knightStats[0] <= 0) {
                    System.out.println("You won the fight!");
                    dead = true;
                }
            }
        }
    }
}
