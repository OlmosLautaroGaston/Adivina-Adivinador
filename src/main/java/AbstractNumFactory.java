import java.util.Random;

public abstract class AbstractNumFactory {
    private Random rd = new Random();
    private int[] number = new int[4];


    public AbstractNumFactory() {

    }

    /**
     * view of each game mode
     */
    public abstract void viewOfGame();

    /**
     * We generate a random number
     * the number is between 0 and 9
     */
    private int giveAleatoryNum() {
        int aleatorTemp = rd.nextInt(10);
        return aleatorTemp;
    }

    /**
     * pass to array the number and identify as unique
     */

    public void toArrayAleatoryNum() {
        int counter = 0;
        int aleatoryNum;
        boolean flag;
        while (counter < 4) {
            aleatoryNum = giveAleatoryNum();
            flag = false;
            for (int i = 0; i < number.length && !flag; i++) {
                if (aleatoryNum == number[i]) {
                    flag = true;
                }
            }
            if (flag) {
            } else {
                number[counter++] = aleatoryNum;
            }
        }
    }

    /**
     * shows the number generated through its positions in the array
     */
    public String toString() {
        return "" + number[0] + number[1] + number[2] + number[3] + "";
    }
}
