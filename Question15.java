package ProjectEuler;

/*
Author : Ashutosh Kumar
Date : 19/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Sunday
Description :
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
137846528820

*/

public class Question15 {
    public static void main(String[] args) {
        int gridsize = 20, row=0, coloumn=0;
        gridsize += 1;
        long[][] arr = new long[gridsize][gridsize];

        //initializing array
        for (row = 0; row < gridsize; row++) {
            for (coloumn = 0; coloumn < gridsize; coloumn++) {
                arr[row][coloumn] = 1;
                System.out.print(arr[row][coloumn]);
            }
            System.out.println();
        }

        int size = gridsize-1;
        // Adding all paths possible from bottom to top
        for (row = size-1; row >= 0; row--)
        {
            for (coloumn = size-1; coloumn >= 0; coloumn--)
            {
                arr[row][coloumn] = arr[row + 1][coloumn] + arr[row][coloumn + 1];
            }
        }

        System.out.println(arr[0][0]);

        //printing array
        for (row = gridsize - 1; row >= 0; row--) {
            for (coloumn = gridsize - 1; coloumn >= 0; coloumn--) {
                System.out.print(arr[row][coloumn] + " ");
            }
            System.out.println();
        }

    }
}
