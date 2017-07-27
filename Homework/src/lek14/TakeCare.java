package lek14;

import java.util.Arrays;
import java.util.List;

public class TakeCare {
	
	public static void main(String[] args) {
		
//		Pet pet = new Dog();
		Pet pet = new Dog();
		List<Pet> pets= Arrays.asList(new Pet[] {new Dog(), new Rat(), new Cat()});
		takeCare(pets);
		
	}

	private static void takeCare(List<Pet> pets) {
		for (Pet pet : pets) {
			System.out.println("=========" + pet.getClass().getSimpleName() + "=========");
			pet.play();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.play();
			System.out.println("---");
			pet.play();
		}
	}

}
