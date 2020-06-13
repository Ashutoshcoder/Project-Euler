package ProjectEuler;
/*
Author : Ashutosh Kumar
Date : 24/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Friday
Description :
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the factorial of their digits.
Note: as 1! = 1 and 2! = 2 are not sums they are not included.

*/

public class Question34
{
    public static void main(String[] args) {
        long sum=0;
        for (long i = 3; i < 50000; i++)
        {
            if(isSumOfDigitFactorial(i)) {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }

    static boolean isSumOfDigitFactorial(long num)
    {
        int fact []= {1,1,2,6,24,120,720,5040,40320,362880};
        long digit = 0,sum=0,copy=num;
        while(num!=0)
        {
            digit= num%10;
            sum += fact[(int) digit];
            num=(int)num/10;
        }
        return sum==copy;
    }
}
