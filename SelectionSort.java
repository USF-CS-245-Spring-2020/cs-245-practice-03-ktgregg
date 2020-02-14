public class SelectionSort implements Practice03Sort
{
    public void sort(int[] a)
    {
        for (int i = 0; i < a.length -1; i++) // iterates through all elements, except last element in the array
        {
            //finds a min
            int min = i;
            for (int x = i+1; x < a.length; x++)
            {
                if (a[x] < a[min])
                {
                    min = x;
                }
            }

            // swaps current index with the min value
            int tempValue = a[min];
            a[min] = a[i];
            a[i] = tempValue;
        }
    }
}
