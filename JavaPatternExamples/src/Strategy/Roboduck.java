package Strategy;

public class Roboduck extends Duck {

	public Roboduck () {
		this.fly_behavior = new FlyWithRocket();
		this.quack_behavior = new QuackScreech();
	}
	@Override
	public String display() {
		return "I AM ROBODUCK! SUBMIT! SUBMIT!";
	}

}
