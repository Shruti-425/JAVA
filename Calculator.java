import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField display = new JTextField();
        String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", "=", "+"
        };

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (text.equals("=")) {
                        try {
                            display.setText(String.valueOf(eval(display.getText())));
                        } catch (Exception ex) {
                            display.setText("Error");
                        }
                    } else {
                        display.setText(display.getText() + text);
                    }
                }
            });
            panel.add(btn);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static double eval(String expr) throws Exception {
        Object result = new javax.script.ScriptEngineManager()
                .getEngineByName("JavaScript")
                .eval(expr);
        return Double.parseDouble(result.toString());
    }
}
