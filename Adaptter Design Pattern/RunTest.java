public class RunTest{
	public static void main(String[] args) {
		//generic car
		Car myCar = new Mustang();
		System.out.println("Car is Honking");
		myCar.honk();
		//generic phone
		Phone myPhone = new IPhone();
		System.out.println("Phone is ringing");
		myPhone.ring();
		//both interfaces functionality are joined
		Phone wierdPhone = new CarAdapter(myCar);
		//the car functionality and the phone functionality are joined
		System.out.println("Phone is ringing");
		wierdPhone.ring();
	}
}