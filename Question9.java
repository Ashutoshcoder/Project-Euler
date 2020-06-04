package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 14/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Tuesday
Description :
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class Question9
{
    public static void main(String[] args)
    {
        int c,sum=1000;
        for (int avalue = 0; avalue < sum/3; avalue++)
        {
            for (int bvalue = 0; bvalue < sum/2 ; bvalue++)
            {
                c= sum-avalue-bvalue;
                if(avalue*avalue + bvalue*bvalue == c*c)
                {
                    System.out.println(avalue+"  "+bvalue+" "+c);
                    System.out.println("Product "+(avalue*bvalue*c));
                    break;
                }
            }
        }

    }
}

