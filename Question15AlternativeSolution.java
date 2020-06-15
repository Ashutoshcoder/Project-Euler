package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 19/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Sunday
Description :
*/

public class Question15AlternativeSolution
{
    public static void main(String[] args)
    {
        int gridsize = 20;
        long paths = 1;

        //selecting n elements from 2n possibilities
        for (int i = 0; i < gridsize; i++)
        {
            //multiplying by gridsize for 2n!
            paths *= (2 * gridsize) - i;

            //dividing by n!
            paths /= i + 1;
        }
        System.out.println(paths);
    }

    static long calculateFactorial(int num) {
        long number = 1;
        for (int i = 1; i <= num; i++) {
            number = number * i;
        }
        return number;
    }
}
