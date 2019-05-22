import java.util.Scanner;

public class validator {
    Scanner scaner = new Scanner(System.in);
    private int usernum;
    public validator(){
    }
    public int readNumber(){
        usernum = scaner.nextInt();
        return usernum;
    }
    public void validateNumber(){
        numGenerator num = new numGenerator();
    }
}
