import java.util.Random;

public class numGenerator {

    private int[] number = new int[4];
    private Random rd = new Random();

    public numGenerator(){
        this.number = number;
    }

    public void giveNumber(){
        for (int i = 0; i < number.length; i++){
            number[i] = rd.nextInt(10);
            System.out.println(number[i]);
        }
    }
    public String toString() {
        return ""+ number[0] + number[1] + number[2] + number[3] +  "";
    }

}