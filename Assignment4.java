package Assignments;

public class Assignment4
    {
        public static void main(String args[])
        {
            int arr[]={10, 201, 1024, -50, 5, 40};
            sortArray(arr,arr.length);
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            
        }
        public static void sortArray(int arr[],int n)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
   
        }
   
       
   }