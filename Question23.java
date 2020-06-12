package ProjectEuler;

/*
Author : Ashutosh Kumar
Date : 23/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Thursday
Description :
A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that
28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant
if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number
that can be written as the sum of two abundant numbers is 24. By mathematical analysis,
it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers.
However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest
number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
=4179871

20161 -  Upper range for all non-abundant numbers
*/


public class Question23
{
    static int lengthOfArray = 28123;
    static  boolean arr[] = new boolean[lengthOfArray+1];

    public static void main(String[] args)
    {
        int totalsum=0,abundant = 0,other_part=0;

        for (int i = 2; i < arr.length; i++)
            arr[i]=isAbundant(i);

        for (int i = 1; i <= 20161; i++)
        {
            if(!(isSumofAbudant(i)))
            {
                totalsum+=i;
                System.out.println(i+" is not ");
            }
        }

        System.out.println(totalsum);

    }


    static boolean isSumofAbudant(int numo)
    {
        for (int i = 0; i <= numo; i++)
        {
            if(arr[i] && (arr[numo-i]))
                return true;
        }
        return false;
    }

    static boolean isAbundant(int num)
    {
        int sum =1;
        int largest = (int)Math.sqrt(num);
        if(largest*largest == num)
            sum+=largest;
        else
            largest+=1;

        for (int i = 2; i < largest ; i++)
        {
            if(num%i==0)
            {
                sum+=i;
                sum+=(int)num/i;
            }
        }
        return sum>num;
    }
}
