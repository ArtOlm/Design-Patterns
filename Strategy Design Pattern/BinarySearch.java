public class BinarySearch implements SearchAlgo{
	public int search(int[] array,int val){
		return bsearch(array,val,0,array.length - 1);
	}
	public int bsearch(int[] array,int val, int lowerBound,int upperBound){
		int half = (int)((upperBound + lowerBound) / 2);
		if(val == array[half]){
			return half;
		}
		else if(lowerBound > upperBound){
			return -1;
		}
		else if(val > array[half]){
			return bsearch(array,val,half + 1,upperBound);
		}
		else{
			return bsearch(array,val,lowerBound,half - 1);
		}

	}
}