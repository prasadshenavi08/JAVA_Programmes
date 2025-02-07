import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class RegisterWindow extends JFrame implements ActionListener {
    JLabel lblImage, lblHeader, lblUserId, lblName, lblEmail, lblPhone, lblUsername, lblPassword;
    JTextField txtUserId, txtName, txtEmail, txtPhone, txtUsername;
    JPasswordField txtPassword;
    JButton btnRegister, btnCancel;

    // Constructor
    public RegisterWindow() {
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
        lblHeader = new JLabel("Sign-Up");
        lblHeader.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeader.setBounds(10, 120, 500, 40);
        lblHeader.setForeground(new Color(0, 51, 102)); // Dark blue

        // Set up labels and text fields
        lblUserId = new JLabel("User ID:");
        lblName = new JLabel("Full Name:");
        lblEmail = new JLabel("Email:");
        lblPhone = new JLabel("Phone Number:");
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");
        txtUserId = new JTextField(20);
        txtName = new JTextField(20);
        txtEmail = new JTextField(20);
        txtPhone = new JTextField(20);
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);

        // Set up buttons
        btnRegister = new JButton("Register");
        btnCancel = new JButton("Cancel");

        // Set button colors
        btnRegister.setBackground(new Color(34, 139, 34)); // Green
        btnRegister.setForeground(Color.WHITE); // White text

        btnCancel.setBackground(new Color(220, 20, 60)); // Red
        btnCancel.setForeground(Color.WHITE); // White text

        // Set bounds for labels, text fields, and buttons
        int startY = 180;
        int labelWidth = 120;
        int fieldWidth = 250;
        int height = 30;
        int gap = 40;
        int startXLabel = 50;
        int startXField = 200;

        lblUserId.setBounds(startXLabel, startY, labelWidth, height);
        txtUserId.setBounds(startXField, startY, fieldWidth, height);

        lblName.setBounds(startXLabel, startY + gap, labelWidth, height);
        txtName.setBounds(startXField, startY + gap, fieldWidth, height);

        lblEmail.setBounds(startXLabel, startY + gap * 2, labelWidth, height);
        txtEmail.setBounds(startXField, startY + gap * 2, fieldWidth, height);

        lblPhone.setBounds(startXLabel, startY + gap * 3, labelWidth, height);
        txtPhone.setBounds(startXField, startY + gap * 3, fieldWidth, height);

        lblUsername.setBounds(startXLabel, startY + gap * 4, labelWidth, height);
        txtUsername.setBounds(startXField, startY + gap * 4, fieldWidth, height);

        lblPassword.setBounds(startXLabel, startY + gap * 5, labelWidth, height);
        txtPassword.setBounds(startXField, startY + gap * 5, fieldWidth, height);

        btnRegister.setBounds(100, startY + gap * 6, 120, 40);
        btnCancel.setBounds(250, startY + gap * 6, 120, 40);

        // Add components to the frame
        getContentPane().add(lblImage);
        getContentPane().add(lblHeader);
        getContentPane().add(lblUserId);
        getContentPane().add(txtUserId);
        getContentPane().add(lblName);
        getContentPane().add(txtName);
        getContentPane().add(lblEmail);
        getContentPane().add(txtEmail);
        getContentPane().add(lblPhone);
        getContentPane().add(txtPhone);
        getContentPane().add(lblUsername);
        getContentPane().add(txtUsername);
        getContentPane().add(lblPassword);
        getContentPane().add(txtPassword);
        getContentPane().add(btnRegister);
        getContentPane().add(btnCancel);

        // Add action listeners
        btnRegister.addActionListener(this);
        btnCancel.addActionListener(this);

        // Frame settings
        setTitle("Registration Form");
        setSize(540, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancel) {
            this.dispose();
        } else if (e.getSource() == btnRegister) {
            String userId = txtUserId.getText();
            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            if (userId.isEmpty() || name.isEmpty() || email.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!userId.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "User ID must be numeric!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(this, "Phone number must be 10 digits!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

                String query = "INSERT INTO users (userid, userfullname, useremail, mobileno, username, password) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, userId);
                pstmt.setString(2, name);
                pstmt.setString(3, email);
                pstmt.setString(4, phone);
                pstmt.setString(5, username);
                pstmt.setString(6, password);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                con.close();

                // Open Login Frame
                new LoginFrame();
                this.dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new RegisterWindow();
    }
}
