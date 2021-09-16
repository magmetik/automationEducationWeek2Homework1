package week2;

import java.util.Random;

public class DiceGamblingGame {

    public static void main(String[] args) {

        int money = 0;

        int i = 0;

        while (money != 50) {

            Random random = new Random();
            int die = random.nextInt(6) + 1;

            if ((die == 1) || (die == 2)) {
                System.out.println("Die is : " + die);
                System.out.println("Game is over");
                if(money != 0) {
                    System.out.println("You have earned " + money + "$");
                }
                break;
            }
            if(die == 3) {
                money = money;
                System.out.println("Die is : " + die);
                die = random.nextInt(6) + 1;
            }
            if (die == 4) {
                money = money + 4;
                System.out.println("Die is : " + die);
                System.out.println("money : " + money);
                die = random.nextInt(6) + 1;
            }
            if (die == 5) {
                money = money + 5;
                System.out.println("Die is : " + die);
                System.out.println("money : " + money);
                die = random.nextInt(6) + 1;
            }
            if (die == 6) {
                money = money + 6;
                System.out.println("Die is : " + die);
                System.out.println("money : " + money);
                die = random.nextInt(6) + 1;
            }
            i++;
        }

        if(money == 50) {
            System.out.println("You have earned the maximum amount of money you can earn");
        }
    }
}
