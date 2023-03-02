import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class thirdWindow extends JFrame {

	private JPanel contentPane;
	
			public void run() {
				try {
					thirdWindow frame = new thirdWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	public thirdWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 460);
		setTitle("Preference");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JButton Nm = new JButton("Normal");
		Nm.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		Nm.setBounds(229, 142, 184, 43);
		Nm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.nutri=0;
				forthWindow frame = new forthWindow();
				frame.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(Nm);
		
		JButton Carb = new JButton("Carb Rich");
		Carb.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		Carb.setBounds(229, 322, 184, 43);
		Carb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.nutri=1;
				forthWindow frame = new forthWindow();
				frame.setVisible(true);
			}
		});
		contentPane.add(Carb);
		
		JButton Pro = new JButton("Protein Rich");
		Pro.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		Pro.setBounds(229, 232, 184, 43);
		Pro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.nutri=2;
				forthWindow frame = new forthWindow();
				frame.setVisible(true);
			}
		});
		contentPane.add(Pro);
		
		JButton Back = new JButton("Back");
		Back.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		Back.setBounds(36, 377, 92, 28);
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				secondWindow frame = new secondWindow();			
				frame.setVisible(true);
			}
		});
		contentPane.add(Back);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src\\JFramePhoto\\Nutri.png"));
		lblNewLabel_1.setBounds(0, -30, 594, 451);
		contentPane.add(lblNewLabel_1);
	}
}
