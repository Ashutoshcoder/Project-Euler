package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 16/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Thursday
Description : Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question13 {
    public static void main(String[] args) throws IOException
    {
        // Creating file object
        File file = new File("src/Question13inputfile.txt");
        //Buffered Reader for fast read
        BufferedReader br = new BufferedReader(new FileReader(file));

        String number1 = br.readLine();
        String number2 = br.readLine();
        String finalOutput = addTwoStrings(number1, number2), nextNumber = "";

        while ((nextNumber = br.readLine()) != null)
            finalOutput = addTwoStrings(finalOutput, nextNumber);

        //printing the 1st 10 digits
        System.out.println(finalOutput.substring(0, 10));
    }

    static String addTwoStrings(String num, String num2) {
        int firstnum, secondnum, thirdnum = 0, remainder = 0, quotient = 0;
        String returnValue = "";

        // for 2 different sized numbers
        int indexforFirstString = num.length() - 1;
        int indexforSecondString = num2.length() - 1;

        // running loop for minimum one
        for (int index = Math.min(indexforFirstString, indexforSecondString); index > -1; index--, indexforFirstString--, indexforSecondString--)
        {
            //extracting character
            firstnum = Integer.parseInt(String.valueOf(num.charAt(indexforFirstString)));
            secondnum = Integer.parseInt(String.valueOf(num2.charAt(indexforSecondString)));

            //reaching last index
            if (index == 0)
            {
                int maxi = Integer.parseInt(num.substring(0, indexforFirstString + 1)) + Integer.parseInt(num2.substring(0, indexforSecondString + 1));
                maxi = maxi + quotient;
                returnValue = maxi + returnValue;
                return returnValue;
            }

            // for the remaining indexes
            thirdnum = thirdnum + secondnum + firstnum;

            remainder = thirdnum;
            quotient = 0;

            if ((thirdnum > 9))
            {
                remainder = thirdnum % 10;
                quotient = thirdnum / 10;
            }

            //appending to the string
            thirdnum = quotient;
            returnValue = remainder + returnValue;
        }
        return returnValue;
    }
}
