package Strategy;

public class Mallard extends Duck{

	public Mallard() {
		this.fly_behavior = new FlyWithWings();
		this.quack_behavior = new Quack();
	}
		
	public String display() {
		return "I'm a Mallard Duck!";
	}
}
