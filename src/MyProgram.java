import java.util.ArrayList;

public class MyProgram {

    public static void main(String[] args) {
        int[] testArray;
        long startTime, endTime;
        int arraySize = 20000;

        // SELECTION SORT
    
        // Make array
        

        // Record start time
        startTime = System.currentTimeMillis();
        
        // Sort array using selectionSort static method
        
        
        // Record end time
        endTime = System.currentTimeMillis();

        // Print out results
        System.out.println("Selection Sort: " + (endTime - startTime) + "ms");
        

        // SAME FOR INSERTION SORT
        
        // SAME FOR MERGE SORT
    }

    /**
     * This method returns an array in random order
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number.
     */

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }
}
