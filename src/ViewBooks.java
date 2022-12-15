import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewBooks extends JFrame {
	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBooks frame = new ViewBooks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewBooks() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(440, 240, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String data[][] = null;
		String column[] = null;
		try {
			Connection conn = Database.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from book", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			column = new String[cols];
			for(int i=1; i<=cols; i++)
				column[i-1]=rsmd.getColumnName(i);
			
			rs.last();
			int rows = rs.getRow();
			rs.beforeFirst();

			data = new String[rows][cols];
			int count = 0;
			while(rs.next()) {
				for(int i=1; i<=cols; i++)
					data[count][i-1]=rs.getString(i);
				count++;
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		table = new JTable(data,column);
		JScrollPane sp = new JScrollPane(table);
		
		contentPane.add(sp, BorderLayout.CENTER);
	}
}
