import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
public class Runner
	{
	//all variables
	static int arraySize = 0;
	static int simulationSize = 0;
	static int [] elements;
	static double [] qTimes;
	static double [] mTimes;
	static double [] bTimes;
	static double [] iTimes;
	static double [] sTimes;
	static double  qSum;
	static double  mSum;
	static double  bSum;
	static double  iSum;
	static double  sSum;
	static int [] sSortArray;
	static int [] iSortArray;
	static int [] mSortArray;
	static int [] qSortArray;
	static int [] bSortArray;
	static int [] tempArray;
	static double qFinalTime; 
	static double mFinalTime;
	static double bFinalTime;
	static double iFinalTime;
	static double sFinalTime;	

		public static void main(String[] args)
			{
			howMany();
			qTimes = new double [simulationSize];
			mTimes = new double [simulationSize];
			bTimes = new double [simulationSize];
			iTimes = new double [simulationSize];
			sTimes = new double [simulationSize];
			//new array with the size of the array
			for(int i = 0; i< simulationSize; i++)
				{
			//calling all sorters
			CallAllSorters.insertionSortTime();
			CallAllSorters.selectionSortTime();
			CallAllSorters.mergeSortTime();
			CallAllSorters.quickSortTime();
			CallAllSorters.selectionSortTime();
			//calculating final time
			qFinalTime = ((CallAllSorters.qEndTime - CallAllSorters.qStartTime)/simulationSize);
			mFinalTime = ((CallAllSorters.mEndTime - CallAllSorters.mStartTime)/simulationSize);
			bFinalTime = ((CallAllSorters.bEndTime - CallAllSorters.bStartTime)/simulationSize);
			iFinalTime = ((CallAllSorters.iEndTime - CallAllSorters.iStartTime)/simulationSize);
			sFinalTime = ((CallAllSorters.sEndTime - CallAllSorters.sStartTime)/simulationSize);
			//filling the final times array with the time from each simulation
			qTimes [i] = qFinalTime;
			mTimes [i] = mFinalTime;
			bTimes [i] = bFinalTime;
			iTimes [i] = iFinalTime;
			sTimes [i] = sFinalTime;
			//summing it all up
			qSum = qSum + qTimes[i];
			mSum = mSum + mTimes[i];
			bSum = bSum + bTimes[i];
			iSum = iSum + iTimes[i];
			sSum = sSum + sTimes[i];
				}
			qSum = (qSum/simulationSize)*1000;
			mSum = (mSum/simulationSize)*1000;
			bSum = (bSum/simulationSize)*1000;
			iSum = (iSum/simulationSize)*1000;
			sSum = (sSum/simulationSize)*1000;
			
			TimeSortObjects.fillList();
			Collections.sort(TimeSortObjects.list, new TimeSorter());
			//System.out.println(TimeSortObjects.list.size());
			for(TimeSort t: TimeSortObjects.list)
				{
				System.out.println(t.getSorting() + "     " + t.getTime());	
				}
			}		
		//how many simulations and array size 
		//asking for parameters
		public static void howMany()
			{
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("How many simulations would you like to run?");
			simulationSize = userIntInput.nextInt();
			System.out.println("What size array?");
			arraySize = userIntInput.nextInt();
			elements = new int[arraySize];
				for(int a = 0; a < arraySize; a++)
					{
					int randomNum= ((int)(Math.random() *99));	
					elements[a] = randomNum;
					}
				sSortArray = elements;
				iSortArray = elements;
				mSortArray = elements;
				qSortArray = elements;
				bSortArray = elements;
			System.out.println();
			//printing the number of simulations
			System.out.println("Number of Simulations: " + simulationSize);
			//array size printed out
			System.out.println("Array Size : " + arraySize);
			System.out.println();
			}
	}
