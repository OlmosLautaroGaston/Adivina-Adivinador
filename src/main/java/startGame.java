import java.util.Scanner;

public class startGame {

    private Scanner firstEntr = new Scanner(System.in);
    private int entrance;

    public startGame() {
        System.out.println("**** BIENVENIDOS AL JUEGO ADIVINA ADIVINADOR ****");
        System.out.println("**** SELECCIÓN DE JUEGOS *****");
        System.out.println("1 ----> Adivinar el numero secreto");
        System.out.println("2 ----> La computadora debe adivina el numero secreto");

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
                System.out.println("ERROR!! Debe ingresar un numero válido");
            }
        }while(correct==false);
        return entrance;
    }
}
