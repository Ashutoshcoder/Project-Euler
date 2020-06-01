package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 10/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Friday
Description : Largest Prime Factor of 600851475143
*/

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args)
    {
        long number= 600851475143L,count=2L,largestDivisor=0L;
        while (number>1)
        {
            if(number%count == 0)
            {
                number = (number / count);
                largestDivisor = count;
                count=2L;
            }
            else
                count+=1;
        }
        System.out.println(largestDivisor);
    }

    static boolean isPrime(long num)
    {
        for (int count = 2; count <= Math.sqrt(num); count++)
            if (num % count == 0)
                return false;
        return true;
    }
}
