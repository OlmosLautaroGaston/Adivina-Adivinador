
public class Main {
    public static void main(String[] args) {
        startGame initGame = new startGame();
        int entr = initGame.validateInitNumber();
        if (entr==1){
            numGenerator numGenerator = new numGenerator();
            boolean result;
            validator numUser = new validator();
            do {
                int num = numUser.validateNumber();
                numGenerator.transformNumber(num);
                result = numGenerator.compareNumber();
            } while (result != true);
            System.out.println("Felicitaciones! Adivinaste! El numero secreto es: " + numGenerator.toString());
        }else{

        }

    }
}
