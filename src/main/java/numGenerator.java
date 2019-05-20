import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class numGenerator {

    private int[] number = new int[4];
    private int[] userNumber = new int[4];
    private Random rd = new Random();

    public numGenerator() {
        this.number = number;
        this.userNumber = userNumber;
    }

    public void giveNumber() {
        for (int i = 0; i < number.length; i++) {
            number[i] = rd.nextInt(10);
            System.out.println(number[i]);
        }
    }

    public String toString() {
        return "" + number[0] + number[1] + number[2] + number[3] + "";
    }

    public void transformNumber(int number) {
        String str = (new Integer(number)).toString();
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            userNumber[i] = Character.getNumericValue(chArr[i]);
            System.out.println(" " + i + " - " + userNumber[i]);
        }
    }

    public boolean compareNumber() {
        boolean result;
            int conter=0;
            for (int i = 0, j = 0; i < userNumber.length; i++, j++) {
                if (userNumber[i] == number[j]) {
                    conter++;
                }
            }
            System.out.println(conter+" bien");
            result = Arrays.equals(userNumber,number);
            return result;
        }
}