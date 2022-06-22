package DaySixJavaAssignment;

import java.util.Scanner;

public class FibonacciSeriesQone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int count = sc.nextInt();
        int a=0,b=1,c,e;
        System.out.println(a+" "+b);
        for(e=2;e<=count;e++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
