import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginFrame extends JFrame implements ActionListener {
    JLabel lblImage, lblHeader, lblUsername, lblPassword, lblMessage;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btnLogout, btnRegister;

    public LoginFrame() {
        // Set layout and background color
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(240, 248, 255)); // Very light blue (Alice Blue)

        // Set up the image label
        lblImage = new JLabel();
        lblImage.setHorizontalAlignment(SwingConstants.CENTER);
        lblImage.setBounds(150, 10, 200, 100); // Centered at the top
        lblImage.setIcon(new ImageIcon(new ImageIcon("D:\\Unique_System_skill\\Backend_JAVA\\Eclipse_JAVA_Program\\JDBCMiniProject\\login.jpg")
                .getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH)));

        // Set up the header
        lblHeader = new JLabel("Sign-In");
        lblHeader.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeader.setBounds(10, 120, 500, 40);
        lblHeader.setForeground(new Color(0, 51, 102)); // Dark blue

        // Set up the username and password labels
        lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblUsername.setBounds(50, 180, 120, 30);

        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblPassword.setBounds(50, 230, 120, 30);

        // Set up the message label
        lblMessage = new JLabel(" ");
        lblMessage.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        lblMessage.setForeground(Color.RED);
        lblMessage.setBounds(50, 330, 400, 30);

        // Set up text fields
        txtUsername = new JTextField(20);
        txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtUsername.setBounds(200, 180, 250, 30);

        txtPassword = new JPasswordField(20);
        txtPassword.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtPassword.setBounds(200, 230, 250, 30);

        // Set up buttons
        btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnLogin.setBackground(new Color(0, 102, 204));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBounds(50, 280, 120, 40);

        btnLogout = new JButton("Logout");
        btnLogout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnLogout.setBackground(new Color(204, 0, 0));
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setBounds(200, 280, 120, 40);

        btnRegister = new JButton("Register");
        btnRegister.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnRegister.setBackground(new Color(0, 153, 0));
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setBounds(350, 280, 120, 40);

        // Add components to the frame
        getContentPane().add(lblImage);
        getContentPane().add(lblHeader);
        getContentPane().add(lblUsername);
        getContentPane().add(txtUsername);
        getContentPane().add(lblPassword);
        getContentPane().add(txtPassword);
        getContentPane().add(btnLogin);
        getContentPane().add(btnLogout);
        getContentPane().add(btnRegister);
        getContentPane().add(lblMessage);

        // Register the buttons for event handling
        btnLogin.addActionListener(this);
        btnLogout.addActionListener(this);
        btnRegister.addActionListener(this);

        // Set frame properties
        setTitle("Login Window");
        setSize(540, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            try {
                // Database connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
                PreparedStatement pstmt = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    this.dispose();
                    new CustomerJDBC();
                } else {
                    lblMessage.setText("Invalid username or password.");
                }
            } catch (Exception ex) {
                lblMessage.setText("Error: " + ex.getMessage());
            }
        } else if (e.getSource() == btnRegister) {
            this.dispose();
            new RegisterWindow();
        } else if (e.getSource() == btnLogout) {
            System.exit(0);
        }
    }
}
