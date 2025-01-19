import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashWindow {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Splash Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Add the image
        JLabel lblShow = new JLabel();
        lblShow.setHorizontalAlignment(JLabel.CENTER);
        lblShow.setVerticalAlignment(JLabel.CENTER);

        // Load the image
        ImageIcon imageIcon = new ImageIcon("download.jpg");
        lblShow.setIcon(imageIcon);
        frame.add(lblShow, BorderLayout.CENTER);

        // Add the Next button
        JButton nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(80, 30));
        frame.add(nextButton, BorderLayout.SOUTH);

        // Add ActionListener to the button
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Next button clicked!");
            }
        });

        // Set the frame to be visible
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
