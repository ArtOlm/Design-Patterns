public class BubbleSort implements SortAlgo {
	public void sort(int[] array){
		int temp;
		for(int i = 0;i < array.length ;i++){
			for(int j = 0;j < array.length - 1;j++){
				if(array[j] > array[j + 1]){
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}

	}
	
}