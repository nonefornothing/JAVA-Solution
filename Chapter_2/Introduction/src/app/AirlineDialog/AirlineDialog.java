package app.AirlineDialog;

import javax.swing.JOptionPane;

public class AirlineDialog {

    public static void main(String[] args) {
        int selection;
        boolean isYes;

        // showConfirmDialog with 2 parameter
        // selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to
        // first class?");

        // showConfirmDialog with 5 parameter
        selection = JOptionPane.showConfirmDialog(null, "A data input error has occurred. Continue?",
                "Data input error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "You responded " + isYes);
    }
}