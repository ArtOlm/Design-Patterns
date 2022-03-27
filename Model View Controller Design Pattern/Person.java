public abstract class Person{
	private String name;
	private double height;
	private double weight;
	private String hairColor;

	public void setName(String name){
		this.name = name;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setHairColor(String hairColor){
		this.hairColor = hairColor;
	}
	public String getName(){
		return this.name;
	}
	public double getHeight(){
		return this.height;
	}
	public double getWeight(){
		return this.weight;
	}
	public String getHairColor(){
		return this.hairColor;
	}
}