import java.util.*;
public class floydsTriangle {
    public class rightangledTriangle {
      public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int f=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(f+" ");
            f++;
        }
        
        System.out.println();
    }
}
}
}
