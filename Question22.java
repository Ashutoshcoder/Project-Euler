package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 22/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Wednesday
Description :
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order,
COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/

import java.io.*;
import java.math.BigInteger;

public class Question22
{
    public static void main(String[] args) throws IOException {
        // Creating file object
        File file = new File("src/Question22inputfile1.txt");
        //Buffered Reader for fast read
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        BigInteger totalsum= BigInteger.valueOf(0);
        int count=1,sum =0;
        while ((st = br.readLine()) != null)
        {
            sum=0;
            for (int index = 1; index < st.length()-1; index++)
                sum+=(int)st.charAt(index)-64;

            totalsum = totalsum.add(BigInteger.valueOf(count * sum));
            count++;
        }
        System.out.println(totalsum);
    }
}
