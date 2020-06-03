package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 12/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Sunday
Description : By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/

public class Question7 {
    public static void main(String[] args) {
        int count = 0;
        for (long next = 2; count <= 10001; next++) {
            if (isPrime(next))
            {
                System.out.println(next+"   "+count);
                count++;
            }
        }
    }

    static boolean isPrime(long n) {
        if(n%2==0)
            return false;

        for (int next = 2; next <= Math.sqrt(n); next++) {
            if (n % next == 0)
                return false;
        }
        return true;
    }
}
