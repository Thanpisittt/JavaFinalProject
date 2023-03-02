import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class fifthWindow extends JFrame {
	 random rd = new random();
	 String result = "src\\Food\\";
	 String food = "";
	private JPanel contentPane;
	
			public void run() {
				try {
					fifthWindow frame = new fifthWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	public fifthWindow() {
		setTitle("Food");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Menu = new JButton("Menu");
		Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indexWindow frame = new indexWindow();
				frame.setVisible(true);
			}
		});
			
		Menu.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		Menu.setBounds(498, 382, 93, 34);
		contentPane.add(Menu);
		
		JLabel Food = new JLabel("");
		Food.setForeground(new Color(255, 255, 255));
		Food.setBounds(10, 274, 298, 68);
		Food.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Food.setHorizontalAlignment(JLabel.CENTER);
		Food.setVerticalAlignment(JLabel.CENTER);
		contentPane.add(Food);
		
		JLabel Carb = new JLabel("");
		Carb.setForeground(new Color(255, 255, 255));
		Carb.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Carb.setBounds(482, 146, 109, 31);
		contentPane.add(Carb);
		
		JLabel Pro = new JLabel("");
		Pro.setForeground(new Color(255, 255, 255));
		Pro.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Pro.setBounds(482, 211, 109, 34);
		contentPane.add(Pro);
		
		JLabel FoodIm = new JLabel("");
		FoodIm.setIcon(null);
		FoodIm.setBounds(46, 66, 219, 197);
		contentPane.add(FoodIm);
		
		JLabel Bg = new JLabel("");
		Bg.setIcon(new ImageIcon("src\\JFramePhoto\\Result.png"));
		Bg.setBounds(0, 0, 595, 422);
		contentPane.add(Bg);
		
		if(indexWindow.meal==0&&indexWindow.nutri==0&&indexWindow.halal==1) {
			food=rd.getRandomFoodnonhalal_B();
			Food.setText(food);
			Carb.setText("กลาง");
			Pro.setText("กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);

		}
		else if (indexWindow.meal==0&&indexWindow.nutri==2&&indexWindow.halal==1) {
			food=rd.getRandomFoodnonhalal_B_Protein();
			Food.setText(food);
			Carb.setText("ต่ำ-กลาง");
			Pro.setText("สูง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);

		}
		else if (indexWindow.meal==0&&indexWindow.nutri==1&&indexWindow.halal==1) {
			food=rd.getRandomFoodnonhalal_B_Carb();
			Food.setText(food);
			Carb.setText("สูง");
			Pro.setText("ต่ำ-กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);

		}
		else if (indexWindow.meal==1&&indexWindow.nutri==0&&indexWindow.halal==1) {
			food=rd.getRandomFoodnonhalal_L();
			Food.setText(food);
			Carb.setText("กลาง");
			Pro.setText("กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==1&&indexWindow.nutri==2&&indexWindow.halal==1) {
			food=rd.getRandomFoodnonhalal_L_Protein();
			Food.setText(food);
			Carb.setText("ต่ำ-กลาง");
			Pro.setText("สูง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==1&&indexWindow.nutri==1&&indexWindow.halal==1) {
			food=rd.getRandomFoodnonhalal_L_Carb();
			Food.setText(food);
			Carb.setText("สูง");
			Pro.setText("ต่ำ-กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==2&&indexWindow.halal==1) {
			food=rd.getRandomFoodnonhalal_D();
			Food.setText(food);
			Carb.setText("กลาง");
			Pro.setText("กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==0&&indexWindow.nutri==0&&indexWindow.halal==0) {
			food=rd.getRandomFoodhalal_B();
			Food.setText(rd.getRandomFoodhalal_B());
			Carb.setText("กลาง");
			Pro.setText("กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==0&&indexWindow.nutri==2&&indexWindow.halal==0) {
			food=rd.getRandomFoodhalal_B_Protein();
			Food.setText(food);
			Carb.setText("ต่ำ-กลาง");
			Pro.setText("สูง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==0&&indexWindow.nutri==1&&indexWindow.halal==0) {
			food=rd.getRandomFoodhalal_B_Carb();
			Food.setText(food);
			Carb.setText("สูง");
			Pro.setText("ต่ำ-กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==1&&indexWindow.nutri==0&&indexWindow.halal==0) {
			food=rd.getRandomFoodhalal_L();
			Food.setText(food);
			Carb.setText("กลาง");
			Pro.setText("กลาง");			
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==1&&indexWindow.nutri==2&&indexWindow.halal==0) {
			food=rd.getRandomFoodhalal_L_Protein();
			Food.setText(food);
			Carb.setText("ต่ำ-กลาง");
			Pro.setText("สูง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==1&&indexWindow.nutri==1&&indexWindow.halal==0) {
			food=rd.getRandomFoodhalal_L_Carb();
			Food.setText(food);
			Carb.setText("สูง");
			Pro.setText("ต่ำ-กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
		else if (indexWindow.meal==2&&indexWindow.halal==0) {
			food=rd.getRandomFoodhalal_D();
			Food.setText(food);
			Carb.setText("กลาง");
			Pro.setText("กลาง");
			result = result+food+".png";
		    ImageIcon foodIcon = new ImageIcon(result);
		    Image foodImage = foodIcon.getImage().getScaledInstance(219, 197, Image.SCALE_SMOOTH);
		    ImageIcon resizedFoodIcon = new ImageIcon(foodImage);
		    FoodIm.setIcon(resizedFoodIcon);
		}
	} 
}
