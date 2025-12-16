package DigitBased;

import java.util.Scanner;

public class charactersOfDigits {
     public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char ch=0;
        int t=n;
        int c=0;
         while(t>0)
        {
            c=t%10;
            t=(t*10)+c;
            t/=10;
        }
        while(t>0)
        {
            int d=n%10;
            switch(d)
            {
                case 1->
                    System.out.println("one");
                    case 2->
                    System.out.println("two");
                    case 3->
                    System.out.println("three");
                    case 4->
                    System.out.println("four");
                    case 5->
                    System.out.println("five");
                    case 6->
                    System.out.println("six");
                    case 7->
                    System.out.println("seven");
                    case 8->
                    System.out.println("eight");
                    case 9->
                    System.out.println("nine");
                    default->
                    System.out.println("zero");     
            }
            t/=10;
        }
    }
}
