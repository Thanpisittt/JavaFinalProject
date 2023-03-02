import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class indexWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static int nutri;
	public static int meal;
	public static int halal;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					indexWindow frame = new indexWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public indexWindow() {
		setBackground(new Color(248, 248, 255));
		setTitle("Mystery Meal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Random Meal");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Minion Pro", Font.BOLD, 26));
		btnNewButton.setBounds(175, 308, 235, 51);
		btnNewButton.setFocusPainted(false);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				secondWindow frame = new secondWindow();
				frame.setVisible(true);
			}
		});
		
		JLabel Bg = new JLabel("");
		Bg.setIcon(new ImageIcon("src\\JFramePhoto\\Mfood.png"));
		Bg.setBounds(-12, -326, 2002, 1080);
		contentPane.add(Bg);
		
	}
}
