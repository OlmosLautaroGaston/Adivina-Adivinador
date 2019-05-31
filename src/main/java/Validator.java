import java.util.Scanner;

public class Validator {
    Scanner scaner = new Scanner(System.in);
    private int usernum;
    private int[] userNum = new int[4];

    public Validator() {
    }

    private void readNumber() {
        usernum = scaner.nextInt();
    }

    private void transformNumber() {
        readNumber();
        String str = (new Integer(usernum)).toString();
        char[] chArr = str.toCharArray();
        if (chArr.length != 4) {
            System.out.println("ERROR! The number entered DOES NOT contain 4 digits");
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
                System.out.println("ERROR! The number entered contains repeated figures");
            }
        }
        return usernum;
    }
}
