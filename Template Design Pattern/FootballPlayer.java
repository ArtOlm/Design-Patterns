public class FootballPlayer extends AthleteRoutine{
	@Override
	public void practice(){
		System.out.println("09:00 Practice game at football stadium");
	}
	@Override
	public void run(){
		System.out.println("06:30 Running 3 miles");
	}
	@Override
	public void liftWeights(){

		System.out.println("14:00");
		System.out.println("	Bench Press(4 sets of 10, last set to failure)");
		System.out.println("	Incline Dumbbell Bench Press (3 sets of 8)");
		System.out.println("	Military Press (3 sets of 8-10)");
		System.out.println("	Shrugs(3 sets of 20)");
		System.out.println("	Cable Crossover (3 sets of 6-8)");
		System.out.println("	Dumbbell Fly (3 sets of 8)");
		System.out.println("	Alternating Dumbbell Curls (3 sets of 8-10)");
		System.out.println("	Triceps Dip (3 sets of 10)");
	}
	@Override
	public void individualCoaching() {
		System.out.println(
			"	Quarterback: Coach Shrek\n" +
			"	Running Back: Coach Flona\n" +
			"	Wide Receiver: Coach Ginerbread\n" +
			"	Tight End: Coach Woody\n" +
			"	Left Guard: Coach Buzz\n" +
			"	Right Guard: Coach Baloo\n" +
			"	Center: Coach Simba\n" +
			"	Left Tackle: Coach Genie");
	}
}