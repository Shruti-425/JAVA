package exp10;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TodoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JTextField taskField = new JTextField();
        JButton addBtn = new JButton("Add");
        JButton removeBtn = new JButton("Remove");

        // Layout using BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        taskField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(250, 150));

        // Add components to panel
        panel.add(new JLabel("Enter Task:"));
        panel.add(taskField);
        panel.add(addBtn);
        panel.add(removeBtn);
        panel.add(scrollPane);

        // Add functionality
        addBtn.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeBtn.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                model.remove(selectedIndex);
            }
        });

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
