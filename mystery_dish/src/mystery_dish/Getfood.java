package mystery_dish;
import java.util.*;
public class Getfood {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		randomfood food = new randomfood();
		String ans ="";
		int nummeal,numnutrition =0;
		System.out.println("PRESS [1] Breakfast\nPRESS [2] Lunch\nPRESS [3] Dinner"  );
		System.out.print("What meal do you want to eat : "  );
		nummeal =scan.nextInt	();
		   System.out.println();
		   while(nummeal < 1 || nummeal > 3)
		   {
			   System.out.println("PRESS [1] Breakfast\nPRESS [2] Lunch\nPRESS [3] Dinner"  );
				System.out.print("What meal do you want to eat : "  );
				nummeal =scan.nextInt();
		   }
		   //meal check
		   if(nummeal == 1 || nummeal == 2) {
		   System.out.println("PRESS [0] Normal nutrition\nPRESS [1] Protein Rich \nPRESS [2] Carb Rich"  );
			System.out.print("What nutrition do you want to eat : "  );
			numnutrition =scan.nextInt	();
			   System.out.println();
			   while(numnutrition < 0 || numnutrition > 3)
			   {
				   System.out.println("PRESS [1] Protein Rich \nPRESS [2] Carb Rich\nPRESS [3] Normal nutrition"  );
					System.out.print("What nutrition do you want to eat : "  );
					numnutrition =scan.nextInt	();
			   }
			   //nutrition check
		   }
		 
		 System.out.print("Are you Muslims? y/n: ");
		   ans =scan.next();

			while(!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
				System.out.print("Are you Muslims? y/n: "  );
				 ans =scan.next();
			}
			//halal check
		 
		   
	      if(ans.equalsIgnoreCase("y")&&nummeal == 1 && numnutrition == 0){
				System.out.println(food.getRandomFoodhalal_B());
			}
	      if(ans.equalsIgnoreCase("y")&&nummeal == 1 && numnutrition == 1 ){
				System.out.println(food.getRandomFoodhalal_B_Protein());
			}
	      if(ans.equalsIgnoreCase("y")&&nummeal == 1 && numnutrition == 2 ){
				System.out.println(food.getRandomFoodhalal_B_Carb());
			}
	      ////////check halal_B
	      
		  if(ans.equalsIgnoreCase("n")&&nummeal == 1&& numnutrition == 0) {
		      System.out.println(food.getRandomFoodnonhalal_B());
			}
		  if(ans.equalsIgnoreCase("n")&&nummeal == 1&& numnutrition == 1) {
		      System.out.println(food.getRandomFoodnonhalal_B_Protein());
			}
		  if(ans.equalsIgnoreCase("n")&&nummeal == 1&& numnutrition == 2) {
		      System.out.println(food.getRandomFoodnonhalal_B_Carb());
			}
		  ///////check nonhalal_B
		  
		  if(ans.equalsIgnoreCase("y")&&nummeal == 2 && numnutrition == 0) {
		      System.out.println(food.getRandomFoodhalal_L());
			}
		  if(ans.equalsIgnoreCase("y")&&nummeal == 2 && numnutrition == 1) {
		      System.out.println(food.getRandomFoodhalal_L_Protein());
			}
		  if(ans.equalsIgnoreCase("y")&&nummeal == 2 && numnutrition == 2) {
		      System.out.println(food.getRandomFoodhalal_L_Carb());
			}
		  ///////check halal_L
		  
		  if(ans.equalsIgnoreCase("n")&&nummeal == 2 && numnutrition == 0) {
		      System.out.println(food.getRandomFoodnonhalal_L());
			}
		  if(ans.equalsIgnoreCase("n")&&nummeal == 2 && numnutrition == 1) {
		      System.out.println(food.getRandomFoodnonhalal_L_Protein());
			}
		  if(ans.equalsIgnoreCase("n")&&nummeal == 2 && numnutrition == 2) {
		      System.out.println(food.getRandomFoodnonhalal_L_Carb());
			}
		  ///////check nonhalal_L
		  
		  if(ans.equalsIgnoreCase("y")&&nummeal == 3) {
		      System.out.println(food.getRandomFoodhalal_D());
			}
		  if(ans.equalsIgnoreCase("n")&&nummeal == 3) {
		      System.out.println(food.getRandomFoodnonhalal_D());
			}
		

	}

}
