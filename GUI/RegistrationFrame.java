import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegistrationFrame extends JFrame implements ActionListener {
    JLabel lblUserId, lblName, lblEmail, lblPhone, lblUsername, lblPassword;
    JTextField txtUserId, txtName, txtEmail, txtPhone, txtUsername;
    JPasswordField txtPassword;
    JButton btnRegister, btnCancel;

    // Constructor
    public RegistrationFrame() {
        // Initialize components
        lblUserId = new JLabel("Enter User ID:");
        lblName = new JLabel("Enter Full Name:");
        lblEmail = new JLabel("Enter Email:");
        lblPhone = new JLabel("Enter Phone Number:");
        lblUsername = new JLabel("Enter Username:");
        lblPassword = new JLabel("Enter Password:");
        txtUserId = new JTextField(20);
        txtName = new JTextField(20);
        txtEmail = new JTextField(20);
        txtPhone = new JTextField(20);
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnRegister = new JButton("Register");
        btnCancel = new JButton("Cancel");

        // Set layout
        setLayout(new GridLayout(7, 2, 10, 10)); // 7 rows, 2 columns, 10px gap

        // Add components to frame in sequence
        add(lblUserId);
        add(txtUserId);
        add(lblName);
        add(txtName);
        add(lblEmail);
        add(txtEmail);
        add(lblPhone);
        add(txtPhone);
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(btnRegister);
        add(btnCancel);

        // Add action listeners
        btnRegister.addActionListener(this);
        btnCancel.addActionListener(this);

        // Frame settings
        setSize(700, 400);
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancel) {
            // Close the form
            this.dispose();
        } else if (e.getSource() == btnRegister) {
            // Retrieve input values
            String userId = txtUserId.getText();
            String name = txtName.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            // Validate inputs
            if (userId.isEmpty() || name.isEmpty() || email.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!userId.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "User ID must be a numeric value!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(this, "Phone number must be 10 digits!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new RegistrationFrame();
    }
}
