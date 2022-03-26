public class CarAdapter implements Phone{
	private Car car;
	public CarAdapter(Car c){
		this.car = c;

	}
	public void ring(){
		car.honk();

	}

}