import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    numGenerator controller = new numGenerator();
    Scanner scaner = new Scanner(System.in);
    controller.giveNumber();
        System.out.println("el numero aleatorio es; "+controller.toString());
        System.out.println("Intente adivinar el numero aleatorio");
        boolean result;
        do {
            int num = scaner.nextInt();
            controller.transformNumber(num);
            result = controller.compareNumber();
        } while(result != true);{
            System.out.println("Felicitaciones! Adivinaste el número");
        }
        }
}
