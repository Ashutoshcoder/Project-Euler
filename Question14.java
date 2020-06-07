package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 19/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Sunday
Description :
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class Question14
{
    public static void main(String[] args)
    {
        //variables
        int max = 0,numberwithLongestSequence=1000000, value;

        //Loop for reverse counting
        for(int i = 1000000; i > Math.sqrt(numberwithLongestSequence) ; i--)
        {
            value = returnCountOfTerms(i);
            //returning count of terms

            if(value>max)
            {
                //checking value
                max = value;
                numberwithLongestSequence = i;
            }
        }
        System.out.println(numberwithLongestSequence);
    }

    static int returnCountOfTerms(int value)
    {
        //counting terms
        int counter=0;
        while (value!=1)
        {
            if((value & 1) == 0)
                value/=2;
            else
                value=(3*value)+1;
            counter+=1;
        }
        return counter;
    }
}



