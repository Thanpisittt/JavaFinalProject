import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class forthWindow extends JFrame {

	private JPanel contentPane;

			public void run() {
				try {
					forthWindow frame = new forthWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	public forthWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 460);
		setTitle("Halal?");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Yes = new JButton("Yes");
		Yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.halal=0;
				fifthWindow frame = new fifthWindow();
				frame.setVisible(true);
			}
		});
		Yes.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		Yes.setBounds(251, 208, 136, 44);
		contentPane.add(Yes);
		
		JButton No = new JButton("No");
		No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow.halal=1;
				fifthWindow frame = new fifthWindow();
				frame.setVisible(true);
			}
		});
		No.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));
		No.setBounds(251, 312, 136, 47);
		contentPane.add(No);
		
		JButton Back = new JButton("Back");
		Back.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indexWindow.meal == 2) {
					setVisible(false);
					secondWindow frame = new secondWindow();
					frame.setVisible(true);
				}
				else {
				setVisible(false);
				thirdWindow frame = new thirdWindow();
				frame.setVisible(true);
				}
			}
		});
		Back.setBounds(57, 377, 87, 33);
		contentPane.add(Back);
		JLabel Bg = new JLabel("");
		Bg.setIcon(new ImageIcon("C:\\Users\\555\\Desktop\\JFramePhoto\\Halal.png"));
		Bg.setFont(new Font("Tahoma", Font.BOLD, 11));
		Bg.setBounds(0, -11, 594, 432);
		contentPane.add(Bg);
	}

}
