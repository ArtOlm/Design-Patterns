class Roster{
	RosterCollection roster;
	public Roster(){
		roster = new RosterCollection();
	}
	public void printRoster(){
		RosterIterator rIt = (RosterIterator)roster.createIterator();
		while(rIt.hasNext()){
			System.out.println(rIt.next().toString());
		}

	}
	public void addToRoster(String name){
		roster.add(name);

	}
}