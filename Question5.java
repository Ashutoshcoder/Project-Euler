package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 11/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Saturday
Description : 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Question5 {
    public static void main(String[] args) {
        for (int next = 2000; ; next++) {
            if (next % 20 == 0) {
                if (next % 11 == 0 && next % 13 == 0 && next % 17 == 0 && next % 19 == 0) {
                    if (next % 16 == 0 && next % 18 == 0 && next % 15 == 0) {
                        if (next % 14 == 0) {
                            System.out.println(next);
                            break;
                        }
                    }
                }
            }
        }
    }
}
