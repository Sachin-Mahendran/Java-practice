import java.util.Scanner;

public class reverseHallowPyramid {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=n;i>0;i--)
    {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            if(k==1||k==n||i==n||k==i)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}