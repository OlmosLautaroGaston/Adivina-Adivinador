
public class Main {
    public static void main(String[] args) {
        numGenerator numGenerator = new numGenerator();
        System.out.println("Intente adivinar el numero aleatorio " + numGenerator.toString());
        boolean result;
        validator numUser = new validator();
        do {
            int num = numUser.validateNumber();
            numGenerator.transformNumber(num);
            result = numGenerator.compareNumber();
        } while (result != true);
        System.out.println("Felicitaciones! Adivinaste! El numero es: " + numGenerator.toString());
    }
}
