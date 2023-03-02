import java.util.Random;

public class random {
	private  String[] foodItems_nonhalal_B = {"โจ๊กหมู", "ข้าวต้มไก่", "หมูปิ้ง", "ปลาท่องโก๋น้ำเต้าหู้", "ขนมปังแฮมชีส","แซนวิชหมูหยอง"};//มื้อเช้าแบบปกติ
	 private  String[] foodItems_nonhalal_B_Protein = {"โจ๊กหมู", "ข้าวต้มอกไก่", "หมูปิ้งไร้มัน", "ปลาท่องโก๋ นมจืด1แก้ว", "ขนมปังอกไข่พริกไทยดำ","แซนวิชหมูหยอง นมจืด1แก้ว"};//มื้อเช้าแบบโปรตีน
	 private  String[] foodItems_nonhalal_B_Crab = {"โจ๊กปลาท่องโก๋", "ข้าวต้มจับฉ่าย", "แซนวิชโฮลวีทแฮม", "ปลาท่องโก๋น้ำเต้าหู้","แซนวิชโฮลวีทหมูหยอง","สลัดอโวคาโด้อกไก่"};//มื้อเช้าแบบคาร์บ
	 private  String[] foodItems_nonhalal_L = {"กะเพราหมูชิ้น", "กะเพราไก่", "หมูกระเทียม", "ข้าวไข่เจียว", "กะเพราหมูกรอบ","สเต็กporkchop"};//มื้อเที่ยงแบบปกติ
	 private  String[] foodItems_nonhalal_L_Protein = {"กะเพราหมูชิ้นไข่ดาว น้ำเต้าหู้", "กะเพราไก่ไขดาว น้ำเต้าหู้", "หมูกระเทียม ไข่ดาว", "ข้าวไข่เจียวอกไก่ทรงเครื่อง", "กะเพราหมูกรอบไข่ดาว","สเต็กporkchop avocado salad"};//มื้อเที่ยงแบบปกติ
	 private  String[] foodItems_nonhalal_L_Carb = {"กะเพราหมูชิ้นข้าวกล้อง", "กะเพราไก่กรอบ", "หมูกระเทียมข้าวกล้อง", "ข้าวกล้องไข่เจียว", "กะเพราหมูกรอบข้าวกล้อง","สเต็กporkchop มันบด"};//มื้อเที่ยงแบบปกติ
	 private  String[] foodItems_nonhalal_D = {"แกงจืดไข่น้ำ", "กะเพราหมูสับไข่ดาว", "หมูกระเทียม", "ข้าวไข่เจียวทรงเครื่อง", "น้ำตกคอหมูย่าง","หมูพริกแกง"};//มื้อเย็นแบบปกติ
	 private  String[] foodItems_halal_B = {"โจ๊กไก่", "ข้าวต้มปลา", "ปลาท่องโก๋น้ำเต้าหู้", "ข้าวไข่เจียว", "ไก่ฝอยข้าวเหนียว","ไข่ตุ๋นเนื้อเปื่อย"};//มื้อเช้าแบบฮาลาล
	 private  String[] foodItems_halal_B_Protein = {"โจ๊กอกไก่", "ข้าวต้มปลา",  "ข้าวไข่เจียวอกไก่ทรงเครื่อง", "ไก่หยองข้าวเหนียว"};//มื้อเช้าฮาลาโปรตีนแน่นๆ
	 private  String[] foodItems_halal_B_Carb = {"โจ๊กไก่", "ข้าวต้มปลา", "ปลาท่องโก๋น้ำเต้าหู้", "ข้าวไข่เจียว", "ไก่ฝอยข้าวเหนียว","ไข่ตุ๋นเนื้อเปื่อย"};//มื้อเช้าฮาลาลแป้งเบิ้มๆ
	 private  String[] foodItems_halal_L = {"ไก่กระเทียม", "กะเพราไก่", "ก๋วยเตี๋ยวไก่", "ข้าวไข่เจียว", "แกงกะหรี่ไก่ทอด","สุกี้ไก่น้ำ","มัสมันไก่","ข้าวมันไก่"};//มื้อเที่ยงแบบฮาลาล
	 private  String[] foodItems_halal_L_Protein = {"อกไก่กระเทียม", "กะเพราอกไก่ นมจืด", "ก๋วยเตี๋ยวไก่ เอาแต่อก", "แกงกะหรี่ไก่ทอด","มัสมันอกไก่","ข้าวมันไก่ต้มไม่หนัง"};//มื้อเที่ยงฮาลาลโปรตีนแน่นๆ
	 private  String[] foodItems_halal_L_Carb = {"ไก่กระเทียม", "ก๋วยเตี๋ยวไก่เส้นบะหมี่",  "แกงกะหรี่ไก่ทอด","สุกี้ไก่น้ำเพิ่มวุ้นเส้น","มัสมันไก่มันฝรั่ง","ข้าวมันไก่ทอด"};//มื้อเที่ยงฮาลาลแป้งเบิ้มๆ
	 private  String[] foodItems_halal_D = {"ไก่ผัดขิง", "แกงเขียวหวานไก่", "ต้มยำไก่ ไข่เจียว", "ไก่ทอดกระเทียม", "แกงกะหรี่ไก่ทอด",};//มื้อเย็นแบบฮาลาล
	 Random random = new Random();
	
	 public  String getRandomFoodnonhalal_B() {                                                     
		    Random random = new Random();
		    int index = random.nextInt(foodItems_nonhalal_B.length);
		    return foodItems_nonhalal_B[index];
		  }
	 public  String getRandomFoodnonhalal_B_Protein() {                                                     
		    Random random = new Random();
		    int index = random.nextInt(foodItems_nonhalal_B_Protein.length);
		    return foodItems_nonhalal_B_Protein[index];
		  }
	 public  String getRandomFoodnonhalal_B_Carb() {                                                    
		    Random random = new Random();
		    int index = random.nextInt(foodItems_nonhalal_B_Crab.length);
		    return foodItems_nonhalal_B_Crab[index];
		  }
	 
	 ///////////////
	 public  String getRandomFoodnonhalal_L() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_nonhalal_L.length);
		    return foodItems_nonhalal_L[index];
		  }
	 public  String getRandomFoodnonhalal_L_Protein() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_nonhalal_L_Protein.length);
		    return foodItems_nonhalal_L_Protein[index];
		  }
	 public  String getRandomFoodnonhalal_L_Carb() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_nonhalal_L_Carb.length);
		    return foodItems_nonhalal_L_Carb[index];
		  }
	 
	 ////////////////
	 public  String getRandomFoodnonhalal_D() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_nonhalal_D.length);
		    return foodItems_nonhalal_D[index];
		  }
	 
	 ///////////////
	 public  String getRandomFoodhalal_B() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_halal_B.length);
		    return foodItems_halal_B[index];
		  }
	 public  String getRandomFoodhalal_B_Protein() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_halal_B_Protein.length);
		    return foodItems_halal_B_Protein[index];
		  }
	 public  String getRandomFoodhalal_B_Carb() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_halal_B_Carb.length);
		    return foodItems_halal_B_Carb[index];
		  }
	 
	 ////////////////
	 public  String getRandomFoodhalal_L() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_halal_L.length);
		    return foodItems_halal_L[index];
		  }
	 public  String getRandomFoodhalal_L_Protein() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_halal_L_Protein.length);
		    return foodItems_halal_L_Protein[index];
		  }
	 public  String getRandomFoodhalal_L_Carb() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_halal_L_Carb.length);
		    return foodItems_halal_L_Carb[index];
		  }
	 
	 //////////
	 public  String getRandomFoodhalal_D() {
		    Random random = new Random();
		    int index = random.nextInt(foodItems_halal_D.length);
		    return foodItems_halal_D[index];
		  }
}
