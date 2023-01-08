package mystery_dish;
import java.util.Random;
public class randomfood {

	 private  String[] foodItemsnonhalal_B = {"โจ๊กหมู", "ข้าวต้มไก่", "หมูปิ้ง", "ปลาท่องโก๋น้ำเต้าหู้", "ขนมปังแฮมชีส","แซนวิชหมูหยอง"};//มื้อเช้าแบบปกติ
	 private  String[] foodItemsnonhalal_L = {"กะเพราหมูชิ้น", "กะเพราไก่", "หมูกระเทียม", "ข้าวไข่เจียว", "กะเพราหมูกรอบ","สเต็กporkchop"};//มื้อเที่ยงแบบปกติ
	 private  String[] foodItemsnonhalal_D = {"แกงจืดไข่น้ำ", "กะเพราหมูสับไข่ดาว", "หมูกระเทียม", "ข้าวไข่เจียวทรงเครื่อง", "น้ำตกคอหมูย่าง","หมูพริกแกง"};//มื้อเย็นแบบปกติ
	 private  String[] foodItemshalal_B = {"โจ๊กไก่", "ข้าวต้มปลา", "ปลาท่องโก๋น้ำเต้าหู้", "ข้าวไข่เจียว", "ไก่ฝอยข้าวเหนียว","ไข่ตุ๋นเนื้อเปื่อย"};//มื้อเช้าแบบฮาลาล
	 private  String[] foodItemshalal_L = {"ไก่กระเทียม", "กะเพราไก่", "ก๋วยเตี๋ยวไก่", "ข้าวไข่เจียว", "แกงกะหรี่ไก่ทอด","สุกี้ไก่น้ำ","มัสมันไก่","ข้าวมันไก่"};//มื้อเที่ยงแบบฮาลาล
	 private  String[] foodItemshalal_D = {"ไก่ผัดขิง", "แกงเขียวหวานไก่", "ต้มยำไก่ ไข่เจียว", "ไก่ทอดกระเทียม", "แกงกะหรี่ไก่ทอด",};//มื้อเย็นแบบฮาลาล
	 public  String getRandomFoodnonhalal_B() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemsnonhalal_B.length);
		    return foodItemsnonhalal_B[index];
		  }
	 public  String getRandomFoodnonhalal_L() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemsnonhalal_L.length);
		    return foodItemsnonhalal_L[index];
		  }
	 public  String getRandomFoodnonhalal_D() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemsnonhalal_D.length);
		    return foodItemsnonhalal_D[index];
		  }
	 public  String getRandomFoodhalal_B() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemshalal_B.length);
		    return foodItemshalal_B[index];
		  }
	 public  String getRandomFoodhalal_L() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemshalal_L.length);
		    return foodItemshalal_L[index];
		  }
	 public  String getRandomFoodhalal_D() {
		    Random random = new Random();
		    int index = random.nextInt(foodItemshalal_D.length);
		    return foodItemshalal_D[index];
		  }
}

