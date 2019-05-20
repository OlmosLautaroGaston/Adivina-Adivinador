import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    numGenerator number = new numGenerator();
    Scanner scaner = new Scanner(System.in);
    number.giveNumber();
        System.out.println("el numero aleatorio es; "+number.toString());
        System.out.println("Intente adivinar el numero aleatorio");
        scaner.nextInt();

    }
}
