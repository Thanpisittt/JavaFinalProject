package mystery_dish;
import java.util.*;
public class Getfood {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		randomfood food = new randomfood();
		String ans ="";
		int num;
		System.out.println("PRESS [1] Breakfast\nPRESS [2] Lunch\nPRESS [3] Dinner"  );
		System.out.print("What meal do you want to eat : "  );
		   num =scan.nextInt	();
		   System.out.println();
		 while(num < 1 || num > 3)
		   {
			   System.out.println("PRESS [1] Breakfast\nPRESS [2] Lunch\nPRESS [3] Dinner"  );
				System.out.print("What meal do you want to eat : "  );
				 num =scan.nextInt();
		   }
		 
		 System.out.print("Are you Muslims? y/n: ");
		   ans =scan.next();

			while(!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
				System.out.print("Are you Muslims? y/n: "  );
				 ans =scan.next();
			}
			
		 
		   
	      if(ans.equalsIgnoreCase("y")&&num == 1 ){
				System.out.println(food.getRandomFoodhalal_B());
			}
		  if(ans.equalsIgnoreCase("n")&&num == 1) {
		      System.out.println(food.getRandomFoodnonhalal_B());
			}
		  if(ans.equalsIgnoreCase("y")&&num == 2) {
		      System.out.println(food.getRandomFoodhalal_L());
			}
		  if(ans.equalsIgnoreCase("n")&&num == 2) {
		      System.out.println(food.getRandomFoodnonhalal_L());
			}
		  if(ans.equalsIgnoreCase("y")&&num == 3) {
		      System.out.println(food.getRandomFoodhalal_D());
			}
		  if(ans.equalsIgnoreCase("n")&&num == 3) {
		      System.out.println(food.getRandomFoodnonhalal_D());
			}
		

	}

}
