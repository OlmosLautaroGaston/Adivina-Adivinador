import java.util.Arrays;
import java.util.Random;

public class numGenerator {

    private int[] number = new int[4];
    private int[] userNumber = new int[4];
    private Random rd = new Random();
    private int goodNum = 0;
    private int regularNum = 0;

    public numGenerator() {
        giveArrayNumber();
    }

    /**
     * We generate a random number that doesnt repeat its digits
     * the number has 4 digits
     */
    private int giveNumber() {
        int aleatorTemp = rd.nextInt(10);
        return aleatorTemp;
    }

    private void giveArrayNumber() {
        int counter = 0;
        int aleatoryNum;
        boolean flag;
        while (counter < 4) {
            aleatoryNum = giveNumber();
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
     * this method shows the number generated through its positions in the array
     */
    public String toString() {
        return "" + number[0] + number[1] + number[2] + number[3] + "";
    }

    /**
     * pass the number entered by the user to an arrangement
     */
    public void transformNumber(int number) {
        String str = (new Integer(number)).toString();
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            getUserNumber()[i] = Character.getNumericValue(chArr[i]);
        }
    }
    public int[] getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int[] userNumber) {
        this.userNumber = userNumber;
    }

    /**
     * compare the user number with the computer number
     */
    public boolean compareNumber() {
        boolean result;
        for (int i = 0, j = 0; i < getUserNumber().length; i++, j++) {
            if (getUserNumber()[i] == number[j]) {
                setGoodNum(getGoodNum() + 1);
                setRegularNum(getRegularNum() - 1);
            }
        }
        for (int i = 0; i < getUserNumber().length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (getUserNumber()[i] == number[j]) {
                    setRegularNum(getRegularNum() + 1);
                }
            }
        }
        System.out.print(getGoodNum() + " bien ");
        if (getRegularNum() < 0) {
            System.out.println("0 regular");
        } else {
            System.out.println(getRegularNum() + " regular");
            System.out.println(" ");
        }
        setRegularNum(0);
        setGoodNum(0);
        result = Arrays.equals(getUserNumber(), number);
        return result;
    }

    private int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }

    public int getRegularNum() {
        return regularNum;
    }

    public void setRegularNum(int regularNum) {
        this.regularNum = regularNum;
    }
}