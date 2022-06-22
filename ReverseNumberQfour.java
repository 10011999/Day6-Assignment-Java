package DaySixJavaAssignment;

public class ReverseNumberQfour {
    public static void main(String[] args) {
        int num=123,rev=0,remain;
        System.out.println("print a reverse");
        while (num != 0){
            remain = num % 10;
            num = num / 10;
            rev = rev * 10 + remain;
        }
        System.out.println("reverse no is: " +rev);
    }
}
