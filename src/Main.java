import java.util.Scanner;

/**
 * Created by Jerry Johansson
 * Project: BattleSimulator_OOP_U3_Kvalit20
 * Copyright: MIT
 */

public class Main {

    public static void main(String[] args) {

        String[] menuText = {"[1] Enter Stats", "[2] Fight", "[3] Close"};
        int[] playerStats = new int[2];
        int[] monsterWizard = new int[2];
        int[] monsterKnight = new int[2];

        System.out.println("Welcome this is the battle simulator.");
        while (true) {

            for (String item : menuText) {
                System.out.println(item);
            }
            System.out.println("Use the numbers to choos what to do.");
            Scanner sc = new Scanner(System.in);
            int meny = Integer.parseInt(sc.nextLine());

            switch (meny) {

                //Add stats
                case 1:
                    playerStats = Player.playerStats();
                    monsterWizard = Monsters.wizard(playerStats);
                    monsterKnight = Monsters.knight(playerStats);
                    break;

                //Fight
                case 2:
                    if (playerStats[0] > 0 && playerStats[1] > 0)
                        Monsters.fight(playerStats, monsterWizard, monsterKnight);

                    else System.out.println("You need to add stats before starting a fight. Use number [1].");
                    break;

                //Exit
                case 3:
                    System.out.println("Closing the simualtor");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Use numbers 1 - 3 to choose what to do. Try again.");
                    break;
            }
        }

    }
}
