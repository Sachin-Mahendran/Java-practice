import java.util.Scanner;

public class palindromeAlphabetPyramid {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
         for(int j=1;j<=n-i;j++)
        {
            System.out.print("  ");
        }
         int a=65;
        
        for(int k=1;k<=i;k++)
        {
            
            System.out.printf("%c ",a);
            a++;
        }
         for(int d=63+i;d>64;d--)
        {
            System.out.printf("%c ",(d));
        }
        System.out.println();
    }
        
    }
}
