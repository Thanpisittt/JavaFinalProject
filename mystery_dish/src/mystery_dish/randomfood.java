package mystery_dish;
import java.util.Random;
public class randomfood {

	 private  String[] foodItemsnonhalal = {"กะเพราหมู", "กะเพราไก่", "หมูกระเทียม", "ข้าวไข่เจียว", "กะเพราหมูกรอบ",""};
	 private  String[] foodItemshalal = {"ไก่กระเทียม", "กะเพราไก่", "ก๋วยเตี๋ยวไก่", "ข้าวไข่เจียว", "แกงกะหรี่ไก่ทอด","สุกี้ไก่น้ำ","มัสมันไก่"};
	 public  String getRandomFoodnonhalal() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemsnonhalal.length);
		    return foodItemsnonhalal[index];
		  }
	 public  String getRandomFoodhalal() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemshalal.length);
		    return foodItemshalal[index];
		  }
}

