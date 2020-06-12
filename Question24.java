package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 23/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Thursday
Description :
A permutation is an ordered arrangement of objects.
For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
*/

public class Question24
{
    public static void main(String[] args)
    {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int count=0,seconddigit=0, nineFactorial = 362880,eightfactroial = 40320,sum=0;
        for (int i = 0; i < arr.length ; i++)
        {

           if((i*nineFactorial)>1000000)
           {
               count=i;
               sum=sum+(i*nineFactorial);
               break;
           }
        }
        count-=1;
        for (int i = sum; i < 1000000; i++)
        {
            if(sum+eightfactroial>1000000)
            {
                seconddigit++;
                break;
            }
        }

        System.out.println(count+seconddigit);
    }
}
