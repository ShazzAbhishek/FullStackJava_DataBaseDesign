//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.LayoutStyle.ComponentPlacement;
//
//public class UserForm extends JFrame {
//	static UserForm frame;
//	private JPanel contentPane;
//	private JTextField textField;
//	private JTextField textField_1;
//	//private JTextField textField_2;
//	//private JTextField textField_3;
//	private JTextField textField_4;
//	private JPasswordField passwordField;
//	private JTextField textField_2;
//
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new UserForm();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	public UserForm() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(440, 240, 720, 480);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		
//		JLabel lblAddLibrarian = new JLabel("Add Librarian");
//		lblAddLibrarian.setForeground(Color.BLACK);
//		lblAddLibrarian.setFont(new Font("Tahoma", Font.BOLD, 22));
//		
//		JLabel lbfName = new JLabel("FirstName:");
//		JLabel lblName = new JLabel("LastName:");
//		JLabel lblPassword = new JLabel("Pin:");
//		JLabel lblEmail = new JLabel("Email:");
//	
//		JLabel lblContactNo = new JLabel("Contact No:");
//		
//		textField = new JTextField();
//		textField.setColumns(10);
//		
//		textField_1 = new JTextField();
//		textField_1.setColumns(10);
//		
//		textField_2 = new JTextField();
//		textField_2.setColumns(10);
////		
////		textField_3 = new JTextField();
////		textField_3.setColumns(10);
////		
//		textField_4 = new JTextField();
//		textField_4.setColumns(10);
//		
//		passwordField = new JPasswordField();
//		
//		JButton btnNewButton = new JButton("Add User");
//		btnNewButton.setBackground(new Color(0x2dce98));
//		btnNewButton.setUI(new button_style());
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			String pin = String.valueOf(passwordField.getPassword());
//			String firstname = textField.getText();
//			String lastname = textField_2.getText();
//			String email = textField_1.getText();
//			String phone = textField_4.getText();
//
//			//int i = UserDao.save(name, password, email, address, city, contact);
//			int i = UserDao.save(pin,firstname,lastname,email,phone);
//			if(i > 0) {
//				JOptionPane.showMessageDialog(UserForm.this,"User added successfully!");
//				LibrarianSuccess.main(new String[]{});
//				frame.dispose();
//				
//			} else {
//				JOptionPane.showMessageDialog(UserForm.this,"Unable to save!");
//			}
//			}
//		});
//		btnNewButton.setForeground(Color.DARK_GRAY);
//		
//		JButton btnBack = new JButton("Back");
//		btnBack.setBackground(new Color(0x2dce98));
//		btnBack.setUI(new button_style());
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			LibrarianSuccess.main(new String[]{});
//			frame.dispose();
//			}
//		});
//		
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//			gl_contentPane.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(150)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
//						.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
//						.addComponent(lbfName)
//						.addComponent(lblName)
//						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
//						//.addComponent(lblAddress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//						//.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
//						.addComponent(lblContactNo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//					.addGap(58)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
//						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
//						//.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
//						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
//						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
//						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
//						.addComponent(passwordField))
//					.addContainerGap(107, Short.MAX_VALUE))
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addContainerGap(151, Short.MAX_VALUE)
//					.addComponent(lblAddLibrarian)
//					.addGap(300))
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addContainerGap(160, Short.MAX_VALUE)
//					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
//					.addGap(300))
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addContainerGap(200, Short.MAX_VALUE)
//					.addComponent(btnBack)
//					.addGap(330))
//		);
//		gl_contentPane.setVerticalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addComponent(lblAddLibrarian)
//					.addGap(18)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//							.addComponent(lbfName)
//							.addGap(18)
//							.addComponent(lblPassword))
//						.addGroup(gl_contentPane.createSequentialGroup()
//							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//							.addPreferredGap(ComponentPlacement.UNRELATED)
//							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
//					.addGap(18)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblEmail)
//						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(18)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblName)
//						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(18)
////					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
////						.addComponent(lblCity)
////						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(18)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblContactNo)
//						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(18)
//					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
//					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
//					.addComponent(btnBack,GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
//					.addGap(19))
//		);
//		contentPane.setLayout(gl_contentPane);
//	}
//}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UserForm extends JFrame {
	static UserForm frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	//private JTextField textField_2;
	//private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTextField textField_2;

	public static void main(String[] args, String logintype) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UserForm(logintype);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UserForm(String logintype) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 240, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddLibrarian = new JLabel("Add User");
		lblAddLibrarian.setForeground(Color.BLACK);
		lblAddLibrarian.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lbfName = new JLabel("FirstName:");
		JLabel lblName = new JLabel("LastName:");
		JLabel lblPassword = new JLabel("Pin:");
		JLabel lblEmail = new JLabel("Email:");
	
		JLabel lblContactNo = new JLabel("Contact No:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
//		
//		textField_3 = new JTextField();
//		textField_3.setColumns(10);
//		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.setBackground(new Color(0x2dce98));
		btnNewButton.setUI(new button_style());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String pin = String.valueOf(passwordField.getPassword());
			System.out.println("pin"+pin);
			String firstname = textField.getText();
			System.out.println("firstname"+firstname);
			String lastname = textField_2.getText();
			System.out.println("lastname"+lastname);
			String email = textField_1.getText();
			System.out.println("email"+email);
			String phone = textField_4.getText();
			System.out.println("phone"+phone);

			//int i = UserDao.save(name, password, email, address, city, contact);
			int i = UserDao.save(pin,firstname,lastname,email,phone,logintype);
			if(i > 0) {
				JOptionPane.showMessageDialog(UserForm.this,"User added successfully!");
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
				
			} else {
				JOptionPane.showMessageDialog(UserForm.this,"Unable to save!");
			}
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0x2dce98));
		btnBack.setUI(new button_style());
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LibrarianSuccess.main(new String[]{});
			frame.dispose();
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(150)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
						.addComponent(lbfName)
						.addComponent(lblName)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						//.addComponent(lblAddress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						//.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContactNo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						//.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(passwordField))
					.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(151, Short.MAX_VALUE)
					.addComponent(lblAddLibrarian)
					.addGap(300))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(160, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(300))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(200, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(330))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAddLibrarian)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lbfName)
							.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblName)))
							//.addComponent(lblPassword)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPassword)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblCity)
//						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContactNo)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addComponent(btnBack,GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

