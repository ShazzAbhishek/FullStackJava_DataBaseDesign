//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.LayoutStyle.ComponentPlacement;
//
//public class IssueBookForm extends JFrame {
//	static IssueBookForm frame;
//	private JPanel contentPane;
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private JTextField textField_3;
//	private JTextField textField_4;
//
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new IssueBookForm();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	public IssueBookForm() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(440, 240, 720, 480);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		
//		JLabel lblNewLabel = new JLabel("Issue Book");
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
//		lblNewLabel.setForeground(Color.BLACK);
//		
//		JLabel emailid = new JLabel("Email ID:");
//		
//	
//		
//		textField_1 = new JTextField();
//		textField_1.setColumns(10);
//		
//		textField_2 = new JTextField();
//		textField_2.setColumns(10);
//		
////		textField_3 = new JTextField();
////		textField_3.setColumns(10);
////		
////		textField_4 = new JTextField();
////		textField_4.setColumns(10);
//		
//		JLabel bookid = new JLabel("BookId:");
//		
////		JLabel lblStudentContact = new JLabel("User Contact:");
////		
//		JButton btnIssueBook = new JButton("Issue Book");
//		btnIssueBook.setBackground(new Color(0x2dce98));
//		btnIssueBook.setUI(new button_style());
//		btnIssueBook.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			String emailid = textField_1.getText();
//			String id = textField_2.getText();
//			int bookid = Integer.parseInt(textField_2.getText());
//		
////			String usercontact = textField_4.getText();
////			
//			if(IssueBookDao.checkBook(emailid,bookid)) {
//				System.out.println("inside IssueBookForm checkBook!!");
//				int i = IssueBookDao.save(emailid,bookid);
//				if(i > 0) {
//					JOptionPane.showMessageDialog(IssueBookForm.this,"Book issued successfully!");
//					LibrarianSuccess.main(new String[]{});
//					frame.dispose();
//				} else {
//					JOptionPane.showMessageDialog(IssueBookForm.this,"Unable to issue!");
//				}
//			} else {
//				JOptionPane.showMessageDialog(IssueBookForm.this,"BookID doesn't exist!");
//			}
//			}
//		});
//		
//		JButton btnBack = new JButton("Back");
//		btnBack.setBackground(new Color(0x2dce98));
//		btnBack.setUI(new button_style());
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LibrarianSuccess.main(new String[]{});
//				frame.dispose();
//			}
//		});
//		
//		JLabel lblNewLabel_1 = new JLabel("Note: Please check user ID carefully before issuing book!");
//		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewLabel_1.setForeground(Color.RED);
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//			gl_contentPane.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addContainerGap(10, Short.MAX_VALUE)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//								.addComponent(emailid,GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
//								.addComponent(bookid,GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
////								.addComponent(lblStudentName, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
////								.addComponent(lblStudentContact, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
//							.addGap(10)
//							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
//								.addGap(10)
//								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
////								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
////								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
//							.addGap(100))
//						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
//							.addGap(20)
//							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
//								.addComponent(lblNewLabel_1)
//								.addGroup(gl_contentPane.createSequentialGroup()
//									.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//									.addGap(300)
//									.addComponent(btnBack)))
//							.addGap(100))))
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(300)
//					.addComponent(lblNewLabel)
//					.addContainerGap(235, Short.MAX_VALUE))
//		)));
//		gl_contentPane.setVerticalGroup(
//			gl_contentPane.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(37)
//					.addComponent(lblNewLabel)
//					.addGap(43)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(emailid)
//						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(28)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(bookid)
//						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(28)
////					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
////						.addComponent(lblStudentName)
////						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
////					.addGap(26)
////					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
////						.addComponent(lblStudentContact)
////						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
//						.addComponent(btnBack,GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
//					.addGap(18)
//					.addComponent(lblNewLabel_1)
//					.addGap(25))
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

public class IssueBookForm extends JFrame {
	static IssueBookForm frame;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new IssueBookForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public IssueBookForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 240, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Issue Book");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		
		JLabel emailid = new JLabel("Email ID:");
		
	
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
//		textField_3 = new JTextField();
//		textField_3.setColumns(10);
//		
//		textField_4 = new JTextField();
//		textField_4.setColumns(10);
		
		JLabel bookid = new JLabel("BookId:");
		
//		JLabel lblStudentContact = new JLabel("User Contact:");
//		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setBackground(new Color(0x2dce98));
		btnIssueBook.setUI(new button_style());
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String emailid = textField_1.getText();
			String id = textField_2.getText();
			int bookid = Integer.parseInt(textField_2.getText());
		
//			String usercontact = textField_4.getText();
//			
			if(IssueBookDao.checkBook(emailid,bookid)) {
				System.out.println("inside IssueBookForm checkBook!!");
				int i = IssueBookDao.save(emailid,bookid);
				if(i > 0) {
					JOptionPane.showMessageDialog(IssueBookForm.this,"Book issued successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(IssueBookForm.this,"Unable to issue!");
				}
			} else {
				JOptionPane.showMessageDialog(IssueBookForm.this,"BookID doesn't exist!");
			}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0x2dce98));
		btnBack.setUI(new button_style());
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Note: Please check user ID carefully before issuing book!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.RED);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(10, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(emailid,Alignment.LEADING,GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(bookid,Alignment.LEADING,GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
//								.addComponent(lblStudentName, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
//								.addComponent(lblStudentContact, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_2,Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addGap(10)
								.addComponent(textField_1,Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
//								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
//								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGap(100))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(300)
									.addComponent(btnBack)))
							.addGap(100))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(300)
					.addComponent(lblNewLabel)
					.addContainerGap(235, Short.MAX_VALUE))
		)));
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.BASELINE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(emailid,Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1,Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(bookid, Alignment.LEADING,GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2,Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblStudentName)
//						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addGap(26)
//					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblStudentContact)
//						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack,GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(25))
		);
		contentPane.setLayout(gl_contentPane);
	}
}



