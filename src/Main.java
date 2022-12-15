import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.imageio.ImageIO;

public class Main extends JFrame {
	static Main frame;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Main();
					frame.setVisible(true);
					frame.getContentPane().setBackground(new Color(204, 204, 204)); // set background color
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(440, 240, 720, 480);
		contentPane = new JPanel();
		setContentPane(contentPane);

		JLabel lblLibraryManagement = new JLabel("Library Management System");
		lblLibraryManagement.setFont(new Font("sansserif", Font.BOLD, 24));
		lblLibraryManagement.setForeground(Color.BLACK);

		JButton btnLibrarianLogin = new JButton("User Login");
		btnLibrarianLogin.setBackground(new Color(0x2dce98));
		btnLibrarianLogin.setUI(new button_style());
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin.main(new String[] {});
				frame.dispose();
			}
		});
		btnLibrarianLogin.setFont(new Font("sansserif", Font.PLAIN, 15));

		JButton btnUserLogin = new JButton("Librarian Login");
		btnUserLogin.setBackground(new Color(0x2dce98));
		btnUserLogin.setUI(new button_style());
		btnUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLogin.main(new String[] {});
			}
		});
		btnUserLogin.setFont(new Font("sansserif", Font.PLAIN, 15));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.CENTER).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.CENTER)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(150).addComponent(lblLibraryManagement))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(150)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.CENTER)
										.addComponent(btnUserLogin, Alignment.CENTER, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnLibrarianLogin, Alignment.CENTER, GroupLayout.DEFAULT_SIZE, 50,
												Short.MAX_VALUE))))
				.addContainerGap(95, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.CENTER)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblLibraryManagement)
						.addGap(32)
						.addComponent(btnLibrarianLogin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnUserLogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(70, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
