package lek14;

interface RatBrain extends Brain, Pet {};

class Hungry implements RatBrain {

	Rat rat;
	
	public Hungry(Rat rat) {
		this.rat = rat;
	}
	
	@Override
	public void feed() {
		rat.squeak();
		rat.chew();
		rat.chew();
		rat.sleep();
		rat.brain = new Fed(rat);
	}

	@Override
	public void play() {
		rat.bite();
		rat.squeak();
		rat.hide();
	}
	
}

class Fed implements RatBrain {
	
	Rat rat;
	
	public Fed(Rat rat) {
		this.rat = rat;
	}
	
	@Override
	public void feed() {
		rat.squeak();
		rat.hide();
	}
	
	@Override
	public void play() {
		rat.squeak();
		rat.trick();
		rat.climb();
		rat.brain = new Hungry(rat);
	}
	
}

public class Rat implements Pet {
	
	RatBrain brain = new Hungry(this);

	@Override
	public void feed() {
		brain.feed();
	}

	@Override
	public void play() {
		brain.play();
	}
	
	public void squeak() {
		System.out.println("pi - pi");
	}
	
	public void chew() {
		System.out.println("chews");
	}
	
	public void sleep() {
		System.out.println("zzzz-zzz-zzz");		
	}
	
	public void hide() {
		System.out.println("Rat hid in its cage");
	}
	
	
	public void bite() {
		System.out.println("Rat just bit you");
	}

	public void trick() {
		System.out.println("Whoa! Rat just did a backflip!");		
	}
	
	
	
	
	public void climb() {
		System.out.println("Rat is climbing on your shoulder");
	}
}
