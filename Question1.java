package ProjectEuler;
/*
Author : Ashutosh Kumar
Date : 10/04/20
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Friday
Description : If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/


class Question1
{
    public static void main(String[] args)
    {

        //variable declaration
        int count = 3,sum=0;

        // for every number until 1000
        while(count<1000)
        {
            // if divided by 3 or 5
            if(count%3 ==0 || count%5==0)
                sum=sum+count;
            count++;
        }

        System.out.println(sum);
    }
}