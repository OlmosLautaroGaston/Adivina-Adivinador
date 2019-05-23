import java.util.Scanner;

public class validator {
    Scanner scaner = new Scanner(System.in);
    private int usernum;
    private int[] userNum = new int[4];

    public validator() {
    }

    private void readNumber() {
        usernum = scaner.nextInt();
    }

    private void transformNumber() {
        readNumber();
        String str = (new Integer(usernum)).toString();
        char[] chArr = str.toCharArray();
        if (chArr.length != 4) {
            System.out.println("Error! El numero ingresado NO contiene 4 cifras");
            readNumber();

        } else {

            for (int i = 0; i < chArr.length; i++) {
                userNum[i] = Character.getNumericValue(chArr[i]);
            }
        }

    }

    private boolean verifyNumber(int usernum) {
        boolean repeatedNum = false;
        for (int i = 0; i < userNum.length; i++) {
            for (int j = 0; j < userNum.length; j++) {
                if (userNum[i] == userNum[j] && i != j) {
                    repeatedNum = true;
                    i = j = userNum.length;
                }
            }
        }
        return repeatedNum;
    }

    public int validateNumber() {
        boolean repeatedNum = true;
        while (repeatedNum != false) {
            transformNumber();
            repeatedNum = verifyNumber(usernum);
            if (repeatedNum != false) {
                System.out.println("Error! el numero ingresado contiene cifras repetidas");
            }
        }
        return usernum;
    }
}
