
public class BubbleSort
	{
		// An optimized version of Bubble Sort
		static void bubbleSort(int arr[], int n)
		    {
		    int i, j, temp;
		    boolean swapped;
		    for (i = 0; i < n - 1; i++)
		        {
		        swapped = false;
		        for (j = 0; j < n - i - 1; j++)
		            {
		            if (arr[j] > arr[j + 1])
		                {
		                 // swap arr[j] and arr[j+1]
		                 temp = arr[j];
		                 arr[j] = arr[j + 1];
		                 arr[j + 1] = temp;
		                 swapped = true;
		                }
		            }
		 
		        // IF no two elements were
		        // swapped by inner loop, then break
		        if (swapped == false)
		          break;
		        }
		    }
	}
		 
		
		
 
//		    static void bubbleSort(int[] arr) {  
//		        int n = arr.length;  
//		        int temp = 0;  
//		         for(int i=0; i < n; i++){  
//		                 for(int j=1; j < (n-i); j++){  
//		                          if(arr[j-1] > arr[j]){  
//		                                 //swap elements  
//		                                 temp = arr[j-1];  
//		                                 arr[j-1] = arr[j];  
//		                                 arr[j] = temp;  
//		                         }  
//		                          
//		                 }  
//		         }  
//		  
//		    }
//		    
			
