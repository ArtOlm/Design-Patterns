public class LinearSearch implements SearchAlgo{
	public int search(int[] array,int val){
		int idx = -1;
		for(int i = 0;i < array.length;i++){
			if(array[i] == val){
				idx = i;
				break;

			}
		}
		return idx;
	}
}