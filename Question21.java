package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 21/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Tuesday
Description :
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/

public class Question21
{
    public static void main(String[] args)
    {
        int factorOfFirstNumber, factorOfSecondNumber, sum = 0;
        for (int count = 1; count < 10000; count++)
        {
            factorOfFirstNumber = amicablePair(count);
            factorOfSecondNumber = amicablePair(factorOfFirstNumber);

            if ((count == factorOfSecondNumber) && (factorOfFirstNumber!=count))
            {
                System.out.println(factorOfFirstNumber+"  "+factorOfSecondNumber);
                sum += count;
            }
        }
        System.out.println(sum);
    }
    static int amicablePair(int num)
    {
        int sumof = 0;
        for (int i = 1; i <num ; i++)
        {
            if (num % i == 0)
                sumof += i;
        }
        return sumof;
    }
}
