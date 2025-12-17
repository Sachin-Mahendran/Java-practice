import java.util.Scanner;
public class hallowPyramid {
     public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            if(j==1||j==i||i==n)
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
