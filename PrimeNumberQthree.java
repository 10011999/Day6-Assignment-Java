package DaySixJavaAssignment;

public class PrimeNumberQthree {
    public static void main(String[] args) {
        int i;
        int count = 0;
        int numberForPrimeCheck = 1;
        while (count < 1) {
            int flag = 0;
            numberForPrimeCheck++;
            for (i = 2; i <= numberForPrimeCheck / 2; i++) {
                if (numberForPrimeCheck % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        System.out.println(numberForPrimeCheck);
    }
}
