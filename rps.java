import javax.swing.JOptionPane;

public class RPS
{
    public static void main(String[] args)
    {
        String player = "";
        int computer;
        String message = "";
        String instructions = "Type one of the following: \nRock \nPaper \nScissors";
        String compPick;
        final int LOW = 1;
        final int HIGH = 3;
        final int NUM_GAMES = 10;
        int gameCount = 0;
        int playerWins = 0;
        int compWins = 0;
        int tieGames = 0;
        
        //loop that tests how many games have been played stopping after 10
        while(gameCount < NUM_GAMES)
        {
            player = "";
            message = "";
            
            //Computers randomly generated selection
            computer = LOW + (int)(Math.random() * HIGH);
            
            while(!player.equalsIgnoreCase("Rock") && !player.equalsIgnoreCase("Paper") && !player.equalsIgnoreCase("Scissors"))
            {
                player = JOptionPane.showInputDialog(null, instructions);
                player = player.toLowerCase();
                
                if(player.startsWith("ro"))
                    player = "ROCK";
                else
                    if(player.startsWith("pa"))
                        player = "PAPER";
                else
                    if(player.startsWith("sc"))
                        player = "SCISSORS";
                else
                    JOptionPane.showMessageDialog(null, "You must pick ROCK, PAPER, OR SCISSORS");
            } // end of inner while loop
            
            
            //Turn the numeric choice of the computer into a string for output
            if(computer == 1)
                compPick = "ROCK";
            else
                if(computer == 2)
                    compPick = "PAPER";
                else
                    compPick = "SCISSORS";
                
            //Game mechanics
            if(player.equals(compPick))
            {
                message = "We have a tie!";
                ++tieGames;
            }
            else
                if(player.equals("ROCK"))
                    if(compPick.equals("PAPER"))
                    {
                        message = "Oh no, computer wins!";
                        ++compWins;
                    }
                    else
                    {
                        message = "Hooray, you win!";
                        ++playerWins;
                    }
                else
                    if(player.equals("PAPER"))
                        if(compPick.equals("SCISSORS"))
                        {
                            message = "No way! The computer won!";
                            ++compWins;
                        }
                        else
                        {
                            message = "You have won this battle!";
                            ++playerWins;
                        }
                    else
                        if(compPick.equals("ROCK"))
                        {
                            message = "Ouch, the computer wins!";
                            ++compWins;
                        }
                        else
                        {
                            message = "You cut up that nasty computer, you win!";
                            ++playerWins;
                        }
                        
            ++gameCount;
            //Output message dialog box displaying the results of one game
            JOptionPane.showMessageDialog(null, "You chose " + player + "\nThe Computer picked " + compPick + "\nResult: " + message +
            "\nYou have played " + gameCount + " games so far!");
            
        }    //end of first while loop
        
        //Output message dialog box displaying the total results
        JOptionPane.showMessageDialog(null, "End of games!! \nYou won " + playerWins + " game(s) \nComputer won " + compWins + " game(s) \nThere were " + tieGames + " tie games \nTHANK YOU FOR PLAYING");
    }
}
