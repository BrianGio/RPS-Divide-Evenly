import java.util.Scanner;

public class rps2 {
    public void rps2(){
        Scanner sage = new Scanner(System.in);
        int b;
        b = 1;
        System.out.println("Play again? Y(8), N(9)?");
        int yes= 8, no = 9;
        int input;
        input = sage.nextInt();

            if(input == yes){
                System.out.println("Rock,Paper,Scissors!");

            }else{
                System.out.println("Thanks for playing!");
            }



    }
}