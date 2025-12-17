import java.util.Scanner;

public class palindromeNumberedTriangle {
     public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print("  ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print(k+" ");
        }
        for(int d=i-1;d>=1;d--)
        {
            System.out.print(d+" ");
        }
        System.out.println();
    }
}
}

