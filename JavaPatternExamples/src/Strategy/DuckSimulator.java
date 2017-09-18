package Strategy; 

public class DuckSimulator {
	
	public static void presentDuck(Duck duck) {
		System.out.println(duck.display());
		System.out.println(duck.performFly());
		System.out.println(duck.performQuack());
		System.out.println();
	}
	public static void main (String [] args) {
		System.out.println("Welcome to Duck Simulator!");
		
		Duck mallard = new Mallard(); 
		presentDuck(mallard);
		
		Duck roboduck = new Roboduck();
		presentDuck(roboduck);
	}
}
