import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mj1 extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mj1 frame = new mj1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mj1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setBounds(283, 218, 272, 27);
		contentPane.add(user);
		user.setColumns(10);
		user.setBorder(null);
		
		pass = new JPasswordField();
		pass.setBounds(283, 293, 272, 27);
		pass.setBorder(null);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\sss.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(user.getText().equals("Admin") && (pass.getText().equals("123"))) {
					
					JOptionPane.showMessageDialog(btnNewButton, "Ready To Okkk");
					
					disco obj=new disco();
					
					obj.setVisible(true);
					
				}
				else {
					
					JOptionPane.showMessageDialog(btnNewButton, "Not Ready To Okkk");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(345, 369, 107, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\op.jpg"));
		lblNewLabel.setBounds(-434, -34, 1391, 507);
		contentPane.add(lblNewLabel);
	}
}
