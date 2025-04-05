import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegistrationFrame extends JFrame implements ActionListener {
    JLabel lblUsername, lblPassword, lblEmail, lblName, lblPhone;
    JTextField txtUsername, txtEmail, txtName, txtPhone;
    JPasswordField txtPassword;
    JButton btnRegister, btnCancel;

    // Constructor
    public RegistrationFrame() {
        // Initialize components
        lblUsername = new JLabel("Enter Username:");
        lblPassword = new JLabel("Enter Password:");
        lblEmail = new JLabel("Enter Email:");
        lblName = new JLabel("Enter Name:");
        lblPhone = new JLabel("Enter Phone Number:");
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        txtEmail = new JTextField(20);
        txtName = new JTextField(20);
        txtPhone = new JTextField(20);
        btnRegister = new JButton("Register");
        btnCancel = new JButton("Cancel");

        // Set layout
        setLayout(new GridLayout(6, 2, 10, 10)); // 6 rows, 2 columns, 10px gap

        // Add components to frame
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(lblEmail);
        add(txtEmail);
        add(lblName);
        add(txtName);
        add(lblPhone);
        add(txtPhone);
        add(btnRegister);
        add(btnCancel);

        // Add action listeners
        btnRegister.addActionListener(this);
        btnCancel.addActionListener(this);

        // Frame settings
        setSize(400, 300);
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancel) {
            // Close the form
            this.dispose();
        } else if (e.getSource() == btnRegister) {
            // Retrieve input values
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());
            String email = txtEmail.getText();
            String name = txtName.getText();
            String phone = txtPhone.getText();

            // Validate inputs
            if (username.isEmpty() || password.isEmpty() || email.isEmpty() || name.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
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
