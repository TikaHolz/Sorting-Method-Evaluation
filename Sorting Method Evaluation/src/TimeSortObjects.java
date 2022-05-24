import java.util.ArrayList;
public class TimeSortObjects
	{
	static ArrayList<TimeSort> list = new ArrayList<TimeSort>();
	public static void fillList()
	{
	list.add(new TimeSort(Runner.mSum, "Merge Sort"));
	list.add(new TimeSort(Runner.iSum, "Insertion Sort"));
	list.add(new TimeSort(Runner.qSum, "Quick Sort"));
	list.add(new TimeSort(Runner.sSum, "Selection Sort"));
	list.add(new TimeSort(Runner.bSum, "Bubble Sort"));
	}
	
	}
