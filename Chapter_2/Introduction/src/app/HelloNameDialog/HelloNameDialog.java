package app.HelloNameDialog;

import javax.swing.JOptionPane;

public class HelloNameDialog {

    public static void main(String[] args) {
        String result;

        // using showInputDialog's command with 2 parameter
        /*
         * result = JOptionPane.showInputDialog("What is your name?");
         */

        // using showInputDialog's command with 4 parameter
        result = JOptionPane.showInputDialog(null, "What is your area code?", "Area code information",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");

    }
}