package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 11/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Saturday
Description : A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Question4 {
    public static void main(String[] args)
    {
        int product=1, max =0;
        for(int count = 999;count>100;count--)
        {
            for (int i = 999; i > 100 ; i--)
            {
                product= i*count;
                if(isPallindrome(product))
                {
                    if(product>max)
                        max = product;
                }
            }
        }
        System.out.println(max);
    }

    static boolean isPallindrome(int number) {
        int sum = 0, digit = 0, copy = number;
        //checking pallindrome
        while (number != 0) {
            //last digit
            digit = number % 10;

            // reversing number
            sum = sum * 10 + digit;

            number = (int) number / 10;
            //removing last digit
        }
        return copy == sum;
    }
}
