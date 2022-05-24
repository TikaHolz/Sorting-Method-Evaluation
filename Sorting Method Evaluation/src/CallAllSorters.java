
public class CallAllSorters
	{
	//all statics
	//merge sort time
	static double mStartTime;
	static double mEndTime;
	//quick sort time
	static double qStartTime;
	static double qEndTime;
	//selection sort time
	static double sStartTime;
	static double sEndTime;
	//bubble sort time
	static double bStartTime;
	static double bEndTime;
	//insertion sort time
	static double iStartTime;
	static double iEndTime;
	
	
	//merge sort timer
	public static void mergeSortTime()
		{
		//merge sort time calculator
		mStartTime =System.currentTimeMillis();
		for (int i = 0; i < Runner.simulationSize; i++) 
			{
			MergeSort.mergeSort(Runner.mSortArray, Runner.arraySize);
			}	
		mEndTime =System.currentTimeMillis();
		}	
	//Quick sort timer
	public static void quickSortTime()
		{
		//quicksort time calculator
		qStartTime =System.currentTimeMillis();
		for (int i = 0; i < Runner.simulationSize; i++) 
			{
			QuickSort.qSort(Runner.qSortArray);
			}
		qEndTime =System.currentTimeMillis();
		}
	//selection sort timer
	public static void selectionSortTime()
			{
			//selecton sort time calculator
			sStartTime =System.currentTimeMillis();
			for (int i = 0; i < Runner.simulationSize; i++) 
				{
				SelectionSort.selectionSort(Runner.sSortArray);
				}	
			sEndTime =System.currentTimeMillis();
			}
	//insertion sort timer
	public static void insertionSortTime()
			{
			//insertion sort time calculator
			iStartTime =System.currentTimeMillis();
			for (int i = 0; i < Runner.simulationSize; i++)
				{
				InsertionSort.insertionSort(Runner.iSortArray);
				}
			iEndTime =System.currentTimeMillis();
			}
	//Bubble sort timer
	public static void BubbleSortTime()
			{
			//bubble time calculator
			bStartTime =System.currentTimeMillis();
			for (int i = 0; i < Runner.simulationSize; i++) 
				{
				BubbleSort.bubbleSort(Runner.bSortArray, Runner.arraySize);
				}
			bEndTime =System.currentTimeMillis();
			}
	}
