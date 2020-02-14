public class BinaryRecursiveSearch implements Practice03Search
{

    @Override
    public int search(int [] arr, int target)
    {
        int index = binSearch(arr, target, 0, arr.length-1);
        return index;
    }

    public int binSearch(int [] arr, int target, int min, int max){

        if(min > max) // if no match is found. base case
        {
            return -1;
        }

        int mid = (min + max) / 2; // calculate midpoint

        if(arr[mid] == target) // if target is found, return index of target
        {
            return mid;
        }
        else if (arr[mid] > target) // if target is lower than midpoint, recursively call binsearch on the "lower side" of the array
        {
            return binSearch(arr, target, min, mid - 1);
        }
        else // if target is higher than midpoint, recursively call binsearch on the "upper side" of the array
        {
            return binSearch(arr, target, mid + 1, max);
        }
    }
}
