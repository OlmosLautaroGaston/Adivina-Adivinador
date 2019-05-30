import java.util.Arrays;

public class NumGenerator extends AbstractNumFactory {

    private int[] userNumber = new int[4];
    private int goodNum = 0;
    private int regularNum = 0;

    public NumGenerator() {
        toArrayAleatoryNum();
        viewOfGame();
    }

    @Override
    public void viewOfGame() {
        System.out.println("**** ADIVINA EL NUMERO SECRETO ****");
        System.out.println("** ingrese un numero con 4 cifras no repetidas **");
        System.out.println("** bien = numero correcto , posicion correcta **");
        System.out.println("** regular = numero correcto, posicion incorrecta **");
    }

    /**
     * the next method pass the number entered by the user to an arrangement. userNumber[]
     * now we work with userNumber []
     * is a number entered by the user and remains in modification until it is equal to the secret number
     */
    public void transformNumber(int number) {
        String str = (new Integer(number)).toString();
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            getUserNumber()[i] = Character.getNumericValue(chArr[i]);
        }
    }

    /**
     * Access to array UserNumber
     *
     * @return arrangement userNumber[]
     */
    public int[] getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int[] userNumber) {
        this.userNumber = userNumber;
    }

    /**
     * compare the user number with the computer number
     * If there are differences between the numbers, loops are executed that how many numbers and positions are correct;
     * if numUser[0] == Num[0]++GoodNum
     * if numUser[0] == Num[1]++RegularNum
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

    /**
     * access to attributes of numbers regular and good
     */

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