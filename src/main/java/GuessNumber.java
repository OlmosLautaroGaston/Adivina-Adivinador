import java.util.Scanner;

public class GuessNumber extends AbstractNumFactory {
    Scanner scanner = new Scanner(System.in);
    private int[] goodNumber = new int[4];
    private int[] guessedNumber = new int[4];
    private int respGood;
    private int respRegular;
    private int counter = 0;

    public GuessNumber() {
        viewOfGame();
    }

    @Override
    public void viewOfGame() {
        System.out.println(" _______________________");
        System.out.println("|     HUMAN THINKER     |");
        System.out.println("|GOOD = correct position|");
        System.out.println("|REGULAR = incorrect pos|");
        System.out.println("|_______________________|");
    }


    /**
     * This method compare the numbers aleatory created with the next number repeated
     */

    public void compareNumbers() {
        for (int i = 0; i < number.length; i++) {
            if (counter >= 2) {
                for (int j = 0; j < goodNumber.length; j++) {
                    if (goodNumber[j] == number[i]) {
                        number[j] = goodNumber[j];
                        System.out.println(number[j]);
                    }
                }
            } else {
                goodNumber[i] = number[i];
                System.out.println(goodNumber[i]);
            }
        }
    }

    /**
     * all the logic of the second game is here
     *
     * @return te response good of the user, if resp=4 the game finished
     */

    public int logicBubleGame() {
        toArrayAleatoryNum();
        System.out.println("your number is " + toString() + " ?");
        System.out.println("enter the GOOD numbers..");
        respGood = scanner.nextInt();
        if (respGood == 1) {
            counter++;
            compareNumbers();
        }
        return respGood;
    }
}
