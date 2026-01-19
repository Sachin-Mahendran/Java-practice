package SecondLargest.OptimizedApproach;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int first=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                first=arr[i];
            }
        }
        System.out.println(first);
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>second&&arr[i]<first)
            {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
