package ProjectEuler;
/*
Author : Ashutosh Kumar
Date : 20/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description :

Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
*/

public class Question30
{
    public static void main(String[] args)
    {
        long sum = 0;
        for (int next = 2; next < 1000000; next++)
        {
            if(sumofdigits(next))
            {
                sum = sum+next;
                System.out.println(next);
            }
        }
        System.out.println(sum);
    }

    static boolean sumofdigits(int num)
    {
        int sum=0, copy = num,digit;
        while (num!=0)
        {
            digit = num%10;
            sum += (int)Math.pow(digit,5);
            num = num/10;
        }
        return copy==sum;
    }
}
