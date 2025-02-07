import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SplashWindow extends JFrame implements ActionListener {
    JLabel lblShow;
    JLabel lblHeading;
    JButton btnNext;

    public SplashWindow() {
        // Set layout and background color
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(240, 248, 255)); // Very light blue (Alice Blue)

        // Set up the heading label
        lblHeading = new JLabel("Customer Management System");
        lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeading.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblHeading.setBounds(10, 10, 515, 40);
        lblHeading.setForeground(new Color(0, 51, 102)); // Dark blue

        // Set up the image label
        lblShow = new JLabel();
        lblShow.setHorizontalAlignment(SwingConstants.CENTER);
        lblShow.setBounds(10, 60, 515, 300);
        lblShow.setIcon(new ImageIcon(new ImageIcon("D:\\Unique_System_skill\\Backend_JAVA\\Eclipse_JAVA_Program\\JDBCMiniProject\\welcome.jpg").getImage().getScaledInstance(515, 300, java.awt.Image.SCALE_SMOOTH)));

        // Set up the button
        btnNext = new JButton("Next");
        btnNext.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnNext.setBounds(200, 380, 150, 50);
        btnNext.setBackground(new Color(0, 102, 204)); // Blue color
        btnNext.setForeground(Color.WHITE);
        btnNext.setFocusPainted(false);

        // Add components to the frame
        getContentPane().add(lblHeading);
        getContentPane().add(lblShow);
        getContentPane().add(btnNext);

        // Add action listener to the button
        btnNext.addActionListener(this);

        // Set frame properties
        setTitle("Customer Management System");
        setSize(550, 500);
        setLocationRelativeTo(null); // Center the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SplashWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            this.dispose();
            new LoginFrame(); // Assuming LoginFrame is another class to be implemented
        }
    }
}
