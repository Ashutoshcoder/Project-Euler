package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 25/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Saturday
Description :
The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime,
contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?

*/

public class Question50
{
    public static void main(String[] args)
    {
        int max =0,sum=2,lastPrime=2,currentPrime;
        for (int i = 3; i <=100 ; i++)
        {
            if(isPrime(i))
            {
                currentPrime = i;
                if(currentPrime-lastPrime<3) {
                    sum+=currentPrime;
                    System.out.println(currentPrime);
                }
                else {
                    sum=0;
                }

                if(sum>max) {
                    max=sum;
                }
                lastPrime = currentPrime;
            }
        }
        System.out.println(max);
    }

    static boolean isPrime(int num)
    {
        // for 2 and 3
        if (num < 4)
            return true;
        else if (num % 2 == 0)
            return false;
        else if (num < 9)
            // for 5 and 7
            return true;
        else if (num % 3 == 0)
            return false;
        else {
            for (long next = 2; next <= Math.sqrt(num); next++)
            {
                if (num % next == 0)
                    return false;
            }
            return true;
        }
    }
}
