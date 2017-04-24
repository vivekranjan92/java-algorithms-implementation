class LinearSearching
{
    static void search(int arr[], int n, int x)
    {
        boolean isFound = false;
        for (int i = 0;i<n;i++)
        {
            if(arr[i]==x)
            {
                System.out.println(i);  
                isFound = true;
                break;
            }
            

        }
        if(!isFound)
        System.out.println("number which you are looking for is not found!");
    }


    public static void main(String[] args)
    {
        int arr[] = {5,2,4,7,1,3,9,0};
        search(arr,8,37);
    }
}
