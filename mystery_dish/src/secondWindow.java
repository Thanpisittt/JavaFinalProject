import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
public class secondWindow extends JFrame {
	private JPanel contentPane;
	
		public void run() {
			try {
				secondWindow frame = new secondWindow();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	public secondWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 460);
		setTitle("Meal Select");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Which meal?");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("MV Boli", Font.PLAIN, 40));
		lblNewLabel.setBounds(185, 158, 247, 101);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Breakfast");
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.meal = 0;
				thirdWindow frame = new thirdWindow();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(41, 222, 101, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lunch");
		btnNewButton_1.setBackground(new Color(255, 215, 0));
		btnNewButton_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.meal = 1;
				thirdWindow frame = new thirdWindow();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(260, 91, 101, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Dinner");
		btnNewButton_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.meal = 2;
				forthWindow frame = new forthWindow();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(449, 222, 101, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		btnNewButton_3.setBounds(41, 381, 101, 29);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow frame = new indexWindow();				
				frame.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_3);
		
		JLabel Bg = new JLabel("");
		Bg.setIcon(new ImageIcon("C:\\Users\\555\\Desktop\\JFramePhoto\\MealTime.png"));
		Bg.setBounds(0, -11, 594, 432);
		contentPane.add(Bg);
	
	}
}
