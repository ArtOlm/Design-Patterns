public class TDPRunTest {
	public static void main(String[] args) {
		AthleteRoutine bPlayer = new BasketballPlayer();

		System.out.println("<Daily Routine For Basketball Player>");
		bPlayer.printSchedule();

		AthleteRoutine fPlayer = new FootballPlayer();

		System.out.println();
		System.out.println("<Daily Routine For Football Player>");
		fPlayer.printSchedule();

	}
}