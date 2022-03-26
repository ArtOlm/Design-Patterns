import java.util.ArrayList;

class RosterIterator implements Iterator{
	ArrayList<String> roster;
	int idx;
	RosterIterator(ArrayList<String> r){
		this.roster = r;
		idx = 0;

	}
	public boolean hasNext(){
		if(roster.size() <= idx){
			return false;
		}
		else{
			return true;
		}
	}
	public Object next(){
		String name = roster.get(idx);
		idx++;
		return name;

	}
}