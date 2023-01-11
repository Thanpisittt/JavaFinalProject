import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        setBounds(100, 100, 450, 300);
        setTitle("What time is this?");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Which meal?");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblNewLabel.setBounds(108, 11, 246, 101);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Breakfast");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                thirdWindow frame = new thirdWindow();
                frame.setVisible(true);
            }
        });
btnNewButton.setBounds(37, 142, 101, 36);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Lunch");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                thirdWindow frame = new thirdWindow();
                frame.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(168, 142, 101, 36);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Dinner");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                forthWindow frame = new forthWindow();
                frame.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(297, 142, 101, 36);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Back");
        btnNewButton_3.setBounds(10, 227, 89, 23);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                indexWindow frame = new indexWindow();
                frame.setVisible(true);
            }
        });
        contentPane.add(btnNewButton_3);

    }
}
