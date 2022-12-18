import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Random dice = new Random();
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("How man times do you want to roll the dice?  ");
        int times = in.nextInt();

        for (int i =0; i < times; i++)
        {
            number = 1+dice.nextInt(6);
            System.out.println("-----");
            switch (number) {
                case 1:
                    System.out.println("|   |\n| 0 |\n|   |");
                    break;
                case 2:
                    System.out.println("|  0|\n|   |\n|0  |");
                    break;
                case 3:
                    System.out.println("|0  |\n| 0 |\n|  0|");
                    break;
                case 4:
                    System.out.println("|0 0|\n|   |\n|0 0|");
                    break;
                case 5:
                    System.out.println("|0 0|\n| 0 |\n|0 0|");
                    break;
                case 6:
                    System.out.println("|0 0|\n|0 0|\n|0 0|");
                    break;
            }
            System.out.println("-----");
        }
    }

}