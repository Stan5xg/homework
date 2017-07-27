package lek14;

public class Cat implements Pet{

	private interface CatBrain extends Brain, Pet {}
	
	private class Hungry implements CatBrain {
		
		@Override
		public void feed() {
			meow();
			look();
			eat();
			purr();
			brain = new Fed();
		}
		
		
		@Override
		public void play() {
			look();
			meow();
			meow();
		}
		
	}
	private class Fed implements CatBrain {
		
		@Override
		public void feed() {
			ignore();
			sleep();
		}
		
		
		@Override
		public void play() {
			chaseLaser();
			jump();
			scratch();
			brain = new Hungry();
		}
		
	}
	

	CatBrain brain = new Hungry();


	@Override
	public void feed() {
		brain.feed();		
	}

	@Override
	public void play() {
		brain.play();		
	}

	public void sleep() {
		System.out.println("zzzzz-zzzzz-zzzzz");
	}

	public void ignore() {
		System.out.println("no reaction");		
	}


	public void scratch() {
		System.out.println("Cat sharpens it claws");
	}

	public void jump() {
		System.out.println("Cat jumps in a box");
	}

	public void chaseLaser() {
		System.out.println("Cat tries to catch the laser dot!");
	}

	
	private void look() {
		System.out.println("Awww, this cat wants more food.");
	}

	public void purr() {
		System.out.println("purrr-purrr-purr");
	}
	
	public void eat() {
		System.out.println("cat eats");
	}
	
	public void meow() {
		System.out.println("meow-meow");		
	}
}
