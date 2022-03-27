public class RunTest{
	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Harry Potter");
		st.setHeight(170.1);
		st.setID(1);
		StudentView stv = new StudentView();
		StudentContoller stc = new StudentContoller(st,stv);
		stc.printInfo();
		System.out.println("----------------------------------");
		stc.setName("LeBron James");
		stc.printInfo();

	}
}