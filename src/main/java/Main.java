
public class Main {
    public static void main(String[] args) {
        StartGame initGame = new StartGame();
        int entr = initGame.validateInitNumber();
        if (entr==1){
            NumGenerator numGenerator = new NumGenerator();
            boolean result;
            Validator numUser = new Validator();
            do {
                int num = numUser.validateNumber();
                numGenerator.transformNumber(num);
                result = numGenerator.compareNumber();
            } while (result != true);
            System.out.println("Felicitaciones! Adivinaste! El numero secreto es: " + numGenerator.toString());
        }else if (entr==2){
            int rsult=0;
            GuessNumber numGuesser = new GuessNumber();
            do {
                rsult = numGuesser.logicBubleGame();
            }while(rsult !=4);


        }

    }
}
