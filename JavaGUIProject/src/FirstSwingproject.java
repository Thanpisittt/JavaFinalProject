import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class FirstSwingproject extends JFrame {

	private JPanel contentPane;
	private JLabel Title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstSwingproject frame = new FirstSwingproject();
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
	public FirstSwingproject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 128));
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Title = new JLabel("Mystery Dish");
		Title.setFont(new Font("UD Digi Kyokasho NP-B", Font.PLAIN, 65));
		Title.setBounds(117, 11, 500, 94);
		contentPane.add(Title);
		
		JButton RandomButton = new JButton("What do i eat?");
		RandomButton.setFont(new Font("UD Digi Kyokasho NP-B", Font.PLAIN, 28));
		RandomButton.setBounds(197, 218, 304, 64);
		contentPane.add(RandomButton);
	}
}
