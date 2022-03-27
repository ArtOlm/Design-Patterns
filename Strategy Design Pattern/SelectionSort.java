public class SelectionSort implements SortAlgo{
	public void sort(int[] array){
		int minIdx;
		int temp;
		for(int i =0;i < array.length;i++){
			minIdx = i;
			for(int j = i;j < array.length;j++){
				if(array[minIdx] > array[j]){
					minIdx = j;
				}
			}
			temp = array[i];
			array[i] = array[minIdx];
			array[minIdx] = temp;
		}
	}

}