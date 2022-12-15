import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LibrarianSuccess extends JFrame {
	static LibrarianSuccess frame;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianSuccess();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LibrarianSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 240, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminSection = new JLabel("User Section");
		lblAdminSection.setFont(new Font("sansserif", Font.BOLD, 22));
		lblAdminSection.setForeground(Color.BLACK);
		
//		JButton btnNewButton = new JButton("Add User");
//		btnNewButton.setBackground(new Color(0x2dce98));
//		btnNewButton.setUI(new button_style());
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			UserForm.main(new String[]{});
//			frame.dispose();
//			}
//		});
//		
//		JButton btnViewLibrarian = new JButton("View User");
//		btnViewLibrarian.setBackground(new Color(0x2dce98));
//		btnViewLibrarian.setUI(new button_style());
//		btnViewLibrarian.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			ViewUser.main(new String[]{});
//			}
//		});
//		btnViewLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		
//		JButton btnDeleteLibrarian = new JButton("Delete User");
//		btnDeleteLibrarian.setBackground(new Color(0x2dce98));
//		btnDeleteLibrarian.setUI(new button_style());
//		btnDeleteLibrarian.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			DeleteUser.main(new String[]{});
//			frame.dispose();
//			}
//		});
//		
//		btnDeleteLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.setBackground(new Color(0x2dce98));
		btnViewBooks.setUI(new button_style());
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ViewBooks.main(new String[]{});
			frame.dispose();
			}
		});
		
		btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		

		JButton btnIssueBook = new JButton("Issue Books");
		btnIssueBook.setBackground(new Color(0x2dce98));
		btnIssueBook.setUI(new button_style());
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		
		JButton btnReturnBook = new JButton("Return Books");
		btnReturnBook.setBackground(new Color(0x2dce98));
		btnReturnBook.setUI(new button_style());
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook.main(new String[]{});
				frame.dispose();
			}
		});
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(0x2dce98));
		btnLogout.setUI(new button_style());
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(150, Short.MAX_VALUE)
					.addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(250))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(250)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(109, Short.MAX_VALUE))
//						.addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
//						.addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
//						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
//					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
//					.addGap(18)
//					.addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
//					.addGap(18)
//					.addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
//					.addGap(18)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
