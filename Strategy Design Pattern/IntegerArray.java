public abstract class IntegerArray{
	public SearchAlgo search;
	public SortAlgo sort;
	public int[] array;
	//array is set to 100 I can make it more dynamic
	//but im feeling a bit lazy
	public IntegerArray(SortAlgo sort,SearchAlgo search){
		this.sort = sort;
		this.search = search;
		this.array = new int[100];
	}
	public int search(int val){
		return this.search.search(this.array,val);
	}
	public void sort(){
		this.sort.sort(this.array);
	}
	public void insert(int idx,int val){
		this.array[idx] = val;
	}


}