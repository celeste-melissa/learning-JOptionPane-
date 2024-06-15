import javax.swing.JOptionPane; // displays a standard dialog box that either takes in user input or displays a message

public class Main {
    public static void main(String[] args) {
        // prompting user to input their name and displaying a message with the user provided input
        String name = JOptionPane.showInputDialog("Enter your name");// dialog box accepts input
        JOptionPane.showMessageDialog(null, "Hello " +name); //display input with a message

        // prompting user to input their age and displaying a message with the user provided input
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); // convert input to store int variable using the parseInt method
        JOptionPane.showMessageDialog(null, "You are " + age + " years old"); //display input with a message

        // prompting user to input their height and displaying a message with the user provided input
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); // convert input to store double variable using parseDouble method
        JOptionPane.showMessageDialog(null, "You are " + height + " tall".); // display input with a message
    }
}
