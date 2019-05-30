import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int[] number = new int[4];
    private int respGood;
    private int respRegular;
    private int counter = 0;

    public GuessNumber() {
        viewOfGame();
    }

    private void viewOfGame() {
        System.out.println("Bienvenido al juego GuessNumber");
    }


    public void giveNumber() {
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] + 1;
            System.out.println("en el arreglo " + number[i] + " se almaceno el número " + i);
        }
    }

    private void reformGuessNumber() {
        if (respGood == 1) {
            if (number[3] == 9) {
                if (respGood == 1 || counter == 2) {
                    if (number[2]==9){

                    }else{
                        number[2] = number[2] +1;
                    }
                }

            } else {
                number[3] = number[3] + 1;
            }
        }
    }

    public int logicBubleGame() {
        System.out.println("Ingrese los numeros Bien");
        respGood = scanner.nextInt();
        System.out.println("Ingrese los numeros Regulares");
        respRegular = scanner.nextInt();
        counter++;
        giveNumber();
        return respGood;
    }

    public String toString() {
        return "" + number[0] + number[1] + number[2] + number[3] + "";
    }
}
