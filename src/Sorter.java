public class Sorter {

    public static void selectionSort(int[] arr)
    {
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            // swap numbers if needed
            if (i != currentMinIndex)
            {
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr)
   {
       // note: we start with 1 instead of 0
       for (int i = 1; i < arr.length; i++)
       {
           int curNumber = arr[i];

           // Set index to be place to the left
           int curIndex = i-1;

           // We are still inbounds and the current number
           // is less than the current index
           while ( curIndex >= 0 && arr[curIndex] > curNumber)
           {
               // Shift the value at curIndex to the right one place
               arr[curIndex+1] = arr[curIndex];
               curIndex--;
           }

           // Put this number in the proper location
           arr[curIndex + 1] = curNumber;
       }
   }

	public static void mergeSort(int[] arr) {

		// Base case length 1
		if (arr.length == 1) {
			return;
		}

		// Split in halves
		int mid = arr.length / 2; // Find middle

		// Create two new arrays
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		// Fill left half
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		// Fill right half
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[i + mid];
		}

		// Recursive calls
		mergeSort(left);
		mergeSort(right);

		// Merge the halves
		merge(arr, left, right);
	}

	public static void merge(int[] arr, int[] left, int[] right) {
		//Look at first element and take smaller
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		//Copy remaining when 1 array is empty
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}


}
