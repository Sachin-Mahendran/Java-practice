package RemoveDuplicatesInSpace;
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
        int start=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[start]=arr[i];
                start++;
            }
        }for(int i=0;i<start;i++){
        System.out.print(arr[i]+" ");}
    }
}
