package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 13/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description :
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.

*/

public class Question10 {
    public static void main(String[] args) {
        long limit = 2000000L, sum = 0;
        for (long count = 2; count <= limit; count++) {
            if (isPrime(count)) {
                sum = sum + count;
                System.out.println(count);
            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(long num) {
        if (num < 1)
            return false;
        else if (num < 4)
            // for 2 and 3
            return true;
        else if (num % 2 == 0)
            return false;
        else if (num < 9)
            // for 5 and 7
            return true;
        else if (num % 3 == 0)
            return false;
        else {
            for (long next = 2; next <= Math.sqrt(num); next++) {
                if (num % next == 0)
                    return false;
            }
            return true;
        }
    }
}
