public class StudentContoller{
	private Student st;
	private StudentView stv;
	public StudentContoller(Student st,StudentView stv){
		this.st = st;
		this.stv = stv;
	}
	public void setName(String name){
		st.setName(name);
	}
	public void setHeight(double height){
		st.setHeight(height);
	}
	public void setWeight(double weight){
		st.setWeight(weight);
	}
	public void setHairColor(String hairColor){
		st.setHairColor(hairColor);
	}
	public void printInfo(){
		stv.printInfo(st.getName(),st.getHeight(),st.getID());
	}
}