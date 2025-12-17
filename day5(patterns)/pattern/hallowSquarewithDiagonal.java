import java.util.*;
public class hallowSquarewithDiagonal {
     public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i==1||j==1||i==n||j==n||i+j==n+1||i==j)
            System.out.print("* ");
        else{
            System.out.print("  ");
        }
        }
        System.out.println();
    }
}}
