package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 21/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Tuesday
Description :
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?


*/

import java.util.Scanner;

public class Question19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //extra days in the month % 7
        int[] arr ={0,3,0,3,2,3,2,3,3,2,3,2,3};

        int countOfSundays = 0,sum=1;

        // Julian day calculating of 1900
        for (int i = 1; i < arr.length; i++)
                sum+=arr[i];

        //getting 1st day's julian day of 1901
        sum = sum%7;
        System.out.println("Year 1901  =  "+sum);

        // Sahi hai

        // for year 1 Jan 1901 to 31st Dec 2000
        for (int index = 1901; index < 2001; index++)
        {
            // If leap year
            arr[2]+=isLeapYear(index);

            // For every month 1st day
            for (int month = 1; month < arr.length; month++)
            {
                //checking if 1st month of the day is sunday
                if (sum % 7 == 0)
                    countOfSundays += 1;

                sum = sum + arr[month];
            }
            sum=sum%7;
            arr[2]=28;
        }
        System.out.println("No of Sundays"+countOfSundays);
    }

    static int isLeapYear(int year)
    {
        // if year mod 4
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    return 1;
                else
                    return 0;
            }
            else
                return 1;
        }
        else
            return 0;
    }
}
