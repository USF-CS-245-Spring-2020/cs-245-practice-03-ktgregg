public class LinearSearch implements Practice03Search
{

    @Override
    public int search(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++) //iterate through each element of the array
        {
            if (arr[i] == target) // return a match, if it is found
            {
                return i;
            }
        }
        return -1;
    }
}
