package generics;

import javax.swing.*;

public class Gui {

    public static void main(String[] args) {



        int randomNumber = (int)(Math.random() * 5) + 1;
        int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from 1 to 5"));

        while (randomNumber != guess) {

            if (randomNumber == guess) {
            JOptionPane.showMessageDialog(null, "Congrats, you guessed the right number");
        } else {
            JOptionPane.showMessageDialog(null, "That's not the right number. Try again");
        }
        }




    }

}

