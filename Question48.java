package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 25/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Saturday
Description :
he series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
*/

public class Question48
{
    public static void main(String[] args)
    {
       long result = 0,temp;

        // Fot last 10 digits
        long modulo = 10000000000L;

        for (int i = 1; i <= 1000; i++)
        {
            temp = i;
            for (int j = 1; j < i; j++)
            {
                //multiplying no until we get it' s power
                temp *= i;

                // since only last 10 digits are required then we need to modulo
                temp %= modulo;
            }

            // Add the remaining into the result and then again modulo for last 10 digits
            result += temp;
            result %= modulo;
        }

        System.out.println(result);
    }
}
