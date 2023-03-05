package DesignPrinciple;

public class DryPrinciple {
	
	public void washWhiteClothes() {
		performCommonTasks(); // Calling method to perform common tasks
		System.out.println("Putting in white clothes");
	}
	
	public void washingColorfulClothes() {
		
		performCommonTasks(); // Calling method to perform common task
		System.out.println("Putting in colorful clothes");
	}
	
	public void performCommonTasks() { // All common tasks kept inside this method to follow DRY principle.
		
		System.out.println("Filling water to washing machine"); // Common tasks taken and combined into one.
		System.out.println("settings configuration");
		System.out.println("Draining Water"); // Draining water
	}

	public static void main(String[] args) {
		
		DryPrinciple laun = new DryPrinciple();
		laun.performCommonTasks();
		laun.washWhiteClothes();
		laun.washingColorfulClothes();

	}

}
