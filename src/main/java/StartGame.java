import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class StartGame {

    private Scanner firstEntr = new Scanner(System.in);
    private int entrance;

    public StartGame() {
        System.out.println(" _________________");
        System.out.println("|  GUESS GUESSER  |");
        System.out.println("|    GAME MODE    |");
        System.out.println("|1-  PC THINKER   |");
        System.out.println("|2- HUMAN THINKER |");
        System.out.println("|_________________|");

    }

    private void scanerNum() {
        entrance = firstEntr.nextInt();
    }
    public int validateInitNumber(){
        boolean correct = false;
        do{
            scanerNum();
            if(entrance==1 || entrance==2){
                correct=true;
            }else{
                correct=false;
                System.out.println("ERROR! You must enter a valid number");
            }
        }while(correct==false);
        return entrance;
    }
}
