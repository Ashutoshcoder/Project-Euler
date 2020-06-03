package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 12/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Sunday
Description :
The sum of the squares of the first ten natural numbers is,

12+22+...+102=385
The square of the sum of the first ten natural numbers is,

(1+2+...+10)2=552=3025
Hence the difference between the sum of the squares of the first ten natural numbers and
the square of the sum is 3025−385=2640.

Find the difference between the sum of the squares of the first one hundred natural
numbers and the square of the sum.

*/

public class Question6
{
    public static void main(String[] args)
    {
        long sum = 0L, sum_of_squares = 0L;
        for (int next = 1; next <= 100; next++)
        {
            int square = next*next;
            sum_of_squares = sum_of_squares+square;
        }
        sum = ((100*101)/2);
        sum = sum*sum;
        System.out.println(sum-sum_of_squares);
    }
}
