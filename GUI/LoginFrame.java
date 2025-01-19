import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;

public class LoginFrame extends JFrame implements ActionListener {
    JLabel lblUsername, lblPassword;
    JTextField txtUsername, txtPassword;
    JButton btnLogin, btnCancel, btnRegister;
    
    // Constructor
    LoginFrame() {
    	getContentPane().setBackground(new Color(192, 192, 192));
        lblUsername = new JLabel("Enter Username");
        lblPassword = new JLabel("Enter Password");
        txtUsername = new JTextField(30);
        txtPassword = new JTextField(30);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        getContentPane().add(lblUsername);
        getContentPane().add(txtUsername);
        getContentPane().add(lblPassword);
        getContentPane().add(txtPassword);
        btnRegister = new JButton("Register");
        
        getContentPane().add(btnRegister);
        btnRegister.addActionListener(this);
        getContentPane().add(btnLogin);
        getContentPane().add(btnCancel);

        //Register the component for event handling
        btnCancel.addActionListener(this);
        btnLogin.addActionListener(this);
        
        setSize(400, 300);
        setVisible(true);
        setTitle("Login Form");
        //set layout null is called absolute layout
        //then we can specify the x, y co-ordiantes for each components
        //components.setBounds(x ,y ,width,height);
        getContentPane().setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        LoginFrame f1 = new LoginFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancel) {
            this.dispose();
        }else if(e.getSource()== btnRegister){
        	new RegistrationFrame();
        } else if (e.getSource() == btnLogin) {
            String un = txtUsername.getText();
            String pwd = txtPassword.getText();
            if (un.equals("Admin") && pwd.equals("Admin123")) {
            	System.out.println("Hello ! Your login is Successfull!!! "); 
            } else {
            	System.out.println("Sorry ! Wrong username or password ");
            }
        }
    }
}
