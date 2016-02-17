package relay_racer_multithreading;

public class MutithreadingMain {

	public static void main(String[] args) {
		System.out.println("This program is to practice multithreading concept in programming.");
		TurtleAndRabbit race = new TurtleAndRabbit();
		Thread t1 = new Thread(race, "Rabbit");
		Thread t2 = new Thread(race, "Turtle");
		t1.start();
		t2.start();
		
	}

}
