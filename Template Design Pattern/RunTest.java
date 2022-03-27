public class RunTest{
	public static void main(String[] args) {
		BasketballPlayer bPlayer = new BasketballPlayer();
		System.out.println("Daily Routine For Basketball Player");
		System.out.println("-----------------------------------");
		bPlayer.wakeUp();
		bPlayer.eatMeal();
		bPlayer.practice();
		bPlayer.run();
		bPlayer.liftWeights();
		bPlayer.goToSleep();
		FootballPlayer fPlayer = new FootballPlayer();
		System.out.println("Daily Routine For Football Player");
		System.out.println("---------------------------------");
		fPlayer.wakeUp();
		fPlayer.eatMeal();
		fPlayer.practice();
		fPlayer.run();
		fPlayer.liftWeights();
		fPlayer.goToSleep();
	}
}