package ProjectEuler;
/*
Author : Ashutosh Kumar
Date : 21/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Tuesday
Description :
By starting at the top of the triangle below and moving to adjacent numbers on the row below,
the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

*/

import java.io.*;

public class Question18
{
    public static void main(String[] args) throws IOException
    {
        // Creating file object
        File file = new File("src/Question18inputfile.txt");

        //Buffered Reader for fast read
        BufferedReader br = new BufferedReader(new FileReader(file));

        //getting count of lines
        int numberOfLinesInTheFile = countNumberOfLines(file);

        System.out.println("Count of lines"+numberOfLinesInTheFile);

        //creating an array for it
        int arr[][] = new int[numberOfLinesInTheFile][numberOfLinesInTheFile];

        String str;
        String[] linepieces;
        int row = 0;

        //reading file for feeding array
        while ((str = br.readLine()) != null)
        {
            //each line split by space
            linepieces = str.split(" ");

            //reading each line into array
            for (int coloumn = 0; coloumn < linepieces.length ; coloumn++)
            {
                arr[row][coloumn] = Integer.parseInt(linepieces[coloumn]);
            }
            row++;
        }
        print2DArray(arr);

        //Dynamic Programming approach to solve The maximum value which is coming at arr[0][0]
        //Starting from lines - 2
        for (row = (numberOfLinesInTheFile-2); row >=0 ; row--)
        {
            for (int coloumn = 0; coloumn <= row; coloumn++)
            {
                arr[row][coloumn] += Math.max(arr[row+1][coloumn],arr[row+1][coloumn+1]);
            }
        }

        System.out.println("Total Sum="+arr[0][0]);
    }

    static int countNumberOfLines(File file) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int count=0;
        while ((br.readLine()) != null)
            count++;
        return count;
    }

    static void print2DArray(int arr[][])
    {
        int length = arr.length;

        // Printing array
        for (int[] ints : arr)
        {
            for (int coloumn = 0; coloumn < length; coloumn++) {
                System.out.print(ints[coloumn] + " ");
            }
            System.out.println();
        }
    }

}
