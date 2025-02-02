package fundamentals;

import javax.swing.JOptionPane;
public class StringToNum {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Number 1: ");
        String num2 = JOptionPane.showInputDialog("Number 2: ");

        System.out.println(num1 + num2);

        Double double1 = Double.parseDouble(num1);
        Double double2 = Double.parseDouble(num2);

        System.out.println(double1 + double2);

        System.out.println((double1 + double2)/2);

    }
}
