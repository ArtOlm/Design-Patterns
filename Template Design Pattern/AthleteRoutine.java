public abstract class AthleteRoutine{
	//template for the routine of an athlete
	public AthleteRoutine(){}

	public void wakeUp(){
		System.out.println("The Athlete woke up");
	}
	public void eatMeal(){
		System.out.println("The athlete eats breakfast");
	}
	public abstract void practice();
	public abstract void run();
	public abstract void liftWeights();
	public void goToSleep(){
		System.out.println("The athlete goes to sleep, to recover for the next day");
	}
}