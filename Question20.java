package ProjectEuler;

/*
Author : Ashutosh Kumar
Date : 20/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Monday
Description :
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

public class Question20
{
    public static void main(String[] args)
    {
        //Array with rough estimation for number of digits using sterling approximation
        int[] digitsOfHundreadfactorial = new int[200];

        // base = 10 for decimal division
        int i, first_digit,num=100;

        //carry in case number> 10, product is what we get after we multiply 2 numbers
        int carry, replace, product;

        //First digit keeps track of the position of the 'most significant digit' in the array -
        //where the trailing zeroes end.
        first_digit = 0;

        //If we don't do this, the answer will be 0.
        digitsOfHundreadfactorial[first_digit] = 1;

        //This while loop calculates num! and stores it in number[]
        while(num != 1)
        {
             //This block performs multiplication of number[] with the current
             // value of num and stores the result in num
             //The multiplication is done like how we normally do it by hand.

            carry = 0;
            // loop will run till no of digits in the value
            for(i = 0; i <= first_digit; i++)
            {
                product = num*digitsOfHundreadfactorial[i] + carry;

                //Replace is what should be rewritten in the ith digit
                replace = product%10;

                //Carry needs to be added when num is multiplied with the next most significant digit
                carry = product/10;

                //The ith digit of number is rewritten now as the product%base we're working in. This case - 10
                digitsOfHundreadfactorial[i] = replace;
                System.out.print(replace+"  ");

                //If there is a carry in the MSB,
                //then the number of digits will increase. For example, 112x10 = 1120.
                //There is a carry in the MSB.
                if((i == first_digit) && (carry > 0))
                    first_digit++;
            }
            num--;
        }

        int sum = 0;
        for(int value : digitsOfHundreadfactorial) {
            sum += value;
        }
        System.out.println(sum);
    }
}
