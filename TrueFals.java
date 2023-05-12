package Boolean.task1;

import java.util.Random;

public class TrueFals {
    public TrueFals() {
    }

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;
        System.out.println("Могу ли я поити гулять?" + canWalk);

        boolean isEdekaOpen = false;
        boolean isReveOpen = true;
        boolean canBuy = isEdekaOpen, isReveopen;
        System.out.println("Я могу купить еду:" + canBuy);

        int temperature1 = 140;
        int temperature2 = 90;
        boolean result = temperature1 > temperature2;
        System.out.println("Resultat:" + result);

        int n = generateRandomSeconds();
        System.out.println("Осталось секунд: " + n);
        printRemainingHours(n);
    }

    public static int generateRandomSeconds() {
        Random random = new Random();
        return random.nextInt(28801);


    }

    public static void printRemainingHours(int seconds) {
        int hours = seconds / 9000;
        if (hours > 0) {
            System.out.println("Осталось " + hours  + "час" );
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}

