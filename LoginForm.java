import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(4, 1));

        JLabel usernameLabel = new JLabel("Username:", SwingConstants.CENTER);
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:", SwingConstants.CENTER);
        JPasswordField passwordField = new JPasswordField();

        JButton submitButton = new JButton("Submit");

        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

    }
}