package exp10;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

class Stopwatch 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel timeLabel = new JLabel("0", JLabel.CENTER);
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");
        JButton resetBtn = new JButton("Reset");
        JPanel panel = new JPanel();

        final int[] time = {0};
        Timer timer = new Timer(1000, e -> {
            time[0]++;
            timeLabel.setText(String.valueOf(time[0]));
        });

        startBtn.addActionListener(e -> timer.start());
        stopBtn.addActionListener(e -> timer.stop());
        resetBtn.addActionListener(e -> {
            timer.stop();
            time[0] = 0;
            timeLabel.setText("0");
        });

        panel.add(startBtn);
        panel.add(stopBtn);
        panel.add(resetBtn);

        frame.setLayout(new BorderLayout());
        frame.add(timeLabel, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}