package Strategy;

public abstract class Duck {
	public FlyBehavior fly_behavior;
	public QuackBehavior quack_behavior;
	
	public String performFly(){
		return fly_behavior.fly();
	};
	
	public String performQuack() {
		return quack_behavior.quack();
	};
	
	public String swim() {
		return "All ducks swim, even decoys!";
	}
	
	public void setFlyBehavior (FlyBehavior b) {
		this.fly_behavior = b;
	}
	
	public void setQuackBehavior (QuackBehavior b) {
		this.quack_behavior = b;
	}
	
	public abstract String display();
}
