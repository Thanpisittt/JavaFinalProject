package mystery_dish;
import java.util.*;
public class Getfood {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		randomfood food = new randomfood();
		String ans ="";
		System.out.print("Are you Muslims? y/n: "  );
		   ans =scan.nextLine();
		  if(ans.equalsIgnoreCase("y") ){
				System.out.println(food.getRandomFoodhalal());
			}
		  else if(ans.equalsIgnoreCase("n")) {
		      System.out.println(food.getRandomFoodnonhalal());
			}

		while(!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
			System.out.print("Are you Muslims? y/n: "  );
			 ans =scan.nextLine();
			 
		}
		
	}

}
