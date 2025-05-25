package generics;

import javax.swing.*;

public class Gui {

    public static void main(String[] args) {

        int randomNumber = (int)(Math.random() * 5) + 1;
        int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from 1 to 5"));

        while (guess != randomNumber) {
            JOptionPane.showMessageDialog(null, "Wrong guess. Try again!");
            guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from 1 to 5"));
        }

        JOptionPane.showMessageDialog(null, "Congrats, you guessed the right number: " + randomNumber);
    }
}



