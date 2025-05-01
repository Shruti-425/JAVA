package exp10;

import javax.swing.*;
import java.awt.*;

class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passLabel = new JLabel("Password:");
        JLabel confirmPassLabel = new JLabel("Confirm Password:");
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JPasswordField confirmPassField = new JPasswordField();
        JButton registerBtn = new JButton("Register");
        JLabel statusLabel = new JLabel("");

        frame.setLayout(new GridLayout(6, 2, 5, 5)); // Added spacing between components

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmPassLabel); frame.add(confirmPassField);
        frame.add(registerBtn); frame.add(new JLabel("")); // Empty label for spacing
        frame.add(new JLabel("Status:")); frame.add(statusLabel);

        registerBtn.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String confirm = new String(confirmPassField.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                statusLabel.setText("All fields required");
            } else if (!email.contains("@")) {
                statusLabel.setText("Invalid email");
            } else if (!pass.equals(confirm)) {
                statusLabel.setText("Passwords do not match");
            } else {
                statusLabel.setText("Registration successful!");
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
