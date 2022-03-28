public abstract class AthleteRoutine{
	//template for the routine of an athlete
	public AthleteRoutine(){}

	public void wakeUp(){
		System.out.println("06:00 Wake up");
	}

	public abstract void run();

	public void breakFast(){
		System.out.println("07:30 Eat breakfast");
	}

	public abstract void practice();

	public void lunch(){System.out.println("012:00 Eat lunch");	}

	public abstract void liftWeights();

	public void dinner(){System.out.println("17:00 Eat Dinner");}

	public abstract void individualCoaching();

	public void goToSleep(){
		System.out.println("22:30 Bed time");
		System.out.println("	Today's pain will be tomorrow's glory!!");
	}

	public void printSchedule(){
		System.out.println("-----------------------------------");
		wakeUp();
		run();
		breakFast();
		practice();
		lunch();
		liftWeights();
		dinner();
		individualCoaching();
		goToSleep();
	}
}