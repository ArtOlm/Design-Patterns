import java.util.Random;
public class RunTest{
	public static void main(String[] args) {

		SortAlgo bubbleSort = new BubbleSort();
		SortAlgo selectionSort = new SelectionSort();
		SearchAlgo linear = new LinearSearch();
		SearchAlgo binary = new BinarySearch();
		//setting the algorithms
		IntegerArrayList myList = new IntegerArrayList(bubbleSort,binary);
		Random r = new Random();
		//note my implemetation is not commplete and has many flaws
		//this is jsut an example, I do not feel like implementing a whole working arraylist
		System.out.println("Unsorted");
		for(int i = 0;i < 100;i++){
			myList.add(r.nextInt(200) + 1);
		}
		myList.print();
		myList.sort();
		System.out.println("Sorted");
		myList.print();
		System.out.println("Search for 3 " + myList.search(3));
		System.out.println("Search for 10 " + myList.search(10));
		System.out.println("Search for 100 " + myList.search(100));
		System.out.println("Search for 21 " + myList.search(21));
	}
}