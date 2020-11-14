import java.util.Scanner;

/**
 * Created by Jerry Johansson
 * Project: BattleSimulator_OOP_U3_Kvalit20
 * Copyright: MIT
 */
public class Player {

    /**
     * The user enters stats for the players character wich are used in the battle simulation.
     *
     * @return User input data
     */
    public static int[] playerStats() {

        Scanner sc = new Scanner(System.in);
        int[] stats = new int[2];
        int health = 0, damage = 0;

        System.out.println("Enter your character health modifier (1 - 9: ");
        health = sc.nextInt() * 4;

        System.out.println("Enter your character Damage modifier (1 - 9): ");
        damage = sc.nextInt() * 2;

        stats[0] = health;
        stats[1] = damage;

        System.out.println("Your stats are: " +
                "\nHealth: " + health + "\nDamage: " + damage);

        return stats;
    }
}
