/*
* created by vivek ranjan singh on 04/24/2017
*/
class Binary
{
    int binarySearch(int arr[], int l, int r, int x)
    {
        if(r>=l)
        {
            int mid = l +(r-1)/2;

            if(arr[mid] == x)
            {
                return mid;
            }
            if(arr[mid]>x)
            {
                return binarySearch(arr, 1, mid-1, x);
            }
            else
            {
                return   binarySearch(arr, mid+1, r, x);
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Binary obj = new Binary();
        int arr[] = {1,2,8,23,65,69,89};
        int n = arr.length;
        int x = 69;
        int result = obj.binarySearch(arr, 0, n-1,x);
        if(result==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index : " + result);
        }
    }
}

// time complexity of binary searching is O(logn)