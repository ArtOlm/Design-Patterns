import java.util.ArrayList;
class RosterCollection implements Collections{
	ArrayList<String> roster; 
	public RosterCollection(){
		this.roster = new ArrayList<String>();
	}
	public Iterator createIterator(){
		return new RosterIterator(this.roster);

	}
	public void add(Object obj){
		roster.add(obj.toString());
	}

}