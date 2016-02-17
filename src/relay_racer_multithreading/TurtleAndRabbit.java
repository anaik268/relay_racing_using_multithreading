package relay_racer_multithreading;

/*
 * This is an example from a youtube video on multi-threading. The code was modified 
 * for my own understanding. You can find the video at the following location:
 * Link: https://www.youtube.com/watch?v=O_Ojfq-OIpM
 * 
 */
public class TurtleAndRabbit implements Runnable {
	public static String winner;
	public int distance;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		TurtleAndRabbit.beginRace();
	}

	public static void beginRace() {
		for (int i = 0; i <= 100; i++) {
			if (isRaceWon(i))
				break;
			System.out.println(Thread.currentThread().getName() + " has covered " + i + " meters");
		}
	}

	public static boolean isRaceWon(int distance) {
		if (TurtleAndRabbit.winner == null && distance == 100) {
			String winnerName = Thread.currentThread().getName();
			TurtleAndRabbit.winner = winnerName;
			System.out.println(Thread.currentThread().getName() + " has won the race!");
			return true;
		}
		if (TurtleAndRabbit.winner != null)
			return true;
		return false;
	}

}
