package app.TheSalaryDialog;

import javax.swing.JOptionPane;

public class TheSalaryDialog {

    public static void main(String[] args) {
        String wageString, dependentsString;
        double wage, weeklyPay;
        int dependents;

        final double HOURS_IN_WEEK = 37.5;
        wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1",
                JOptionPane.QUESTION_MESSAGE);
        wage = Double.parseDouble(wageString);
        dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary dialog 2",
                JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentsString);
        weeklyPay = wage * HOURS_IN_WEEK;

        JOptionPane.showMessageDialog(null,
                "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
    }
}