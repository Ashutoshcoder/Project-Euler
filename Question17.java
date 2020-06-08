package ProjectEuler;/*
Author : Ashutosh Kumar
Date : 19/04/20 
Email : ashutoshkumardbms@gmail.com
Published on : 2020,April,Sunday
Description :
*/

public class Question17
{
    public static void main(String[] args)
    {
        String digitsArray [] = {"","one","two","three","four","five","six","seven","eight","nine",
                "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen"
                ,"nineteen"};

        String multiples [] = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String hunthousand [] = {"hundred","thousand"};

        long count = 0;
        int leftdigits=0;
        String number="";

        for (int index = 1; index < 1001; index++)
        {
            number="";
            if(index<20)
                number = digitsArray[index];

            else if(index>=20 && index<100)
                number = multiples[index/10]+digitsArray[index%10];

            else if(index>=100 && index<1000) {
                number = digitsArray[index / 100];
                leftdigits = index % 100;

                if(index%100!=0)
                {
                    if(leftdigits<20)
                        number += hunthousand[0] + "and" + digitsArray[leftdigits];
                    else
                        number+=hunthousand[0]+"and"+multiples[leftdigits/10]+digitsArray[leftdigits%10];
                }
                else
                    number+=hunthousand[0];
            }

            else
                number = digitsArray[1]+hunthousand[1];

            System.out.println(number);
            count = count+number.length();
        }

        System.out.println(count);
    }
}
