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

		System.out.println("14:00 Workout:");
		System.out.println("	Bench Press(4 sets of 10, last set to failure)");
		System.out.println("	Incline Dumbbell Bench Press (3 sets of 8)");
		System.out.println("	Military Press (3 sets of 8-10)");
		System.out.println("	Shrugs(3 sets of 20)");
		System.out.println("	Cable Crossover (3 sets of 6-8)");
		System.out.println("	Dumbbell Fly (3 sets of 8)");
		System.out.println("	Alternating Dumbbell Curls (3 sets of 8-10)");
		System.out.println("	Triceps Dip (3 sets of 10)");
	}
}