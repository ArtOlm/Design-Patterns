public class IntegerArrayList extends IntegerArray{
	private int currLimit;
	private boolean[] accessed;
	int pos;
	public IntegerArrayList(SortAlgo sort,SearchAlgo search){
		super(sort,search);
		this.currLimit = 100;
		this.array = new int[currLimit];
		this.accessed = new boolean[currLimit];
		this.pos = 0;
	}
	//adds to the next unaccessed idx
	public void add(int val){
		if(pos == this.currLimit){
			this.currLimit = this.currLimit * 2;
			int[] t = new int[this.currLimit];
			for(int i = 0;i < this.array.length;i++){
				t[i] = this.array[i];
			}
			this.array = t;
		}
		this.array[pos] = val;
		pos++;
		
	}
	public void print(){
		for(int i = 0;i < this.array.length;i++){
			System.out.println(this.array[i]);
		}
	}
}