package ProjectEuler;

/*
Author : Ashutosh Kumar
Date : 19/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Sunday
Description :
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?

*/

/*
Solution :
1. Multiplying Digits by 2 follows the same rules as basic multiplication
2. if (digit * 2) >= 10 then an overflow occurred
3. carry over (digit*2)/10 to the next digit and keep (digit*2 mod 10)
4. We must carry over at most 1 and instead of mod 10 we can have minus 10
*/

public class Question16
{
    public static void main(String[] args)
    {
        int sum = 0;

        // wild guess for no of digits
        // try with array size of 6 and loop i with limit as 15 or 10 to be surprised.
        int arr[] = new int[400];

        //initialize the 1st part
        arr[0] = 2;
        int carry = 0;

        // for the power which we need to raise
        for (int i = 1; i < 1000; i++)
        {
            //Walking till length of array
            for (int j = 0; j < arr.length; j++)
            {
                int tempno = arr[j] * 2;

                // if the value goes over 10
                if (tempno > 9)
                {
                    arr[j] = (tempno % 10) + carry;
                    carry = 1;
                }

                // if the values lies under 10
                else {
                    arr[j] = tempno + carry;
                    carry = 0;
                }
            }
        }

        //printing digits in reverse order
        for (int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j]+"   ");
            sum += arr[j];
        }

        //printing sum of digits
        System.out.println("Sum  = " + sum);
    }
}
