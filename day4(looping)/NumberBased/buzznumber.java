package NumberBased;

import java.util.Scanner;
public class buzznumber {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n%7==0||n%10==7)
    {
        System.out.println("buzz num");
    }
    else
    {
        System.out.println("not buzz number");
    }
}
}