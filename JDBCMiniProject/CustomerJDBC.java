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
import javax.swing.JTextField;

public class CustomerJDBC extends JFrame implements ActionListener {
    JLabel lblroll, lblname, lblproduct, lblmarks, lbladdress, lblpincode, lblmessage, lblheader;
    JTextField txtroll, txtname, txtproduct, txtmarks, txtaddress, txtpincode;
    JButton btninsert, btndelete, btnshow, btnupdate, btnexit;
    Font f1, headerFont;
    ImageIcon i1;

    public CustomerJDBC() {
        // Set layout and background color
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(240, 248, 255)); // Very light blue (Alice Blue)

        // Set up the header
        lblheader = new JLabel("Customer Order");
        lblheader.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblheader.setHorizontalAlignment(JLabel.CENTER);
        lblheader.setBounds(10, 20, 500, 40);
        lblheader.setForeground(new Color(0, 51, 102)); // Dark blue

        // Set up labels and text fields
        lblroll = new JLabel("Customer ID:");
        lblroll.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblroll.setBounds(50, 80, 120, 30);
        txtroll = new JTextField(20);
        txtroll.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtroll.setBounds(200, 80, 250, 30);

        lblname = new JLabel("Customer Name:");
        lblname.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblname.setBounds(50, 130, 120, 30);
        txtname = new JTextField(20);
        txtname.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtname.setBounds(200, 130, 250, 30);

        lblproduct = new JLabel("Product Name:");
        lblproduct.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblproduct.setBounds(50, 180, 120, 30);
        txtproduct = new JTextField(20);
        txtproduct.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtproduct.setBounds(200, 180, 250, 30);

        lblmarks = new JLabel("Product Price:");
        lblmarks.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblmarks.setBounds(50, 230, 120, 30);
        txtmarks = new JTextField(20);
        txtmarks.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtmarks.setBounds(200, 230, 250, 30);

        lbladdress = new JLabel("Address:");
        lbladdress.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lbladdress.setBounds(50, 280, 120, 30);
        txtaddress = new JTextField(20);
        txtaddress.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtaddress.setBounds(200, 280, 250, 30);

        lblpincode = new JLabel("Pincode:");
        lblpincode.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblpincode.setBounds(50, 330, 120, 30);
        txtpincode = new JTextField(20);
        txtpincode.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtpincode.setBounds(200, 330, 250, 30);

        // Set up the message label
        lblmessage = new JLabel(" ");
        lblmessage.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        lblmessage.setForeground(Color.RED);
        lblmessage.setBounds(50, 380, 400, 30);

        // Set up buttons in one line horizontally
        int buttonWidth = 100;
        int buttonHeight = 40;
        int spacing = 10; // Space between buttons
        int startX = 50; // Starting X position for the first button

        btninsert = new JButton("Insert");
        btninsert.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btninsert.setBackground(new Color(0, 102, 204)); // Blue
        btninsert.setForeground(Color.WHITE);
        btninsert.setBounds(startX, 420, buttonWidth, buttonHeight);

        btnupdate = new JButton("Update");
        btnupdate.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnupdate.setBackground(new Color(255, 223, 186)); // Peach
        btnupdate.setForeground(Color.BLACK);
        btnupdate.setBounds(startX + buttonWidth + spacing, 420, buttonWidth, buttonHeight);

        btndelete = new JButton("Delete");
        btndelete.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btndelete.setBackground(new Color(255, 99, 71)); // Tomato Red
        btndelete.setForeground(Color.WHITE);
        btndelete.setBounds(startX + (buttonWidth + spacing) * 2, 420, buttonWidth, buttonHeight);

        btnshow = new JButton("Show");
        btnshow.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnshow.setBackground(new Color(144, 238, 144)); // Light Green
        btnshow.setForeground(Color.BLACK);
        btnshow.setBounds(startX + (buttonWidth + spacing) * 3, 420, buttonWidth, buttonHeight);

        btnexit = new JButton("Exit");
        btnexit.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnexit.setBackground(new Color(255, 165, 0)); // Orange
        btnexit.setForeground(Color.WHITE);
        btnexit.setBounds(startX + (buttonWidth + spacing) * 4, 420, buttonWidth, buttonHeight);

        // Add components to the frame
        getContentPane().add(lblheader);
        getContentPane().add(lblroll);
        getContentPane().add(txtroll);
        getContentPane().add(lblname);
        getContentPane().add(txtname);
        getContentPane().add(lblproduct);
        getContentPane().add(txtproduct);
        getContentPane().add(lblmarks);
        getContentPane().add(txtmarks);
        getContentPane().add(lbladdress);
        getContentPane().add(txtaddress);
        getContentPane().add(lblpincode);
        getContentPane().add(txtpincode);
        getContentPane().add(btninsert);
        getContentPane().add(btnupdate);
        getContentPane().add(btndelete);
        getContentPane().add(btnshow);
        getContentPane().add(btnexit);
        getContentPane().add(lblmessage);

        // Register buttons for event handling
        btninsert.addActionListener(this);
        btnupdate.addActionListener(this);
        btndelete.addActionListener(this);
        btnshow.addActionListener(this);
        btnexit.addActionListener(this);

        // Set frame properties
        setTitle("Customer Order Management");
        setSize(650, 520); // Increase height for the new fields
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerJDBC();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Obtain connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

            if (e.getSource() == btninsert) {
                PreparedStatement pstmt = con.prepareStatement("INSERT INTO customer (id, name, product, price, address, pincode) VALUES (?, ?, ?, ?, ?, ?)");
                pstmt.setInt(1, Integer.parseInt(txtroll.getText()));
                pstmt.setString(2, txtname.getText());
                pstmt.setString(3, txtproduct.getText());
                pstmt.setInt(4, Integer.parseInt(txtmarks.getText()));
                pstmt.setString(5, txtaddress.getText());
                pstmt.setString(6, txtpincode.getText());
                pstmt.executeUpdate();
                lblmessage.setText("Record Inserted Successfully!");
            } else if (e.getSource() == btnupdate) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE customer SET name=?, product=?, price=?, address=?, pincode=? WHERE id=?");
                pstmt.setString(1, txtname.getText());
                pstmt.setString(2, txtproduct.getText());
                pstmt.setInt(3, Integer.parseInt(txtmarks.getText()));
                pstmt.setString(4, txtaddress.getText());
                pstmt.setString(5, txtpincode.getText());
                pstmt.setInt(6, Integer.parseInt(txtroll.getText()));
                pstmt.executeUpdate();
                lblmessage.setText("Record Updated Successfully!");
            } else if (e.getSource() == btndelete) {
                PreparedStatement pstmt = con.prepareStatement("DELETE FROM customer WHERE id=?");
                pstmt.setInt(1, Integer.parseInt(txtroll.getText()));
                int rows = pstmt.executeUpdate();
                lblmessage.setText(rows > 0 ? "Record Deleted!" : "Record Not Found!");
            } else if (e.getSource() == btnshow) {
                PreparedStatement pstmt = con.prepareStatement("SELECT * FROM customer WHERE id=?");
                pstmt.setInt(1, Integer.parseInt(txtroll.getText()));
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    txtname.setText(rs.getString("name"));
                    txtproduct.setText(rs.getString("product"));
                    txtmarks.setText(String.valueOf(rs.getInt("price")));
                    txtaddress.setText(rs.getString("address"));
                    txtpincode.setText(rs.getString("pincode"));
                } else {
                    lblmessage.setText("Record Not Found!");
                }
            } else if (e.getSource() == btnexit) {
                System.exit(0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            lblmessage.setText("An error occurred. Please check the console.");
        }
    }
}
