public class BinaryIterativeSearch implements Practice03Search
{
    @Override
    public int search(int[] arr, int target)
    {
        int minIndex = 0; // lower bound index
        int maxIndex = arr.length -1; // upper bound index
        while (minIndex < maxIndex) //iterates through while the upper is higher than the lower
        {
            int median = (minIndex+maxIndex)/2;
            if (target == arr[median]) // if the target is found, return the index where the target is located
            {
                return median;
            }
            else if (target < arr[median]) // if the target is lower than the midpoint
            {
                maxIndex = median - 1;
            }
            else // if the target is higher than the midpoint
            {
                minIndex = median + 1;
            }
        }

        return -1;
    }

}
