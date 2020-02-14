public class BubbleSort implements Practice03Sort
{
    public void sort(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (a[j] > a[j+1])
                {
                    swap(a,i,j); // swaps
                }
            }
        }
    }

    void swap(int[] a, int i, int j)
    {
        // swap arr[j+1] and arr[i]
        int temp = a[j];
        a[j] = a[j+1];
        a[j+1] = temp;
    }
}
