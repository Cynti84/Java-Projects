package registration_form;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Registration_form {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldUserName;
	private JTextField textFieldEmail;
	private JTextField textFieldPhone;
	private JTextField textFieldAddress;
	private JPasswordField passwordFieldPassword;
	private JPasswordField passwordFieldConPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_form window = new Registration_form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 418, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(20, 47, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(126, 44, 302, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 75, 106, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBounds(126, 72, 302, 20);
		frame.getContentPane().add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 106, 106, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(10, 137, 106, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email :");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(10, 168, 106, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(126, 165, 302, 20);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Phone :");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(10, 199, 106, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(126, 196, 302, 20);
		frame.getContentPane().add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address :");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setBounds(10, 230, 106, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(126, 227, 302, 20);
		frame.getContentPane().add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(126, 270, 89, 23);


		btnSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				Connection con = null;
				PreparedStatement pr = null;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Cynti@123!");
					String sql = "insert into registration(name, username, password, confirm_password, email, phone, address) values(?, ?, ?, ?, ?, ?, ?)";     
					pr = con.prepareStatement(sql);
					pr.setString(1, textFieldName.getText());
					pr.setString(2, textFieldUserName.getText());
					pr.setString(3, new String (passwordFieldPassword.getPassword()));
					pr.setString(4, new String (passwordFieldConPassword.getPassword()));
					pr.setString(5, textFieldEmail.getText());
					pr.setString(6, textFieldPhone.getText());
					pr.setString(7, textFieldAddress.getText());
					
					pr.executeUpdate();
					
					/*int count = pr.executeUpdate();
					if(count == 1) {
						JOptionPane.showMessageDialog(null, "Record added successfully");
						con.close();
					}
					else {
						JOptionPane.showMessageDialog(null, "No record added");
						con.close();
						
					}*/
					
				} catch (SQLException ex) {
			        ex.printStackTrace();
			    } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally {
			        // Close resources in the finally block
			        try {
			            if (pr != null) {
			                pr.close();
			            }
			            if (con != null) {
			                con.close();
			            }
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
				
			}}});
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(235, 270, 89, 23);
		frame.getContentPane().add(btnReset);
		btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldName.setText("");
            	textFieldUserName.setText("");
            	passwordFieldPassword.setText("");
            	passwordFieldConPassword.setText("");
            	textFieldEmail.setText("");
            	textFieldPhone.setText("");
            	textFieldAddress.setText("");
                
            }
        });
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(339, 270, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		passwordFieldPassword = new JPasswordField();
		passwordFieldPassword.setBounds(126, 103, 302, 20);
		frame.getContentPane().add(passwordFieldPassword);
		
		passwordFieldConPassword = new JPasswordField();
		passwordFieldConPassword.setBounds(126, 134, 302, 20);
		frame.getContentPane().add(passwordFieldConPassword);
	}
}
