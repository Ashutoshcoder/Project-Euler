package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 01/05/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,May,Friday
Description :
*/

public class Question37
{
    public static void main(String[] args)
    {
        int number = 0,reverseNumberOf=0,digit=0;
        for (int i = 10; i < 1000000; i++)
        {
            if(checkForEachDigit(i))
            {
                System.out.println(i);
                number=number+i;
            }
        }
        System.out.println(number);
    }

    static boolean checkForEachDigit(int n)
    {
        String num = String.valueOf(n);
        int numOf = num.length()-1,copy=n;
        numOf = (int)Math.pow(10,numOf);

        while(copy!=0)
        {
            if(isPrime(copy))
                copy=copy%numOf;
            else
                return false;

            numOf=numOf/10;
        }

        while (n!=0)
        {
            if(isPrime(n))
                n=n/10;
            else
                return false;
        }
        return true;
    }

    static boolean isPrime(long num) {
        if (num <= 1)
            return false;
        else if (num < 4)
            // for 2 and 3
            return true;
        else if (num % 2 == 0)
            return false;
        else if (num < 9)
            // for 5 and 7
            return true;
        else if (num % 3 == 0)
            return false;
        else {
            for (long next = 2; next <= Math.sqrt(num); next++) {
                if (num % next == 0)
                    return false;
            }
            return true;
        }
    }

}
