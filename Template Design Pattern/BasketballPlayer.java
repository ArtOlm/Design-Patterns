public class BasketballPlayer extends AthleteRoutine{
	@Override
	public void practice(){
		System.out.println("9:00 Practicing shots at the inside basketball court");
	}
	@Override
	public void run(){
		System.out.println("6:30 Running 2 miles");
	}
	@Override
	public void liftWeights(){
		System.out.println("14:00 Workout:");
		System.out.println("	Back Squats: 3 sets of 12-15 reps");
		System.out.println("	Leg Press: 3 sets of 12-15 reps");
		System.out.println("	Lunges: 3 sets of 12-15 reps with each leg");
		System.out.println("	Romanian Deadlifts: 3 sets of 12-15 reps");
		System.out.println("	Calf Raises: 3 sets of 15-20 reps.");
	}
}