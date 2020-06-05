package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 14/04/20
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Tuesday
Description :
The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

What is the greatest product of four adjacent numbers in the same
direction (up, down, left, right, or diagonally) in the 20×20 grid?

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question11 {
    public static void main(String[] args) throws IOException {
        int arr[][] = new int[20][20];

        // Creating file object
        File file = new File("src/Question11inputfile.txt");
        //Buffered Reader for fast read
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        String[] splited;
        int row = 0;
        while ((st = br.readLine()) != null) {
            splited = st.split(" ");
            for (int coloumn = 0; coloumn < 20; coloumn++) {
                arr[row][coloumn] = Integer.parseInt(splited[coloumn]);
                System.out.print(arr[row][coloumn] + " ");
            }
            System.out.println();
            row++;
        }
        print2DArray(arr);
        System.out.println(getMaxValue(arr));
    }

    static void print2DArray(int arr[][]) {
        for (int row = 0; row < 20; row++) {
            for (int coloumn = 0; coloumn < 20; coloumn++) {
                System.out.print(arr[row][coloumn] + " ");
            }
            System.out.println();
        }
    }

    static long getMaxValue(int arr[][])
    {
        long max = 0, product = 1;
        for (int row = 0; row < 20; row++)
        {
            for (int coloumn = 0; coloumn < 20; coloumn++)
            {
                //right side
                if ((coloumn + 3) < 20)
                {
                    product = arr[row][coloumn] * arr[row][coloumn + 1] * arr[row][coloumn + 2] * arr[row][coloumn + 3];
                    if (product > max)
                        max = product;
                }

                //down side
                if ((row + 3) < 20) {
                    product = arr[row][coloumn] * arr[row + 1][coloumn] * arr[row + 2][coloumn] * arr[row + 3][coloumn];
                    if (product > max)
                        max = product;
                }

                //diagonal side
                if ((row + 3) < 20 && (coloumn + 3) < 20)
                {
                    product = arr[row][coloumn] * arr[row + 1][coloumn + 1] * arr[row + 2][coloumn + 2] * arr[row + 3][coloumn + 3];
                    if (product > max)
                        max = product;
                }

                //down right
                if ((row + 3) < 20 && coloumn >=3)
                {
                    product = arr[row][coloumn] * arr[row + 1][coloumn-1] * arr[row + 2][coloumn - 2] * arr[row + 3][coloumn - 3];
                    if (product > max)
                        max = product;
                }
            }
        }
        return max;
    }
}